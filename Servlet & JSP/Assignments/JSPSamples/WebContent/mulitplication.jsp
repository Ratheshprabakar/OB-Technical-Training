<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<%! int multiplier, result;%>
<%String mul = request.getParameter("number");
if((mul.equals("")||mul==null)){
	RequestDispatcher rd = request.getRequestDispatcher("index.html");
	rd.include(request, response);
}else{
	multiplier = Integer.parseInt(mul);
	for(int i=1; i<=10;i++){
		result = i * multiplier;
		out.println(i+" x "+multiplier+" = "+result+"<br>");
	}
} %>
</body>
</html>