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
<!-- �л��̸��� input�±׿� �Է¹޾� ������ �����Ͽ� �������� ���۵� �̸��� �ֿܼ� ���.
	��, �����͸� ������ ������ �̸���name���� ���������͸� get���� ������, ���� url�� /test2 -->
	<form method="get" action="<%=request.getContextPath()%>/test2">
		<h1>����1</h1>
		<input type="text" name="name"><br>
		<button type="submit">����</button>
	</form>
<!-- �л� �̸��� ���̸�input�±׿� �Է¹޾� ������ �����Ͽ� �������� �ش� �л� ������ ���.
	��, ��Ʈ�ѷ�����TestVo�� �̿��Ͽ� ��� url�� test3�� mv.setViewName("/main/test2");�� ���� -->
	<form method="get" action="<%=request.getContextPath()%>/test3">
		<h1>����2</h1>
		<input type="text" name="name"><br>
		<input type="text" name="age"><br>
		<button type="submit">����</button>
	</form>
<!-- �л�3���� �̸��� input�±׿� �Է¹޾� ������ �����Ͽ� �������� �ش� �л� �̸����� ����ϼ���.
	��,��Ʈ�ѷ������� �л��̸��� �迭�� ó�� url�� /test4�� mv.setViewName("/main/test2");�� ���� -->
	<form method="get" action="<%=request.getContextPath()%>/test4">
		<h1>����3</h1>
		<input type="text" name="name"><br>
		<input type="text" name="name"><br>
		<input type="text" name="name"><br>
		<button type="submit">����</button>
	</form>
	<form method="get" action="<%=request.getContextPath()%>/test5">
		<h1>����4</h1>
		<input type="text" name="name"><br>
		<input type="text" name="name"><br>
		<input type="text" name="name"><br>
		<button type="submit">����</button>
	</form>
</body>
</html>