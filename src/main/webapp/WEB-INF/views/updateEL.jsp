<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<title>Update Product</title>
</head>
<body>
	<%@include file="navbar.jspf" %>
	<div class="container theme-showcase" role="main">
    
      <div class="jumbotron" >    
        <h1>產品管理系統</h1>
        <p class="lead">本系統為輔仁大學資訊管理學系之範例程式</p>
      </div>
	<div class="container">
		<div class="row">
			<br>
			<div class="col-md-3"></div>
			<div class="col-md-6">
			
				<form method="post" action="updateEL" id="updateForm">
					<input type="hidden" name="id" value="${ELscore.getId()}">
					
        <label>報名編號:${ELscore.id}</label>
        <p></p>
        <label>分數:</label>
        <input class="form-control" type="text" id="name" name="score"   value= "${ELscore.getScore()}" >
        <p></p>
		<p></p>
        <label>准考證編號:</label>
        <input class="form-control" type="text" id="name" name="testnumber"   value= "${ELscore.getTestnumber()}" >
        <p></p>
   
        
        <div class="form-group">
					    <label for="TestRoom.id">考場選擇</label>
				  		<select class="form-control" id="TestRoom.id" name="testroom.id">
				  		<c:forEach items="${TestRoomList}" var="testroom">
					  		<option value="${testroom.id}">
					  			${testroom.name}
				  			</option>
				  		</c:forEach>
						</select>
				  	</div>
        
        
        <p></p>
        <label>繳費狀況:</label>
        <select class="form-control" name="isPayed" >
                  <option value="1">已銷帳</option>
                  <option value="0">未銷帳</option>
                  </select>
                  <p></p>
					<button type="submit" class="btn btn-primary">修改</button>
				</form>
			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
	</div><!-- /.container -->
	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.validate.js"></script>
	<script src="js/additional-methods.js"></script>
	<script src="js/messages_zh_TW.js"></script>
	<script>
	$("#updateForm").validate();
	</script>
</body>
</html>