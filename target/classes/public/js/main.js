angular.module('myApp', []).controller('namesCtrl', function ($scope, $http) {
    $http.get('/dresses').
    then(function(response) {
        $scope.names = response.data;
        $scope.showDetails=false;
        $scope.showTable=true;
        $scope.showAddButton=true;
    });

    $scope.orderByMe = function (x) {
        $scope.sortReverse = true;
        $scope.myOrderBy = x;
    };

    $scope.viewItem = function (x){
        $scope.selectedItem = $scope.names[x];
        $scope.showDetails=true;
        $scope.showTable=false;
        $scope.showAddButton=false;
        $scope.showItem=true;
    };


});
