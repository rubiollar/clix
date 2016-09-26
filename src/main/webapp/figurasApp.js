var figurasApp = angular.module('figurasApp',[]);

var pubController = figurasApp.controller('figurasController',['$scope','$http',
             function($scope,$http) {
				$scope.publications     = [];
				$scope.orderingCriteria = 'expansion';
				$scope.expansion       	= true;
				$scope.filterCriteria   = "";
				$http.get('http://localhost:8080/users/Israel/figures/').then(
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