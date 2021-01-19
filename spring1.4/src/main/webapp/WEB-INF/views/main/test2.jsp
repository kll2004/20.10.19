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
<!-- 학생이름을 input태그에 입력받아 서버로 전송하여 서버에서 전송된 이름을 콘솔에 출력.
	단, 데이터를 보낼때 변수의 이름을name으로 설정데이터를 get으로 보내고, 보낼 url은 /test2 -->
	<form method="get" action="<%=request.getContextPath()%>/test2">
		<h1>연습1</h1>
		<input type="text" name="name"><br>
		<button type="submit">전송</button>
	</form>
<!-- 학생 이름과 나이를input태그에 입력받아 서버로 전송하여 서버에서 해당 학생 정보를 출력.
	단, 컨트롤러에서TestVo를 이용하여 출력 url은 test3로 mv.setViewName("/main/test2");로 설정 -->
	<form method="get" action="<%=request.getContextPath()%>/test3">
		<h1>연습2</h1>
		<input type="text" name="name"><br>
		<input type="text" name="age"><br>
		<button type="submit">전송</button>
	</form>
<!-- 학생3명의 이름을 input태그에 입력받아 서버로 전송하여 서버에서 해당 학생 이름들을 출력하세요.
	단,컨트롤러에서는 학생이름을 배열로 처리 url은 /test4로 mv.setViewName("/main/test2");로 설정 -->
	<form method="get" action="<%=request.getContextPath()%>/test4">
		<h1>연습3</h1>
		<input type="text" name="name"><br>
		<input type="text" name="name"><br>
		<input type="text" name="name"><br>
		<button type="submit">전송</button>
	</form>
	<form method="get" action="<%=request.getContextPath()%>/test5">
		<h1>연습4</h1>
		<input type="text" name="name"><br>
		<input type="text" name="name"><br>
		<input type="text" name="name"><br>
		<button type="submit">전송</button>
	</form>
</body>
</html>