var app = angular.module('AddFiguraApp', []);
 
app.controller('AddFiguraCtrl', [ '$scope', '$http',

   function($scope, $http) {
	
		$scope.msg = '';
                       		
        $scope.addFigura = function() {
        	$http.post('http://localhost:8080/users/Israel/figures', 
        		{
        			expansion 	: $scope.expansion,
					nombre     	: $scope.nombre,
					estado     	: $scope.estado
				}
			).success(function(data) {
				$scope.msg = 'Figura creada correctamente';
			}).error(function(data) {
				$scope.msg = 'Se ha producido un error';
			});
		}
	} 
]);