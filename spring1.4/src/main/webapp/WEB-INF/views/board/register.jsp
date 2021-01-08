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
	<div class="container">
	<h2>�Խñ� ���</h2>
	<form action="<%=request.getContextPath()%>/board/register" method="Post">
		<div class="form-group">
			<label for="title">����</label>
			<input type="text" class="form-control" id="title" name="title">
		</div>
		<div class="form-group">
			<label for="writer">�ۼ���</label>
			<input type="text" class="form-control" id="writer" name="writer" readonly value="${user.id}">
		</div>
		<div class="form-group">
			<label for="content">����</label>
			<textarea class="form-control" id="content" name="content"></textarea>
		</div>
		<button type="submit" class="btn btn-outline-info">���</button>
	</form>
	<a href="<%=request.getContextPath()%>/board/list">
		<button type="button" class="btn btn-primary">���</button>
	</a>
	</div>
</body>
</html>