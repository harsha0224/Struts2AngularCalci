<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calci Form</title>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js"></script>
<!-- <script src="/WEB-INF/view/js/app.js"></script> -->
<script type="text/javascript">
	var app = angular.module('myApp', []);
	app.controller("MyController", MyController);
	function MyController($scope, $http) {
		$scope.calData = {};
		$scope.result = {};
		$scope.showCond = false;
		$scope.add = function() {
			$http.post('Addition', {
				calInObj : $scope.calData
			}).success(function(data, status, headers, config) {
				$scope.result = data;
				$scope.showCond = true;
			}).error(function(data, status, headers, config) {
				// called asynchronously if an error occurs
				// or server returns response with an error status.
			});
		};

		$scope.sub = function() {
			$http.post('Subtraction', {
				calInObj : $scope.calData,
				contentType : 'application/json'
			}).success(function(data, status, headers, config) {
				$scope.result = data;
				$scope.showCond = true;
			}).error(function(data, status, headers, config) {
				// called asynchronously if an error occurs
				// or server returns response with an error status.
			});
		};

		$scope.mul = function() {
			$http.post('Multiplication', {
				calInObj : $scope.calData,
				contentType : 'application/json'
			}).success(function(data, status, headers, config) {
				$scope.result = data;
				$scope.showCond = true;
			}).error(function(data, status, headers, config) {
				// called asynchronously if an error occurs
				// or server returns response with an error status.
			});
		};

		$scope.div = function() {
			$http.post('Division', {
				calInObj : $scope.calData,
				contentType : 'application/json'
			}).success(function(data, status, headers, config) {
				$scope.result = data;
				$scope.showCond = true;
			}).error(function(data, status, headers, config) {
				// called asynchronously if an error occurs
				// or server returns response with an error status.
			});
		};
		$scope.clear = function() {

			$scope.result = {};
			$scope.calData = {};
			$scope.showCond = false;

		};

	};
</script>
</head>
<body bgcolor="skyblue">
	<h2>Basic Calculator</h2>
	<div data-ng-app="myApp">
		<div data-ng-controller="MyController">
			<form action="">
				<p>
					Param1:<input type="text" ng-model="calData.param1" />
				</p>
				<p>
					Param2:<input type="text" ng-model="calData.param2" />
				</p>

			</form>
			<table>
				<tr>
					<td><button data-ng-click="add()"
							style="background-color: lightgreen">Addition</button></td>
					<td><button data-ng-click="sub()"
							style="background-color: red">Subtraction</button></td>
					<td><button data-ng-click="mul()"
							style="background-color: pink">Multiplication</button></td>
					<td><button data-ng-click="div()"
							style="background-color: yellow">Division</button></td>
				</tr>
			</table>


			<div ng-show="showCond">
				<h4>Result</h4>
				<p>Parameter1 : {{result.param1}}</p>
				<p>Parameter2 : {{result.param2}}</p>
				<p>Result : {{result.result}}</p>
				<p>
					<button data-ng-click="clear()">Clear</button>
				</p>
			</div>
		</div>
	</div>
</body>
</html>