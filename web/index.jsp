
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
  </head>
  <body>
  <form action="/login" method="post">
    <label for="username">Username</label>
    <input type="text" name="username" id="username" />
    <label for="password">Password</label>
    <input type="password" name="password" id="password" />

    <input type="submit" value="login">
  </form>
  </body>
</html>
