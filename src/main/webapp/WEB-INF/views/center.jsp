<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href=".../.../favicon.ico">

    <title></title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/center.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><!--[endif]---->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <!--[endif]---->
  </head>

  <body><!-- Static navbar -->
      <div class="navbar navbar-default navbar-fixed-top" role="navigation">
      <div class="container">
          <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">WELCOME!</a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li class="active"><a href="#">Home</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">${message}，你好</a>
              <ul class="dropdown-menu" role="menu">
                  <li><a href="#">修改個人資料</a></li>
                  <li><a href="#">登出</a></li>
                  </ul>
            </li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>
      <div id="headerwrap">
        <div class="row">
        <div class="col-lg-6 col-lg-offset-3">
          <h4 class="chin-h4">報名各項考試、簡章下載檢閱、說明規範等</h4>
          <h1>大考報名</h1>
          <a class="btn btn-lg btn-primary" role="button" href="apply">點此進入報考</a>
        </div>
        </div><!-- --/row ---->
      </div><!-- --/headerwrap ---->
      <section id="works"></section>
      <div class="container">
		<div class="row centered mt mb">
			<h1>各項查詢</h1>
			
			<div class="col-lg-4 col-md-4 col-sm-4 gallery">
				<a href="#"><img src="pic/search4.png" class="img-responsive"></a>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-4 gallery">
				<a data-toggle="modal" data-target="#myModal"><img src="pic/search5.png" class="img-responsive"></a>
			</div>
			
			
			<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
              <h4 class="modal-title" id="myModalLabel">准考證查詢</h4>
            </div>
            <div class="modal-body">
              
              <form class="form-horizontal" role="form" action="testnumberquery" method="post">
              <div class="modal-container">  
                <div class="form-group">
                    <input type="text" class="form-control" id="exampleInputPwd" placeholder="身分證字號">
                </div>
                <div class="form-group">
                    <input type="date" class="form-control" id="exampleInputBirth" placeholder="出生年月日">
                </div>
              </div>
                <div class="form-group">       
                  <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                  <button type="submit" class="btn btn-primary">確認</button>
                  <p>准考證號碼查詢結果: ${message}</p>
     <p>考場查詢結果: 代號 ${id}  考場名稱：${name}  地址：${address}</p>
                </div>            
              </form>
            </div>
          </div>
        </div> 
      </div>
			<div class="col-lg-4 col-md-4 col-sm-4 gallery">
				<a data-toggle="modal" data-target="#myModal2"><img src="pic/search6.png" class="img-responsive"></a>
			</div>
			 <!-- Modal -->
      <div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
              <h4 class="modal-title" id="myModalLabel">成績查詢</h4>
            </div>
            <div class="modal-body">
              
              <form class="form-horizontal" role="form" action="#" method="post">
              <div class="modal-container">
                <div class="form-group">
                    <input type="text" class="form-control" id="exampleInputTestNum" placeholder="准考證號碼">
                </div>
              </div>
                <div class="form-group">       
                  <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                  <button type="submit" class="btn btn-primary">確認</button>
                </div>            
              </form>
            </div>
          </div>
        </div> 
      </div>
      <!--modal end -->
			
		</div><!-- --/row ---->
	</div><!-- --/container ----><!-- --/social ---->
      <div id="footerwrap">
		<div class="container">
			<div class="row centered">
				<div class="col-lg-4">
					<p><b>版權所有 大學入學考試中心</b></p>
				</div>
			
				<div class="col-lg-4">
					<p>http://www.ceec.edu.tw/</p>
				</div>
				<div class="col-lg-4">
          <p>總機：(02)2366-1416</p>
          <p>語音查詢：(02)2364-3677</p>
          <p>傳真：(02)2362-0755</p>
          <p>地址：10673 台北市舟山路237號</p>
				</div>
			</div>
		</div>
	</div><!-- --/footerwrap ----><!-- Bootstrap core JavaScript
    ================================================== --><!-- Placed at the end of the document so the pages load faster --><script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script><script src="js/bootstrap.min.js"></script>
      
  </body>
  </html>