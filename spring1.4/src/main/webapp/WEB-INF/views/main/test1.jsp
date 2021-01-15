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
	이름 : ${name }<br>
	나이 : ${age }<br>
	이름 : ${testVo.name }<br>
	나이 : ${testVo.age }<br>
	<!-- /board/list.jsp에서 페이지네이션에서 사용을 했음 -->
	<c:forEach var="index" begin="${start }" end="${end }">
	${index}<br>
	</c:forEach>
	<c:forEach var="testVo" items="${list }">
	이름 : ${testVo.name }<br>
	나이 : ${testVo.age }<br>
	</c:forEach>
</body>
</html>