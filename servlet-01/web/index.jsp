<%--
  Created by IntelliJ IDEA.
  User: liam
  Date: 20-1-4
  Time: 下午8:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<div style="alignment: center">
    <form action="${pageContext.request.contextPath}/get" method="post">
        <label>
            账号：<input type="text" name="username"><br>
        </label>
        <label>
            密码：<input type="password" name="password"><br>
        </label>
        <button type="submit">提交</button>
    </form>
</div>
</body>
</html>
