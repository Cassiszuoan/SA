<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <meta http-equiv="Content-Type"content="text/html;charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Signin Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/register.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

  <script language="javascript">
      function change(Obj){  
          Obj.form.submit();
      }  
  </script>
  
  </head>

  <body>

    <div class="container">

      <form class="form-signin" action="register"  method="post">
        <h2 class="form-signin-heading">填寫基本資料</h2>
        <p></p>
        <label>姓名:</label>
        <input class="form-control" type="text" id="name" name="name" placeholder="姓名">
        <p></p>
        
        <label>性別:</label> <select class="form-control" name="gender">
							<option value="男">男</option>
							<option value="女">女</option>
						</select>
		<p></p>
		<label>生日:</label>
		<input class="form-control" type="date" id="birth" name="birth" placeholder="1990/01/01">
		<p></p>
		<label>身分證字號:</label>
        <input class="form-control" type="text" id="ID" name="ID" placeholder="身分證字號">
        <p></p>
        <label>EMAIL:</label>
        <input class="form-control" type="email" id="email" name="email" placeholder="Email">
        <p></p>
        <label>密碼:</label>
        <input class="form-control" type="password" id="password" name="password" placeholder="密碼">
        <p></p>

        <div class="form-group">
					    <label for="TestRoom.testroomName">考場選擇</label>
				  		<select class="form-control" id="TestRoom.testroomName" name="TestRoom.testroomName">
				  		<c:forEach items="${TestRoomList}" var="testroom">
					  		<option value="${testroom.testroomName}">
					  			
				  			</option>
				  		</c:forEach>
						</select>
				  	</div>
        <p></p>
         <label>聯絡電話:</label>     
        <input class="form-control" type="text" id="phone" name="phone" placeholder="聯絡電話">
        <p></p>
        <label>地址:</label>
        <input class="form-control" type="text" id="address" name="address" placeholder="通訊地址">
        <p></p>
        <label>緊急聯絡人姓名:</label>
        <input class="form-control" type="text" id="EmergencyContact" name="EmergencyContact" placeholder="緊急連絡人姓名">
        <p></p>
        <label>與緊急聯絡人之關係:</label>
        <input class="form-control" type="text" id="EmergencyContactRelationship" name="EmergencyContactRelationship" placeholder="與緊急連絡人之關係">
        <p></p>
        <label>緊急聯絡人電話:</label>
        <input class="form-control" type="text" id="EmergencyContactMobile" name="EmergencyContactMobile" placeholder="緊急連絡人電話">
        <p></p>


          <!-- <div class="radio">
            <label>是否為低收入戶</label>&nbsp;&nbsp;&nbsp;&nbsp;
            <label class="radio-inline">
              <input type="radio" name="lowIncome" value="y"> 是
            </label>
            <label class="radio-inline">
              <input type="radio" name="lowIncome" value="n"> 否
            </label>
          </div> -->


        <button name="submit1" class="btn btn-lg btn-primary btn-block move" type="submit">送出</button>
      </form>
      <center>
      <a href="signin.jsp">取消註冊</a>  
      </center>

    </div> <!-- /container -->



    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
