(function(angular){
    'use strict';
    angular.module('users').controller('UsersController', UsersController);
    
    UsersController.$inject = ['UsersService'];
    
    function UsersController(UsersService) {
    	var vm = this;
    	vm.isSearching = false;
    	vm.searchUser = searchUser;
    	vm.isEmptyText = isEmptyText;
    	
    	function selectAll() {
    		vm.isSearching = true;
    		UsersService.selectAll()
    		.then(
    			function(response){
    				vm.data = response.data;
                },

                function(response){
                }
    		).finally(
    		    function(response){
    		    	vm.isSearching = false;
                }
            );
    	}
    	
    	function isEmptyText() {
    		if (vm.text == '') {
    			selectAll();
    		}
    	}
    	
    	function searchUser() {
    		vm.isSearching = true;
    		vm.search = angular.copy(vm.text);
    		UsersService.searchUser(vm.text)
    		.then(
    			function(response){
    				vm.data = response.data;
                },

                function(response){
                }
    		).finally(
    		    function(response){
    		    	vm.isSearching = false;
                }
            );
    	}
    	
    	selectAll();
    }
}(angular));