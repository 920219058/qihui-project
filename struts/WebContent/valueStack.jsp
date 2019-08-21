<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 使用struts2标签查看值栈结构 -->
	<s:debug></s:debug>
	
	<!-- 获取字符串值 -->
	<s:property value="userName"/>
	
	<br/>
	获取值栈对象：
	<br/>
	<!-- 获取值栈的对象 -->
	
	<s:property value="user.username"/>
	<s:property value="user.password"/>
	<s:property value="user.address"/>
	<br/><br/><br/>
	获取值栈list集合第一种方式：
	<br/>
	<s:property value="userList[0].username"/>
	<s:property value="userList[0].password"/>
	<s:property value="userList[0].address"/>
	<br/>
	<s:property value="userList[1].username"/>
	<s:property value="userList[1].password"/>
	<s:property value="userList[1].address"/>
	<br/><br/>
	获取值栈list集合第二种方式：
	<br/>
	<s:iterator value="userList">
		<s:property value="username"/>
		<s:property value="password"/>
		<s:property value="address"/>
	</s:iterator>
	<br/><br/>
	获取值栈list集合第三种方式：
	<br/>
	<s:iterator value="userList" var="user">
		<%--遍历值栈list集合，得到的user对象
			机制：把每次比那里出来的user对象放到context里面；获取context数据需要些ongl表达式 需要特殊符号#
		 --%>
		<s:property value="#user.username"/>
		<s:property value="#user.password"/>
		<s:property value="#user.address"/>
	</s:iterator>
	
	<br/>
	<%-- 
	set、push方法：
	<s:property value="itcast"/>
	
	<br/>
	<!-- 获取push方法的数据 -->
	<s:property value="[0].top"/>--%>
	<br/><br/>
	<%-- 使用forech标签+el表达式获取值栈list集合数据 --%>
	 使用forEach 标签：
	<c:forEach items="${userList}" var="user">
		${user.username}
		${user.password}
		${user.address}
	</c:forEach>
</body>
</html>