<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/9/15
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>欢迎页面</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/view/addList.jsp">添加</a>
<table border="1" cellpadding="0" cellspacing="0">
    <tr>
        <th width="80">编号</th>
        <th width="120">账户</th>
        <th width="100">余额</th>
        <th width="100">操作</th>
    </tr>
    <c:forEach items="${halist}" var="haha">
        <tr>
            <td>${haha.id}</td>
            <td>${haha.name}</td>
            <td>${haha.money}</td>
            <td>
                &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/controller/getHaha?id=${haha.id}">修改</a>
                &nbsp;&nbsp;<a href="/controller/delHaha?id=${haha.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
