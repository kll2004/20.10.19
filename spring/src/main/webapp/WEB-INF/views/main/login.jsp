<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
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
  	<button id="btnAjax2">Ajax1��ư2</button>
  	<table class="table">
		<tr>
			<td>���̵�</td>
			<td>�̸�</td>
			<td>�̸���</td>
			<td>����</td>
			<td>Ȩ������</td>
			<td>����</td>
		</tr>
		<tbody>
		<tr>
			<td>�ӽ�1</td>
			<td>�ӽ�1</td>
			<td>�ӽ�1</td>
			<td>�ӽ�1</td>
			<td>�ӽ�1</td>
		</tr>
		<tr>
			<td>�ӽ�2</td>
			<td>�ӽ�2</td>
			<td>�ӽ�2</td>
			<td>�ӽ�2</td>
			<td>�ӽ�2</td>
		</tr>
		</tbody>	
	</table>
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
  	<script type="text/javascript">
	  	$('#btnAjax2').click(function() {
			var sendData = {name : 'Hong', age : 21};
			$.ajax({
				url : '<%=request.getContextPath()%>/ajax2',
				type : 'post',
				data : JSON.stringify(sendData),
			 	dataType:"json",
		        contentType:"application/json; charset=UTF-8",
				success : function(data){
					var str = '';
					
					var list = data['list'];
					for(var i =0; i<list.length; i++){
						str += '<tr>'
						str += '<td>'+list[i]['id']+'</td>'
						str += '<td>'+list[i]['name']+'</td>'
						str += '<td>'+list[i]['email']+'</td>'
						str += '<td>'+list[i]['age']+'</td>'
						str += '<td>'+list[i]['home']+'</td>'
						str += '<td>'+list[i]['author']+'</td>'
						str += '</tr>'
					}
					$('tbody').html(str);
					
					console.log(data);
					console.log(data['list'][0]);
					console.log(data.list[0]);
					console.log(data.testVo.name)
					console.log(data.['testVo']['name'])
				},
				error : function(){
					console.log('����');
				}
			})
		})
  	</script>
  </c:if>
  <script type="text/javascript"
  src="<%=request.getContextPath()%>/resources/js/test.js"></script>
</body>
</html>