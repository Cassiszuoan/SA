<!DOCTYPE html>
<%@ page contentType="text/html; charset=utf-8" import="java.util.*, java.sql.*"%>
<%request.setCharacterEncoding("utf-8");%>



<html>
<head>
	<meta charset="utf-8">
	<title>Easy Profile Blue - templatemo</title>
	<meta http-equiv="X-UA-Compatible" content="IE=Edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="keywords" content="">
	<meta name="description" content="">

<!-- 
Easy Profile Template
http://www.templatemo.com/tm-467-easy-profile
-->
	<!-- stylesheet css -->
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/testSearch.css">
</head>
<body data-spy="scroll" data-target=".navbar-collapse">
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
      <div class="container">
          <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#"><span><img src="pic/ceecLogo2.png"></span>&nbsp;大學入學考試中心</a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="">Home</a></li>
            <li class="active"><a href="">報名進度查詢</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">某某，你好</a>
              <ul class="dropdown-menu" role="menu">
                  <li><a href="#">修改個人資料</a></li>
                  <li><a data-toggle="modal" data-target="#myModal2">成績查詢</a></li>
                  <li><a href="#">登出</a></li>
              </ul>
            </li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>


<!-- preloader section -->
<div class="preloader">
	<div class="sk-spinner sk-spinner-wordpress">
       <span class="sk-inner-circle"></span>
     </div>
</div>

<!-- header section -->
<header>
	<div class="container">
		<div class="row">
			<div class="col-md-12 col-sm-12">
				<h1 class="white bold font-change shadow">年度大考</h1>
				<h1 class="tm-title bold font-change">報名進度查詢</h1>
				<hr>
			</div>
		</div>
	</div>
</header>
<div class="container-entire">

<!-- about and skills section -->
<section class="container">
	<div class="row">
		<div class="col-md-4 col-sm-12">
			<div class="test-topic">
				<h3 class="accent">105學年度</h3>
				<h1>學科能力測驗</h1>
			</div>
		</div>
		<div class="col-md-8 col-sm-12">
			<div class="test-data">
				<h4 class="test-data-title">報名單號：</h4>
				<hr>
				<table class="table table-bordered table-border" rules="none">
					<tr class="bold">
						<td>報名填單與否</td>
						<td>繳款與否</td>
						<td>繳費明細</td>
					</tr>
					<tr>
						<td>已報名</td>
						<td>未銷帳</td>
						<td>
							<a role="button" class="btn btn-default" href="#">查看</a>
							<a role="button" class="btn btn-default" href="#">列印</a>
						</td>
					</tr>
					
				</table>
				<hr>
			</div>
		</div>
	</div>
</section>

<!-- test-topic and languages -->
<section class="container">
	<div class="row">
		<div class="col-md-4 col-sm-12">
			<div class="test-topic">
				<h3 class="accent">105學年度</h3>
				<h1>指定科目考試</h1>					
			</div>
		</div>
		<div class="col-md-8 col-sm-12">
			<div class="test-data">
				<h4 class="test-data-title">報名單號：</h4>
				<hr>
				<table class="table table-bordered table-border" rules="none">
					<tr class="bold">
						<td>報名填單與否</td>
						<td>繳款與否</td>
						<td>繳費明細</td>
					</tr>
					<tr>
						<td>已報名</td>
						<td>未銷帳</td>
						<td>
							<a role="button" class="btn btn-default" href="#">查看</a>
							<a role="button" class="btn btn-default" href="#">列印</a>
						</td>
					</tr>
					
				</table>
				<hr>
			</div>
		</div>
	</div>
</section>

<!-- contact and test-data -->
<section class="container">
	<div class="row">
		<div class="col-md-4 col-sm-12">
			<div class="test-topic">
				<h3 class="accent">105學年度</h3>
				<h1>高中英文聽力測驗</h1>
			</div>
		</div>
		<div class="col-md-8 col-sm-12">
			<div class="test-data">
				<h4 class="test-data-title">報名單號：</h4>
				<hr>
				<table class="table table-bordered table-border" rules="none">
					<tr class="bold">
						<td>報名填單與否</td>
						<td>繳款與否</td>
						<td>繳費明細</td>
					</tr>
					<tr>
						<td>已報名</td>
						<td>未銷帳</td>
						<td>
							<a role="button" class="btn btn-default" href="#">查看</a>
							<a role="button" class="btn btn-default" href="#">列印</a>
						</td>
					</tr>
					
				</table>
				<hr>
			</div>
		</div>
	</div>
</section>
</div>

<!-- footer section -->
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
  </div><!-- --/footerwrap ---->

<!-- javascript js -->	
<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>	
<script src="js/jquery.backstretch.min.js"></script>
<script src="js/custom.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>


</body>
</html>