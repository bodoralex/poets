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
</head>
<body>

<%
    if(request.getSession().getAttribute("user") != null){
        response.sendRedirect("/mainpage");
    }
%>

<form action="${pageContext.request.contextPath}/auth" method="post">
    <input name="username" placeholder="username" value="arany">
    <%--TODO kivenni!--%>
    <input name="password" type="password" placeholder="password" value="janos">
    <input type="submit" value="Login">
</form>

<%  try {
        if (!((boolean) request.getAttribute("success"))) {
            out.print("It's incorrect!");
        }
    }catch (Exception e){}
%>

</body>
</html>
