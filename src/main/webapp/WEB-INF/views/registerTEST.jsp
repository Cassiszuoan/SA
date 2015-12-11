<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Insert Article</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/jquery.validate.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row">
			<br>
			<div class="col-md-3"></div>
			<div class="col-md-6">
            
            <form method="post" action="register" id="insertform">
					<div class="form-group">
					    <label for="id">ID</label>
						<input type="text" class="form-control" id="id" name="ID" placeholder="id">
				  	</div>
				  	<div class="form-group">
					    <label for="email">EMAIL</label>
						<input type="text" class="form-control" id="email" name="email" placeholder="email">
				  	</div>
				  	
				  	<div class="form-group">
					    <label for="title">PASSWORD</label>
						<input type="text" class="form-control" id="password" name="password" placeholder="password">
				  	</div>
				  	
				  	<div class="form-group">
					    <label for="name">NAME</label>
						<input type="text" class="form-control" id="name" name="name" placeholder="name">
				  	</div>
				  	<div class="form-group">
					    <label for="phone">PHONE</label>
						<input type="text" class="form-control" id="phone" name="phone" placeholder="phone">
				  	</div>
				  	<div class="form-group">
					    <label for="address">ADDRESS</label>
						<input type="text" class="form-control" id="address" name="address" placeholder="address">
				  	</div>
				  	<div class="form-group">
					    <label for="EmergencyContact">EmergencyContact</label>
						<input type="text" class="form-control" id="EmergencyContact" name="EmergencyContact" placeholder="EmergencyContact">
				  	</div>
				  	<div class="form-group">
					    <label for="EmergencyContactRelationship">EmergencyContactRelationship</label>
						<input type="text" class="form-control" id="EmergencyContactRelationship" name="EmergencyContactRelationship" placeholder="EmergencyContactRelationship">
				  	</div>
				  	<div class="form-group">
					    <label for="EmergencyContactMobile">EmergencyContactMobile</label>
						<input type="text" class="form-control" id="EmergencyContactMobile" name="EmergencyContactMobile" placeholder="EmergencyContactMobile">
				  	</div>
					<button type="submit" class="btn btn-primary">新增</button>
				</form>
				
			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script> 
	<script src="js/jquery.validate.js"></script>
	<script src="js/additional-methods.js"></script>
	<script src="js/messages_zh_TW.js"></script>
	
</body>
</html>