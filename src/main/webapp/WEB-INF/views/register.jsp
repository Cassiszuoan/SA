<!DOCTYPE html>
<%@ page contentType="text/html; charset=utf-8" import="java.util.*, java.sql.*"%>
<%request.setCharacterEncoding("utf-8");%>

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

        <input class="form-control" type="text" id="name" name="name" placeholder="姓名">
        <p></p>

        <input class="form-control" type="text" id="ID" name="ID" placeholder="身分證字號">
        <p></p>

        <input class="form-control" type="text" id="password" name="password" placeholder="密碼">
        <p></p>

        <div class="input-group input-group-lg">
          <span class="input-group-addon">生日</span>
          <input type="date" class="form-control">
        </div>
        <p></p>
                
        <input class="form-control" type="text" id="phone" name="phone" placeholder="聯絡電話">
        <p></p>

        <input class="form-control" type="text" id="address" name="address" placeholder="通訊地址">
        <p></p>

        <input class="form-control" type="text" id="EmergencyContact" name="EmergencyContact" placeholder="緊急連絡人姓名">
        <p></p>
        
        <input class="form-control" type="text" id="EmergencyContactRelationship" name="EmergencyContactRelationship" placeholder="與緊急連絡人之關係">
        <p></p>

        <input class="form-control" type="text" id="EmergencyContactMobile" name="EmergencyContactMobile" placeholder="緊急連絡人電話">
        <p></p>


          <div class="radio">
            <label>是否為低收入戶</label>&nbsp;&nbsp;&nbsp;&nbsp;
            <label class="radio-inline">
              <input type="radio" name="lowIncome" value="y"> 是
            </label>
            <label class="radio-inline">
              <input type="radio" name="lowIncome" value="n"> 否
            </label>
          </div>


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
