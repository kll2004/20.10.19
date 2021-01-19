<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${user == null}">
	<!-- url�� localhost:8080/test/login -->
 		<form action="<%=request.getContextPath() %>/login" method="POST">
		 	<div class="form-group">
		     	<label for="usr">ID:</label>
		      	<input type="text" class="form-control" id="usr" name="id">
		    </div>
		    <div class="form-group">
		     	<label for="pwd">PW:</label>
		     	<input type="password" class="form-control" id="pwd" name="pw">
		    </div>
		    <button type="submit" class="btn btn-primary col-12">�α���</button> 
		</form>
  </c:if>
  <c:if test="${user != null}">
  	<button id="btnAjax1">Ajax1��ư1</button>
  	<script>
  		$(function() {
			$('#btnAjax1').click(function() {
				var data = {name : 'Hong', age : 21};
				$.ajax({
					url : '<%=request.getContextPath()%>/ajax1',
					type : 'post',
					data : data,
					success : function(data){
						console.log(data);
					},
					error : function(){
						console.log('����');
					}
				})
			})
		})
  	</script>
  </c:if>
</body>
</html>