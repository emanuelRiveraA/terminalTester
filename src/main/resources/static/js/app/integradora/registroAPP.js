'use strict'
angular.module('regModule', [])
    .controller('regController', function($scope, $http, $window){

        $scope.registro ={};

        $scope.registros = [];

        // Función para obtener un listado de todos los customers
        function listRegistro(){
            $http.get('/registro/list').then(
                (response) => {

                    console.log(response.data);
                    $scope.registros = response.data;

                },
                (response) => {

                });

        }

        $scope.add = (registro) => {

            $http.post('/registro/save', registro).then(
                (response) => {

                    $window.alert('Componente creado con éxito');
                 listRegistro();
                },
                (response) => {

                    $window.alert(response.status);
                    $window.alert($scope.registro.custpn);

                }
            );

        }
        //funcion para eliminar un regid¿stro
        $scope.delete = (registro)=>{

            const conf=$window.confirm('Esta seguro de eliminar a el alumno'+ ' ' + registro.custpn);
if (conf){

  $http.delete('/registro/delete/'+ registro.id,registro).then((response)=>{
   listRegistro();
  });


}


        }




        listRegistro();



    });