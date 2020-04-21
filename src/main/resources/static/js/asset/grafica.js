'use strict'
angular
  .module("app", ['chart.js']) // Le decimos que usaremos a chart.js
  .controller("ControladorPrincipal", function($scope,$http,$window) {

     $scope.listComponente = function(componente){

                          $http.get('/comp/get7/'+componente.code ).then(
                                   (response) => {

                                      $scope.myData = response.data;
                                      console.log($scope.myData);
                                      var string = $scope.myData.toString();

                                      var produc_oden = string.split(',');
                                      var acum =0;
                                      var cantidad = 0;
                                      var referencia="";

                                          for(var key in $scope.myData){
                                            console.log($scope.myData[key][1]);
                                            console.log($scope.myData[key][2]);

                                          cantidad=$scope.myData [key][2];

                                            acum +=  cantidad
                                            referencia +=  $scope.myData [key][1]+ '  '  ;

                                          }

                                             //    alert(cantidad)
                                           //   $scope.code7en = ['Producción Orden  '+produc_oden[0]];
                                            //      $scope.series = [referencia];

                                             //       $scope.datos = [
                                              //          [acum]
                                               //      ];

                          $http.get('/registro/getR7/'+componente.code ).then(
                                   (response) => {

                                   $scope.myData1 = response.data;
                                                        console.log($scope.myData1);
                                     var string = $scope.myData1.toString();
                                     var produc_oden1 = string.split(',');
                                     var acum1 =0;
                                     var cantidad1 = 0;
                                     var referencia1="";

                                        for(var key in $scope.myData1){
                                           console.log($scope.myData1[key][1]);
                                           console.log($scope.myData1[key][2]);
                                            cantidad1=$scope.myData1 [key][2];
                                            acum1 +=  cantidad1
                                            referencia1 +=  $scope.myData1 [key][1]+ ' :'  ;
                                          }

                                //    alert(cantidad)
                                $scope.code7en = ['Ref por Producción Orden '+referencia,'Referencia Validada: '+referencia1];
                                   $scope.series = [produc_oden[0]];

                              //  alert(referencia+referencia1)
                                      $scope.datos = [acum,acum1,0];

                                                },

                                                (response) => {
                                                    alert("Verifica tu produccion orden");
                                                });

                                   },


                                   (response) => {
                                      alert("Verifica tu produccion orden");
                                  });



              }


  });