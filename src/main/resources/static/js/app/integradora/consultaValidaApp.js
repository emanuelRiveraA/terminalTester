'use strict'

angular.module('consultaModule', [])

    .controller('consultaController', function($scope, $http, $window){

         $scope.conductividad = "";

        $scope.componente = {
            codeen: null,
            elitem:null,
            custpn: null,
            descripcion: null
        }

         $scope.componentes = [];

        // Función para obtener un listado de todos los componentes
        function listComponentes(){

            $http.get('/componente/list').then(
                (response) => {


                    console.log(response.data);
                    $scope.componentes = response.data;

                },
                (response) => {

                });

        }

        //funcion para traer el componente y mandarlo al validador
        $scope.listComponente = function(componente){

            //comparar();
            if(!$scope.componente.codeen.$valid && !$scope.componente.elitem.$valid){

              $http.get('/comp/get/'+componente.codeen+','+componente.elitem).then(
                 (response) => {

                    $scope.myData = response.data;
                    console.log($scope.myData);
                    var string = $scope.myData.toString();

                    var letra = string.split(',');
                     //alert("la letra es: "+letra[1]);
                     $scope.componente = {
                        codeen: componente.codeen,
                        elitem: componente.elitem,
                        custpn: letra[0]
                     }

                     //valida que los campos no esten vacios
                     if(letra[0].length != 0){

                         $http.get('/arduino/'+letra[1]).then(
                           (response) => {
                                 $('#ModalValidador').modal('show'); // abrir
                                 console.log(response.data);

                            },
                           (response) => {

                           });

                         seleccionarPosicion(letra[1]);
                      }else{
                        alert("VERIFICA LOS DATOS!!!");
                      }

                 },
                 (response) => {
                    alert("no jalo");
                });
               }

        }

        $scope.botonVisibididad=false;
        $scope.getConductividad = function(componente){

                    console.log("componente",componente);

                    $scope.botonVisibididad=true;

                    $http.get('/getConductividad').then(
                        (response) => {

                            //var conductividad = JSON.stringify(response.data);
                            //alert(conductividad);
                            //var conductividad = "";
                            for (var i in response.data) {
                               $scope.conductividad  = response.data[i];
                            }
                            //console.log(response.data);
                            if($scope.conductividad  == "true"){
                                //alert("El arnés es valido");

                                $scope.componente.descripcion = "Terminal válida";

                                $scope.status={
                                    valido:"¡La terminal es válida!",
                                    noValido:""
                                }

                            }else{
                                //alert("El arnes no es valido");

                                $scope.componente.descripcion = "Terminal no válida";

                                $scope.status={
                                    valido:"",
                                    noValido:"¡La terminal no es válida!"
                                }

                            }

                        },
                        (response) => {
                            alert("error");
                        });

         }

        $scope.add = (componente) => {

                     console.log("componente",componente);

                     $http.post('/registro/save', componente).then(
                         (response) => {

                             $window.alert('Componente guardado con éxito');
                             $window.location = "/principal";
                         },
                         (response) => {

                             $window.alert(response.status);
                             $window.alert($scope.registro.custpn);

                         }
                     );

          }

        $scope.save = (componente) => {
        alert("ffffzzfz");

            $http.post('/componente/save', componentes).then(
                (response) => {

                    $window.alert('Alumno creado con éxito');

                },
                (response) => {

                    $window.alert(response.status);
                   // $window.alert($scope.alumno.nombre);

                }
            );

        }

        $scope.query = (componente) => {

            $window.alert(componente.vr);


            $http.get('/componente/query/{codeen}').then((response) => {



            });


        };



       //listComponentes();

        //metodo para checar igualacion
         function comparar() {
             $scope.areequal = angular.equals($scope.componente.codeen, $scope.componente.elitem);
             if( $scope.areequal == true){
                alert("VERIFICA LOS DATOS!!!");
             }
          };


    });
