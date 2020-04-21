angular
  .module("app", ['chart.js']) // Le decimos que usaremos a chart.js
  .controller("ControladorPrincipal", ["$scope", function($scope) {
    $scope.etiquetas = ['2006', '2007', '2008', '2009'];
    $scope.series = ['Ventas', 'Gastos'];

    $scope.datos = [
      [65, 59, 80, 81],
      [28, 48, 40, 19]
    ];
  }]);