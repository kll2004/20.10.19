<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�Խñ�</title>
</head>
<body>
	<div class="container">
	  <h2>�Խ���</h2>
	  <table class="table">
	    <thead>
	      <tr>
	        <th>��ȣ</th>
	        <th>����</th>
	        <th>�ۼ���</th>
	        <th>�ۼ���</th>
	      </tr>
	    </thead>
	    <tbody>
	    <c:forEach items="${list}" var="board">
	      <tr>
	        <td>${board.num}</td>
	        <td><a href="<%=request.getContextPath()%>/board/detail?num=${board.num}">${board.title}</a></td>
	        <td>${board.writer}</td>
	        <td>${board.registerDate}</td>
	      </tr> 
      	</c:forEach>     
	    </tbody>
	  </table>
		<a href="<%=request.getContextPath()%>/board/register">
			<button type="button" class="btn btn-primary">�۾���</button>
		</a>
	</div>
</body>
</html>