<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�Խñ�</title>
</head>
<body>
	<div class="container">
		<form action="<%=request.getContextPath()%>/board/list">
			<div class="input-group mb-3">
				<select class="form-control" name="type">
					<option value="1" <c:if test="${pm.criteria.type == 1}">selected</c:if> >��ü</option>
					<option value="2" <c:if test="${pm.criteria.type == 2}">selected</c:if> >����</option>
					<option value="3" <c:if test="${pm.criteria.type == 3}">selected</c:if> >����</option>
					<option value="4" <c:if test="${pm.criteria.type == 4}">selected</c:if> >�ۼ���</option>
				</select>
					<input type="text" class="form-control" name="search" value="${pm.criteria.search}">
				<div class="input-group-prepend">
					<button type="submit" class="btn btn-primary">�˻�</button>
				</div>
			</div>
		</form>
	  <table class="table">
	    <thead>
	      <tr>
	        <th>��ȣ</th>
	        <th>����</th>
	        <th>�ۼ���</th>
	        <th>�ۼ���</th>
	        <th>��ȸ��</th>
	      </tr>
	    </thead>
	    <tbody>
	    <c:forEach items="${list}" var="board">
	      <tr>
	        <td>${board.num}</td>
	        <td><a href="<%=request.getContextPath()%>/board/detail?num=${board.num}&page=${pm.criteria.page}&type=${pm.criteria.type}&search=${pm.criteria.search}">${board.title}</a></td>
	        <td>${board.writer}</td>
	        <td>${board.registerDate}</td>
	        <td>${board.views}</td>
	      </tr> 
      	</c:forEach>     
	    </tbody>
	  </table>
		<ul class="pagination justify-content-center">
		<c:if test="${pm.prev}">
		  <li class="page-item"><a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pm.startPage-1}&type=${pm.criteria.type}&search=${pm.criteria.search}">����</a></li>
	    </c:if>
	    <c:forEach begin="${pm.startPage }" end="${pm.endPage }" var="index">
		  <li class="page-item <c:if test="${index == pm.criteria.page }">active</c:if>"><a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${index}&type=${pm.criteria.type}&search=${pm.criteria.search}">${index}</a></li>
		</c:forEach>
	    <c:if test="${pm.next}">
		  <li class="page-item"><a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pm.endPage+1}&type=${pm.criteria.type}&search=${pm.criteria.search}">����</a></li>
	    </c:if>
		</ul>
		<a href="<%=request.getContextPath()%>/board/register">
			<button type="button" class="btn btn-primary">�۾���</button>
		</a>
	</div>
</body>
</html>