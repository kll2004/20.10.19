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
	  <form action="/action_page.php">
	    <div class="form-group">
	      <label>��ȣ</label>
	      <input type="text" class="form-control" name="username" value="${board.num}"readonly>
	    </div>
	    <div class="form-group">
	      <label>����</label>
	      <input type="text" class="form-control"  name="password"  value="${board.title}" readonly>
	    </div>
	    <div class="form-group">
	      <label>�ۼ���</label>
	      <input type="text" class="form-control" name="writer" value="${board.writer}"readonly>
	    </div>
	    <div class="form-group">
	      <label>�ۼ���</label>
	      <input type="text" class="form-control"  name="registerDate"  value="${board.registerDate}" readonly>
	    </div>
	    <div class="form-group">
	      <label>����</label>
	      <textarea rows="10" class="form-control"neme="content" readonly>${board.content}</textarea>
	    </div>
	  </form>
	</div>
	<a href="<%=request.getContextPath()%>/board/list">
		<button type="button" class="btn btn-primary">���</button>
	</a>
	<a href="<%=request.getContextPath()%>/board/register">
		<button type="button" class="btn btn-primary">�۾���</button>
	</a>
	<a href="<%=request.getContextPath()%>/board/modify?num=${board.num}">
		<button type="button" class="btn btn-primary">����</button>
	</a>
</body>
</html>