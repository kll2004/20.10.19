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
	
	<form class="input-group mb-3">
	    <div class="input-group-append">
	    <select class ="form-control" name="type">
	    	<option value="1"<c:if test="${pm.criteria.type == 1}">selected</c:if>>��ü</option>
	    	<option value="2"<c:if test="${pm.criteria.type == 1}">selected</c:if>>����</option>
	    	<option value="3"<c:if test="${pm.criteria.type == 1}">selected</c:if>selected>����</option>
	    	<option value="4"<c:if test="${pm.criteria.type == 1}">selected</c:if>>�ۼ���</option>
	    </select>
	     </div>
	     <input type="text" class="form-control" name="Search" placeholder="search" value="${pm.criteria.search}">
	     <div class="input-group-append">
	      <button class="btn btn-success" type="submit">Go</button>  
	     </div>
	  </form>
  <table class="table">
    <thead class="thead-dark">
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
        <td><a href="<%=request.getContextPath()%>/board/detail?num=${board.num}&page=${pm.criteria.page}&search=${pm.criteria.search}&type=${pm.criteria.type}">${board.title}</a></td>
        <td>${board.writer}</td>
        <td>${board.registerDate}</td>
        <td>${board.views}</td>
      </tr>
     </c:forEach>
    </tbody>
  </table>
  <ul class="pagination justify-content-center">
  <c:if test="${pm.prev}">
    <li class="page-item"><a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pm.startPage-1}&search=${pm.criteria.search}&type=${pm.criteria.type}">����</a></li>
  </c:if>
    <c:forEach begin="${pm.startPage}" end="${pm.endPage}" var="index">
    	<c:if test="${index == pm.criteria.page}">
    		<li class="page-item active"><a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${index}&search=${pm.criteria.search}&type=${pm.criteria.type}">${index} </a></li>
    	</c:if>
    	<c:if test="${index != pm.criteria.page}">
    		<li class="page-item"><a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${index}&search=${pm.criteria.search}&type=${pm.criteria.type}">${index} </a></li>
   		</c:if>
   	</c:forEach>
   	<c:if test="${pm.next}">
    	<li class="page-item"><a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pm.endPage+1}&search=${pm.criteria.search}&type=${pm.criteria.type}">����</a></li>
    </c:if>
  </ul>
	<a href="<%=request.getContextPath()%>/board/register">
		<button type="button" class="btn btn-outline-info">���</button>
	</a>
</div>
</body>
</html>