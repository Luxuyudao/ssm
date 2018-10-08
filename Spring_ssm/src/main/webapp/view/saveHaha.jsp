<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <h3 style="color: red">${message}</h3>
    <form action="${pageContext.request.contextPath}/controller/saveHaha" method="post">

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
</head>
<body>

</body>
</html>
