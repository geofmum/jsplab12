<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="/login" method="post">
    <label for="username">Username</label>
    <input type="text" name="username" id="username" value="${cookie.username.value}"/>
    <label for="password">Password</label>
    <input type="password" name="password" id="password"/>
    <label><input type="checkbox" name="remember_me" value="yes"
                  <c:if test="${cookie.username.value != null}">checked</c:if>
    /> Remember me</label>

    <input type="submit" value="login">
</form>
</body>
</html>
