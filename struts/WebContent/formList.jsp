<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/listDemo" method="post">
		username:<input type="text" name="list[0].username">
		</br>
		password:<input type="text" name="list[0].password">
		</br>
		address:<input type="text" name="list[0].address">
		</br></br>
		
		username:<input type="text" name="list[1].username">
		</br>
		password:<input type="text" name="list[1].password">
		</br>
		address:<input type="text" name="list[1].address">
		</br>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>