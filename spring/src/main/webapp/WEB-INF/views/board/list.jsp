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
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성일</th>
        <th>조회수</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="board">
      <tr>
        <td>${board.num}</td>
        <td><a href="<%=request.getContextPath()%>/board/detail?num=${board.num}">${board.title}</a></td>
        <td>${board.writer}</td>
        <td>${board.registerDate}</td>
        <td>${board.views}</td>
      </tr>
     </c:forEach>
    </tbody>
  </table>
  <ul class="pagination justify-content-center">
  <c:if test="${pm.prev}">
    <li class="page-item"><a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pm.startPage-1}">이전</a></li>
  </c:if>
    <c:forEach begin="${pm.startPage}" end="${pm.endPage}" var="index">
    	<c:if test="${index == pm.criteria.page}">
    		<li class="page-item active"><a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${index}">${index} </a></li>
    	</c:if>
    	<c:if test="${index != pm.criteria.page}">
    		<li class="page-item"><a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${index}">${index} </a></li>
   		</c:if>
   	</c:forEach>
   	<c:if test="${pm.next}">
    	<li class="page-item"><a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pm.endPage+1}">다음</a></li>
    </c:if>
  </ul>
	<a href="<%=request.getContextPath()%>/board/register">
		<button type="button" class="btn btn-outline-info">등록</button>
	</a>
</div>
</body>
</html>