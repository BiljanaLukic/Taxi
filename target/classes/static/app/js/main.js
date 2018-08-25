var app = angular.module("Taxi", ['ngRoute']);

app.controller("loginCtrl", function ($scope, $http, $location, $window){
	
	var baseUrlLogin = "api/users/login";
	$scope.loginUser = {};
	$scope.loginUser.username="";
	$scope.loginUser.password="";
	
	$scope.currentUser = {};
	$scope.currentUser.name = "";
	
	var baseUrl = "api/users";
	$scope.registerUser = {};	
	$scope.registerUser.name = "";
	$scope.registerUser.surname = "";
	$scope.registerUser.gender = "";
	$scope.registerUser.personalIdNum = "";
	$scope.registerUser.phone = "";
	$scope.registerUser.email = "";
	$scope.registerUser.username = "";
	$scope.registerUser.password1 = "";
	$scope.registerUser.password2 = "";

	var returnUser = {};
	
	$scope.login = function (){
		$http.post(baseUrlLogin,$scope.loginUser).then(
				function success(res){
					$scope.currentUser  = res.data;
					console.log($scope.currentUser);
					sessionStorage.setItem('user',JSON.stringify($scope.currentUser));
					sessionStorage.setItem('id',$scope.currentUser.id );
					$scope.id = sessionStorage.getItem('id');
					console.log($scope.id);
//					sessionStorage.setItem('id',$scope.currentUser.id);
					$window.location.href ="http://localhost:8080/#!/userProfile/";
					
//					$location.path("/#!/userProfile/");
				},
				function error (){
					alert ("Something went wrong about login!");
				}
				)
	}
	
	$scope.register = function (){
		console.log($scope.registerUser);
		$http.post(baseUrl, $scope.registerUser).then(
				function success(res){
					returnUser = res.data;
					console.log(returnUser);
					$scope.registerUser.name = "";
					$scope.registerUser.surname = "";
					$scope.registerUser.gender = "";
					$scope.registerUser.personalIdNum = "";
					$scope.registerUser.phone = "";
					$scope.registerUser.email = "";
					$scope.registerUser.username = "";
					$scope.registerUser.password1 = "";
					$scope.registerUser.password2 = "";
				},
				function error (){
					alert ("Something went wrong about register!");
				}
				)
	}
	
});
app.controller ("showHide", function ($scope){
//	$scope.sessionUser = JSON.parse(sessionStorage.user);
	$scope.id = sessionStorage.getItem('id');
	
	
});

app.controller ("userProfileCtrl", function ($scope, $http, $routeParams){
//	$scope.sessionUserId = sessionStorage.getItem('id');
	$scope.sessionUser = JSON.parse(sessionStorage.user);
	
//	var userId = $routeParams.id;
//	var baseUrl = "api/users";
	var baseUrlDrivings = "api/drivings";
//	$scope.currentUser = {};
//	$scope.currentUser.id = "";
//	
//	$scope.drivings = [];
//	
//	var getUser = function (){
//		$http.get(baseUrl + "/" + userId).then(
//				function success(res){
//					$scope.currentUser  = res.data;
//					console.log($scope.currentUser);
//				},
//				function error (){
//					alert ("Nije dobavljeno iz baze!");
//				}
//				)
//	}
//	
//	getUser();
	
	var getDrivingsForThisUser = function (){
		
		var config = {params:{}};
		

		config.params.idUser =$scope.sessionUser.id;
//		console.log($scope.currentUser.id);
		
		$http.get(baseUrlDrivings, config).then (
				function success(res){
					$scope.drivings = res.data;
					console.log($scope.drivings);
				},
				function error (){
					alert ("Something wrong with getting object!")
				}
				)
	}
	
	getDrivingsForThisUser();
	
	
	$scope.newDriving = {};
	$scope.newDriving.address = "";
	$scope.newDriving.customerId = $scope.sessionUser.id;
	
	$scope.addDriving = function (){
		$http.post (baseUrlDrivings, $scope.newDriving).then(
				function success (res){
					getDrivingsForThisUser();
					$scope.newDriving.address = "";
				},
				function error (){
				alert("Something went wrong with posting  new Driving");
				}
				)
	}
	
});

app.controller ("EditCtrl", function ($scope, $http){
	$scope.editUser = JSON.parse(sessionStorage.user);
	$scope.editUser.password1 = "";
	$scope.editUser.password2 = "";
	
	var baseUrlUser = "/api/users";
	
	$scope.save = function (){
		$http.put (baseUrlUser + "/"+ $scope.editUser.id, editUser).then(
				function success (){
					
				},
				function error (){
					alert("Something went wrong with changing user");
				}
				)
				
	}
});
	



app.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/',{
        templateUrl: '/app/html/partial/login.html'
    }).when('/izmena',{
        templateUrl: '/app/html/partial/izmena.html'
    }).when('/userProfile',{
        templateUrl: '/app/html/partial/userProfile.html'
    }).otherwise({
        redirectTo: '/voznje'
    });
}]);
