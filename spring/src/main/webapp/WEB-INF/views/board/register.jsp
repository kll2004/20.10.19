<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.js"></script>
</head>
<body>
	<div class="container">
	<h2>게시글 등록</h2>
	<form action="<%=request.getContextPath()%>/board/register" method="Post" enctype="multipart/form-data">
		<div class="form-group">
			<label for="title">제목</label>
			<input type="text" class="form-control" id="title" name="title">
		</div>
		<div class="form-group">
			<label for="writer">작성자</label>
			<input type="text" class="form-control" id="writer" name="writer" readonly value="${user.id}">
		</div>
		<div class="form-group" style="display:none">
			<label for="content">내용</label>
			<textarea class="form-control" id="content" name="content"></textarea>
		</div>
		<div id="summernote"></div>
		<div class="form-group">
	        <label>파일</label>
	        <input type="file" class="form-control" name="fileList"/>
	    </div>
	    <div class="form-group">
	        <label>파일</label>
	        <input type="file" class="form-control" name="fileList"/>
	    </div>
	    <div class="form-group">
	        <label>파일</label>
	        <input type="file" class="form-control" name="fileList"/>
	    </div>
	    
		<button type="submit" class="btn btn-outline-info">등록</button>
	</form>
		<a href="<%=request.getContextPath()%>/board/list">
			<button type="button" class="btn btn-outline-info">목록</button>
		</a>
	</div>
	<script>
      $('#summernote').summernote({
        placeholder: 'Hello Bootstrap 4',
        tabsize: 2,
        height: 100
      });
      $('form').submit(function(){
    	  var code = $('#summernote').summernote('.code');
    	  $('textarea[name=content]').val(code);
      })
    </script>
</body>
</html>