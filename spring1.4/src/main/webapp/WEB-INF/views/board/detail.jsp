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
	<c:if test="${board != null }">
	  <form action="/action_page.php">
	    <div class="form-group">
	      <label>��ȣ</label>
	      <input type="text" class="form-control" name="num" value="${board.num}"readonly>
	    </div>
	    <div class="form-group">
	      <label>����</label>
	      <input type="text" class="form-control"  name="title"  value="${board.title}" readonly>
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
	      <textarea rows="10" class="form-control"name="content" readonly>${board.content}</textarea>
	    </div>
    	<div>
		  <button type="button" class="btn btn-<c:if test="${like == null || like.up != 1}">outline-</c:if>dark up">��õ</button>
		  <button type="button" class="btn btn-<c:if test="${like == null || like.up != -1}">outline-</c:if>dark down">����õ</button>
		</div>
    	<c:if test="${fLile.size() !=0}">
		  	<div class="form-group">
			<label>÷������</label>
			<c:forEach items="${fLile}" var="file">
			<div><a href="<%=request.getContextPath()%>/board/download?fileName=${file.filename}">${file.oriFilename}</a></div>
			</c:forEach>
			</div>
		</c:if>
	  </form>
	  </c:if>
	</div>
		<a href="<%=request.getContextPath()%>/board/list?page=${cri.page}&type=${cri.type}&search=${cri.search}">
			<button type="button" class="btn btn-primary">���</button>
		</a>
		<a href="<%=request.getContextPath()%>/board/register">
			<button type="button" class="btn btn-primary">�۾���</button>
		</a>
	<c:if test="${user != null && user.id == board.writer}">
		<a href="<%=request.getContextPath()%>/board/modify?num=${board.num}">
			<button type="button" class="btn btn-primary">����</button>
		</a>
		<a href="<%=request.getContextPath()%>/board/delete?num=${board.num}">
			<button type="button" class="btn btn-primary">����</button>
		</a>
	</c:if>
	<script type="text/javascript">
		var up = '${like.up}';
		console.log(up);
		$('.btn.up, .btn.down').click(function(){
			//��õ��ư�� Ŭ���ϸ�
			if($(this).hasClass('up')){
				//��õ���¿��� ��õ��ư�� Ŭ���ϸ�
				if(up == 1)
					up = 0;
				//��õ���°� �ƴѻ�Ȳ���� ��õ��ư�� Ŭ���ϸ�
				else
					up = 1;
					//����õ ��ư�� Ŭ���ϸ�
				}else{
					//����õ���¿��� ����õ��ư�� Ŭ���ϸ�
					if(up == -1)
					up = 0;
				//����õ���°� �ƴ� ��Ȳ���� ����õ��ư�� Ŭ���ϸ�
				else
					up = -1;
				}
			//��õ�Ǵ� ����õ�� ���
			if(up != 0){
			//��õ/����õ��ư ��ο� btn-darkŬ���� ���� btn-outline-dark�߰�
			$('.btn.up, .btn.down').removeClass('btn-dark').addClass('btn-outline-dark');
			//Ŭ���� ��ư�� btn-darkŬ���� �߰�, btn-outline-darkŬ���� ����
			$(this).addClass('btn-dark').removeClass('btn-outline-dark');
			//��õ/����õ�� ����� ���
			}else{
				//Ŭ���� ��ư��btn-darkŬ���� ����, btn-outline-darkŬ���� �߰�
				$(this).removeClass('btn-dark').addClass('btn-outline-dark');
			}
			var id = '${user.id}';
			if(id == ''){
				alert('��õ����� �α����� �̿밡��');
				return;
			}
			var boardNum = $('input[name=num]').val();
			var data = {'id' : id, 'boardNum':boardNum,'up':up};
			
			var obj = $(this);
			
			$.ajax({
				type : 'POST',
				url : '<%=request.getContextPath()%>/board/like',
				data : data,
				success : function(data){
					if(up == 1){
						alert('��õ')
					}else if(up == -1){
						alert('����õ')
					}else{
						//Ŭ���� ��ư�� ��õ�̸� ��õ�� ��ҵǾ����ϴ�.
						if(obj.hasClass('up'))
							alert('��õ�� ��ҵǾ����ϴ�.')
						//or ����õ�� ��ҵǾ����ϴ�.
						else{
							alert('����õ�� ��ҵǾ����ϴ�.')
						}
					}
				}
			})
		})
			//var id = '${user.id}';
			//if(id == ''){
			//	alert('ȸ���� ��õ ����')
			//	return;
			//}
			//var board = {}
			//var data = {'id' : id, 'boardnum':boardnum,'up':up};
			//var data = {'id' : id, 'boardNum':1,'up':1};
			
	</script>
</body>
</html>