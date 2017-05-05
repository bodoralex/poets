<%@ page import="auth.Poet" %><%--
  Created by IntelliJ IDEA.
  User: bodor
  Date: 2017.05.04.
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Works</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/index.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-3.2.1.min.js"
            lang="javascript"></script>
    <script src="javaScript.js"></script>
    <%
        Poet user = null;
        try {
            if (request.getSession().getAttribute("user") == null) {
                response.sendRedirect("/login");
            } else {
                user = (Poet) request.getSession().getAttribute("user");
            }
        } catch (Exception e) {
        }
    %>
</head>
<body>

<div class="container">

    <header>
        <h1>Hello <%=user != null ? user.getFirstName() : null%></h1>
    </header>

    <nav>
        <ul>
        </ul>
        <span>Search: </span>
        <input type="text" id="search">
        <span id="counter">semennyi</span>
        <p id="logout">Logout</p>
    </nav>

    <article></article>

</div>

</body>

</html>
