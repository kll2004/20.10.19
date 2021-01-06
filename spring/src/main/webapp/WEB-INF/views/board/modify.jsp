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
	<h2>�Խñ� ����</h2>
		<c:if test="${board != null}">
		<form action="<%=request.getContextPath()%>/board/modify" method="post">
			<div class="form-group">
				<label for="num">��ȣ</label>
				<input type="text" class="form-control" id="num" name="num" readonly value="${board.num}">
			</div>
			<div class="form-group">
				<label for="title">����</label>
				<input type="text" class="form-control" id="title" name="title" value="${board.title}">
			</div>
			<div class="form-group">
				<label for="writer">�ۼ���</label>
				<input type="text" class="form-control" id="writer" name="writer" readonly value="${board.writer}">
			</div>
			<div class="form-group">
				<label for="registerDate">�ۼ���</label>
				<input type="text" class="form-control" id="registerDate" name="registerDate" readonly value="${board.registerDate}">
			</div>
			<div class="form-group">
				<label for="content">����</label>
				<textarea class="form-control" id="content" name="content" >${board.content}</textarea>
			</div>
			<button type="submit" class="btn btn-outline-info">����</button>
		</form>
		</c:if>
		<c:if test="${board == null}">
			<h1>�������� ���� �Խù��Դϴ�.</h1>
		</c:if>
		<a href="<%=request.getContextPath()%>/board/register">
			<button type="button" class="btn btn-outline-info">�۾���</button>
		</a>
	</div>
</body>
</html>