<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String Mid = "1111", Mpw = "1111";
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	if(Mid.equals(id) && Mpw.equals(pw)) {
		response.sendRedirect("localEdit_tour.jsp");
	} else {
		response.sendRedirect("localEdit_login.jsp");
	}
%>
</body>
</html>