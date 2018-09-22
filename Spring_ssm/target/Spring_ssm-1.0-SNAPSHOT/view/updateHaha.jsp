<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <h3 style="color: red">${message}</h3>
    <form action="${pageContext.request.contextPath}/controller/updateHaha" method="post">
       <%--隐藏表单 ,用来保存账户id--%>
        <input type="hidden" name="id" value="${haha.id}">
        <table>
            <tr>
                <td>用户名:</td>
                <td><input type="text" name="name" value="${haha.name}"></td>
            </tr>
            <tr>
                <td>金额:</td>
                <td><input type="text" name="money" ${haha.money}></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="修改">
                </td>
            </tr>
        </table>
    </form>
</head>
<body>

</body>
</html>
