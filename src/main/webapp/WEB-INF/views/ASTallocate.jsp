<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <title>後台</title>
</head>
<body>
	<%@include file="navbar.jspf" %>
    <div class="container theme-showcase" role="main">
    
      <div class="jumbotron" >    
        <h1>大考中心報名系統</h1>
        <p class="lead">本系統為大考中心報名系統後台</p>
      </div>
	<div class="container">
		<div class="row">
			<br>
			<div class="col-md-12">
	  			
				<table class="table">
				  	<tr>
				  		<th>報名編號</th>
				  		<th>准考證號碼</th>
				  		<th>考生身分證字號</th>
				  		<th>國文</th>
				  		<th>英文</th>
				  		<th>數甲</th>
				  		<th>數乙</th>
				  		<th>歷史</th>
				  		<th>地理</th>
				  		<th>公民</th>
				  		<th>物理</th>
				  		<th>化學</th>
				  		<th>生物</th>
				  		<th>考場</th>
				  		
				  		<th>編輯</th>
				  	</tr>
				  	<c:forEach items="${ASTList}" var="AST">
					  	<tr>
					  		<td>${AST.getID()}</td>
					  		
												
				           
								    
					  		<c:set var="val" value= "${AST.getTestnumber()}" />
							<c:choose> 
							  <c:when test="${val == '200000000'}">
							    <td>准考證尚未設定</td>	
							  </c:when>
							  <c:otherwise>
							    <td>${AST.getTestnumber()}</td>	
							  </c:otherwise>
							</c:choose>
					  		
					  		
					  		
					  		
					  		<td>${AST.examineeID}</td>
					  		
					  		
					  		<td>${AST.getChinese()}</td>
					  		<td>${AST.getEnglish()}</td>
					  		<td>${AST.getMathA()}</td>
					  		<td>${AST.getMathB()}</td>
					  		<td>${AST.getHistory()}</td>
					  		<td>${AST.getGeography()}</td>
					        <td>${AST.getCivics()}</td>
					        <td>${AST.getPhysics()}</td>
					  		<td>${AST.getChemistry()}</td>
					        <td>${AST.getBiology()}</td>
					  		
					  		
					  		<c:set var="val" value= "${AST.getTestroom().getId()}" />
							<c:choose> 
							  <c:when test="${val == '0'}">
							    <td>考場尚未設定</td>	
							  </c:when>
							  <c:otherwise>
							    <td>${AST.getTestroom().getId()}</td>	
							  </c:otherwise>
							</c:choose>
					  		
					  		<td>
					  			<a class="btn btn-default" href="updateAST?ID=${AST.getID()}">修改</a>
					  			
					  		</td>
					  	</tr>
				  	</c:forEach>
				</table>
			</div>
		</div>
	</div>
	<div class="modal fade bs-example-modal-sm" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-sm">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">刪除</h4>
                </div>
                <div class="modal-body">
                    <p>確認刪除後，相關之訊息也將刪除</p>
                </div>
                <div class="modal-footer">
	                <form id="deleteForm" action="deleteExaminee" method="post">
	            		<input type="hidden" name="ID" id="deleteID">
	                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
	                    <button type="submit" class="btn btn-danger">確認刪除</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
	

    </div><!-- /.container -->

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script>
    $(function(){
    	$(".deleteBtn").click(function(){
    		//alert($(this).attr("data-id"));
    		$("#deleteID").val($(this).attr("data-id"));
    	});
    });
    </script>


</body>
</html>