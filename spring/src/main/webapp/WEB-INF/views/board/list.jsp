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
  <h2>Table Head Colors</h2>
  <table class="table">
    <thead class="thead-dark">
      <tr>
        <th>锅龋</th>
        <th>力格</th>
        <th>累己磊</th>
        <th>累己老</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="board">
      <tr>
        <td>${board.num}</td>
        <td><a href="#">${board.title}</a></td>
        <td>${board.writer}</td>
        <td>${board.registerDate}</td>
      </tr>
     </c:forEach>
    </tbody>
  </table>
</div>
</body>
</html>