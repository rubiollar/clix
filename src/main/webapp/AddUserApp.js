var app = angular.module('AddUserApp', []);
 
app.controller('AddUserCtrl', [ '$scope', '$http',

   function($scope, $http) {
	
		$scope.msg = 'Debes completar los 3 campos para crear un nuevo usuario';
                       		
        $scope.addPerson = function() {
        	$http.post('http://localhost:8080/users/', 
        		{
        			email 		: $scope.email,
        			username    : $scope.username,
					password   	: $scope.password
				}
			).success(function(data) {
				$scope.msg = 'Usuario creado correctamente';
			}).error(function(data) {
				$scope.msg = 'Se ha producido un error';
			});
		}
	} 
]);