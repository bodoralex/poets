<%--
  Created by IntelliJ IDEA.
  User: bodor
  Date: 2017.04.21.
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/index.css">
</head>
<body>

<%
    if(request.getSession().getAttribute("user") != null){
        response.sendRedirect("/mainpage");
    }
%>

<form action="${pageContext.request.contextPath}/auth" method="post">
    <input name="username" placeholder="username" value="arany">

    <input name="password" type="password" placeholder="password" value="janos">
    <input type="submit" value="Login">
</form>

<table>
    <tr>
        <th>user</th>
        <th>pw</th>
    </tr>
    <tr>
        <td>arany</td>
        <td>janos</td>
    </tr>
    <tr>
        <td>jokai</td>
        <td>mor</td>
    </tr>
    <tr>
        <td>petofi</td>
        <td>sandor</td>
    </tr>
</table>

<%  try {
        if (!((boolean) request.getAttribute("success"))) {
            out.print("It's incorrect!");
        }
    }catch (Exception e){}
%>

</body>
</html>
