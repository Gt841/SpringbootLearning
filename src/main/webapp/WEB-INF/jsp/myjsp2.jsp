<%--
  Created by IntelliJ IDEA.
  User: Guantao
  Date: 2020/9/11
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<h1>Springboot2.0整合JSTL教程 </h1>
消息:${msg}
<br/>
<c:forEach var="name" items="${list}">
    <li><a href="http://www.baidu.com/">${name}</a></li>
</c:forEach>
</body>
</html>
