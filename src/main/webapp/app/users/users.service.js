(function(angular) {
	'use strict';
	angular.module('users').service('UsersService', UsersService);

	UsersService.$inject = [ '$http', '$q' ];

	function UsersService($http, $q) {

		function getPromise(httpConfig) {
			var defer = $q.defer;
			var promise = defer.promise;
			promise = $http(httpConfig);
			return promise;
		}
		
		function selectAll() {
			var config = {
				method : 'get',
				url : '/users/list',
				params : {}
			};

			return getPromise(config);
		}

		function searchUser(text) {
			var config = {
				method : 'get',
				url : '/users/search',
				params : {
					'filtro' : text
				}
			};

			return getPromise(config);
		}
		
		return {
			searchUser: searchUser,
			selectAll: selectAll
		};
	}
}(angular));