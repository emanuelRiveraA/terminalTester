'use strict'
angular.module('numPtModule', [])
    .controller('numPtController', function($scope, $http, $window){


        $scope.parte ={
                id : null,
             custpn : null,
            caracter : null,
        };

        $scope.parts = [];

        // Función para obtener un listado de todos los customers
        function listNumparte(){
            $http.get('/numParte/list').then(
                (response) => {

                    console.log(response.data);
                    $scope.parts = response.data;

                },
                (response) => {

                });

        }

        $scope.add = (parte) => {

            $http.post('/numParte/save', parte).then(
                (response) => {

                    $window.alert('Componente '+ $scope.parte.custpn +' creado con éxito');
                 listNumparte();
                },
                (response) => {

                    $window.alert(response.status);
                    $window.alert($scope.parte.custpn);

                }
            );

        }
        //funcion para eliminar un regid¿stro
        $scope.delete = (parte)=>{

            const conf=$window.confirm('Esta seguro de eliminar el componente'+ ' ' + parte.custpn);
if (conf){

  $http.delete('/numParte/delete/'+ parte.id,parte).then((response)=>{
   listNumparte();
  });


}


        }




        listNumparte();



    });