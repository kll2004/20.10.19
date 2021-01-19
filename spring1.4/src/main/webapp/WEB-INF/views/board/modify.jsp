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
	  <form action="<%=request.getContextPath()%>/board/modify" method ="post" enctype="multipart/form-data">
	    <div class="form-group">
	      <label>��ȣ</label>
	      <input type="text" class="form-control" name="num" value="${board.num}"readonly>
	    </div>
	    <div class="form-group">
	      <label>����</label>
	      <input type="text" class="form-control"  name="title"  value="${board.title}">
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
	      <label>��ȸ��</label>
	      <input type="text" class="form-control"  name="views"  value="${board.views}" readonly>
	    </div>
	    <div class="form-group">
	      <label>����</label>
	      <textarea rows="10" class="form-control"name="content">${board.content}</textarea>
	    </div>
	    <div class="form-group">
			<label for="writer">����÷������</label>
			<input type="file" class="form-control" id="writer" name="fileList">
			<input type="file" class="form-control" id="writer" name="fileList">
			<input type="file" class="form-control" id="writer" name="fileList">
		</div>
	    <c:if test="${fileList.size() != 0}">
		  	<div class="form-group">
				<label>÷������</label>
				<c:forEach items="${fileList}" var="file">
				<div><a href="<%=request.getContextPath()%>/board/download?fileName=${file.filename}">${file.oriFilename}</a></div>
				</c:forEach>
			</div>
		</c:if>
    		<button type="submit" class="btn btn-primary">����</button>
	  </form>  
	  </c:if>
	  <c:if test="${board == null || board.writer != user.id }">
	  	<h1>������ϴ� �Խñ��̳� �ۼ��ڰ� �ƴ�</h1>
	  </c:if>
	</div>
	<a href="<%=request.getContextPath()%>/boa.rd/list">
		<button type="button" class="btn btn-primary">���</button>
	</a>
	<a href="<%=request.getContextPath()%>/board/register">
		<button type="button" class="btn btn-primary">�۾���</button>
	</a>
	<script type="text/javascript">
	$(function(){
		/* - submit()�� return���� true�̸� submit�� �����ϰ�, false�̸� �������� �ʴ´�.
			��, return�� true�̸� ������ �����͸� �����ϰ�, false�̸� ������ �����͸� �������� �ʴ´�.*/
		$('form').submit(function(){
			/* ÷�������� ���ϸ��� �����ͼ� �ֿܼ� ����ϴ� �ڵ�*/
			/*var test1 = $('input[name=fileList]').eq(0).val();			
			console.log('ù��° ���� : ' + test1);*/
			/* ���ϸ��� �� ���ڿ��� ''�� ���� ������(�߰��� ÷�������� ������) ������ ����'*/
			var cnt =0;
			$('input[name=fileList]').each(function(){
				var fileName = $(this).val()
				if(fileName != ''){
					cnt++;
				}
			})
				if(cnt == 0){
					return confirm('���õ� ÷������ ����, �����Ͻðڽ��ϱ�?');
				}
			return true;
		});
	})
	</script>
	
</body>
</html>