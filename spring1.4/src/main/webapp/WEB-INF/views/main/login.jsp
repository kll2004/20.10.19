<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="/test/login" method="POST">
    <div class="form-group">
      <label for="usr">ID:</label>
      <input type="text" class="form-control" id="usr" name="username">
    </div>
    <div class="form-group">
      <label for="pwd">PW:</label>
      <input type="password" class="form-control" id="pwd" name="password">
    </div>
    <button type="submit" class="btn btn-primary col-12">로그인</button>
  </form>
  <a href="#" class = "find-pw">비번찿기</a>
  
  <script type="text/javascript">
	  	$('.find-pw').click(function(){
		  var id = prompt('찿을 아이디를 입력');
		  var data = {'id' : id};
		  $.ajax({
				type : 'POST',
				url : '<%=request.getContextPath()%>/find/pw',
				data : data,
				success : function(data){
					if(data == "fail")
						alert('없는아이디')
					else
						alert('비밀번호를 메일로 전송완료.')
				},
			})
		})    	
  </script>
</body>
</html>