var usersApp = angular.module('usersApp',[]);

var pubController = usersApp.controller('usersController',['$scope','$http',
             function($scope,$http) {
				$scope.publications     = [];
				$scope.orderingCriteria = 'email';
				$scope.email       		= true;
				$scope.filterCriteria   = "";
				$http.get('http://localhost:8080/users/').then(
					function(response) {
						$scope.publications = response.data;
						$scope.dataLoaded = true;
					},
					function(response) {
						$scope.dataLoaded = false;
					}
				);
					$scope.changeCriteria = function(criteria) {
					$scope.orderingCriteria = criteria;
				};
}
])