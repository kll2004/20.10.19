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
	�̸� : ${name }<br>
	���� : ${age }<br>
	�̸� : ${testVo.name }<br>
	���� : ${testVo.age }<br>
	<!-- /board/list.jsp���� ���������̼ǿ��� ����� ���� -->
	<c:forEach var="index" begin="${start }" end="${end }">
	${index}<br>
	</c:forEach>
	<c:forEach var="testVo" items="${list }">
	�̸� : ${testVo.name }<br>
	���� : ${testVo.age }<br>
	</c:forEach>
</body>
</html>