<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 获取context里面的数据，写ognl时候，首先添加符号 #context的key名称.域对象名称 -->
	<%-- <s:property value="#request.req"/> --%>
	
	<!-- <input type="text" name="name" value=""> -->
	<s:textfield name="username" value="%{#request.req}"></s:textfield>
</body>
</html>