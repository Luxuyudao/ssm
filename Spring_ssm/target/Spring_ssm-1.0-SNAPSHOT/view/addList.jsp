<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/9/15
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加页面</title>
</head>
<body>
<h3 style="color: red">${message}</h3>
<form action="${pageContext.request.contextPath}/controller/addHaha" method="post">

    <table>
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>金额:</td>
            <td><input type="number" name="money" ></td>
        </tr>
        <tr>
            <td>
                 <input type="submit" value="添加">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
