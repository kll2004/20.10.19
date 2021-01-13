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
	<c:if test="${board != null && board.writer == user.id }">
	  <form action="<%=request.getContextPath()%>/board/modify" method ="post">
	    <div class="form-group">
	      <label>번호</label>
	      <input type="text" class="form-control" name="num" value="${board.num}"readonly>
	    </div>
	    <div class="form-group">
	      <label>제목</label>
	      <input type="text" class="form-control"  name="title"  value="${board.title}">
	    </div>
	    <div class="form-group">
	      <label>작성자</label>
	      <input type="text" class="form-control" name="writer" value="${board.writer}"readonly>
	    </div>
	    <div class="form-group">
	      <label>작성일</label>
	      <input type="text" class="form-control"  name="registerDate"  value="${board.registerDate}" readonly>
	    </div>
	    <div class="form-group">
	      <label>조회수</label>
	      <input type="text" class="form-control"  name="views"  value="${board.views}" readonly>
	    </div>
	    <div class="form-group">
	      <label>내용</label>
	      <textarea rows="10" class="form-control"name="content">${board.content}</textarea>
	    </div>
    		<button type="submit" class="btn btn-primary">수정</button>
	  </form>
	  </c:if>
	  <c:if test="${board == null || board.writer != user.id }">
	  	<h1>존재안하는 게시글이나 작성자가 아님</h1>
	  </c:if>
	</div>
	<a href="<%=request.getContextPath()%>/board/list">
		<button type="button" class="btn btn-primary">목록</button>
	</a>
	<a href="<%=request.getContextPath()%>/board/register">
		<button type="button" class="btn btn-primary">글쓰기</button>
	</a>
</body>
</html>