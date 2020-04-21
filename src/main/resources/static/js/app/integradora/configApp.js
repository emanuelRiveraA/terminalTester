'use strict'
angular.module('configModule', [])
    .controller('configController', function($scope, $http, $window){

        $scope.config = {};

        $scope.configs = [];

        // Función para obtener un listado de todos los customers
        function listConfig(){
            $http.get('/config/list').then(
                (response) => {


                    console.log(response.data);
                    $scope.configs = response.data;

                },
                (response) => {

                });

        }

        $scope.save = (config) => {

            $http.post('/config/save', configs).then(
                (response) => {

                    $window.alert('Alumno creado con éxito');

                },
                (response) => {

                    $window.alert(response.status);
                   // $window.alert($scope.alumno.nombre);

                }
            );

        }

       /*   $scope.miFormulario = {};
          $scope.funcionRecogeFormulario = function() {

                var datosFormulario = $scope.miFormulario;

                var nombre = datosFormulario.nombre;

                $http.post(
                  '/alumno/save', datosFormulario
                )
                .success(function(data){
                  $window.alert(nombre);
                })
                .error(function(data){
                  alert('Se ha producido un error')
                });
          }*/


       listConfig();



    });