<%@ page language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>

<%
    // Get name from form
    String name = request.getParameter("username");

    // Set session attribute
    session.setAttribute("user", name);

    // Set session timeout = 1 minute (60 seconds)
    session.setMaxInactiveInterval(60);
%>

<h2>Hello <%= name %>!</h2>
<p>Your session will expire in 1 minute.</p>

<a href="check.jsp">Check Session</a>

</body>
</html>