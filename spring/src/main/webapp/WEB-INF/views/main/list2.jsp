<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	  <table class="table">
		<tr>
			<td>아이디</td>
			<td>이름</td>
			<td>이메일</td>
			<td>나이</td>
			<td>홈페이지</td>
			<td>권한</td>
			<td>수정</td>
		</tr>
		<c:forEach items="${list}" var="user">
		<tr>
			<td>${user.id}</td>
			<td>${user.name}</td>
			<td>${user.email}</td>
			<td>${user.age}</td>
			<td>${user.home}</td>
			<td>
				<select>
					<c:forEach begin="1" end="10" var="i">
						<option <c:if test="${i == user.author}">selected</c:if> >${i}</option>
					</c:forEach>
				</select>
			</td>
			<td><button class="btn btn-outline-success">수정</button> </td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>