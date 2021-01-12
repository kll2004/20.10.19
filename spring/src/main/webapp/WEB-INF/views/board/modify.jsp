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
	<h2>게시글 수정</h2>
		<c:if test="${board != null}">
		<form action="<%=request.getContextPath()%>/board/modify" method="post" enctype="multipart/form-data">
			<div class="form-group">
				<label for="num">번호</label>
				<input type="text" class="form-control" id="num" name="num" readonly value="${board.num}">
			</div>
			<div class="form-group">
				<label for="title">제목</label>
				<input type="text" class="form-control" id="title" name="title" value="${board.title}">
			</div>
			<div class="form-group">
				<label for="writer">작성자</label>
				<input type="text" class="form-control" id="writer" name="writer" readonly value="${board.writer}">
			</div>
			<div class="form-group">
				<label for="registerDate">작성일</label>
				<input type="text" class="form-control" id="registerDate" name="registerDate" readonly value="${board.registerDate}">
			</div>
			<div class="form-group">
				<label for="content">내용</label>
				<textarea class="form-control" id="content" name="content" >${board.content}</textarea>
			</div>
			
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
	    
			<c:if test="${fList.size() !=0 }">
				<div class="form-group">
					<label for="content">첨부파일</label>
					<c:forEach items="${fList}" var="file">
						<div><a href="<%=request.getContextPath()%>/board/download?fileName=${file.filename}">${file.oriFilename}</a></div>
					</c:forEach>
				</div>
			</c:if>
			<button type="submit" class="btn btn-outline-info">수정</button>
		</form>
		</c:if>
		<c:if test="${board == null}">
			<h1>존재하지 않은 게시물입니다.</h1>
		</c:if>
		<a href="<%=request.getContextPath()%>/board/register">
			<button type="button" class="btn btn-outline-info">글쓰기</button>
		</a>
	</div>
	<script>
		$(function(){
			$('form').submit(function(){
				var cnt = 0;
				$('input[name=fileList]').each(function(){
					if($(this).val() !=''){
						cnt++;
					}
				})
				if(cnt == 0){
					var res = confirm('새로운 첨부파일 없음, 이전 파일은 삭제. 수정하시겠습니까?');
					return res;
				}
				
				return true;
			})
		})
	</script>
</body>
</html>