<%@ page language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>

<h2>Student Result</h2>

<p><b>Roll No:</b> <%= request.getAttribute("rollno") %></p>
<p><b>Name:</b> <%= request.getAttribute("name") %></p>

<p>Sub1: <%= request.getAttribute("sub1") %></p>
<p>Sub2: <%= request.getAttribute("sub2") %></p>
<p>Sub3: <%= request.getAttribute("sub3") %></p>
<p>Sub4: <%= request.getAttribute("sub4") %></p>
<p>Sub5: <%= request.getAttribute("sub5") %></p>

<p><b>Average:</b> <%= request.getAttribute("average") %></p>
<p><b>Result:</b> <%= request.getAttribute("result") %></p>

<br>
<a href="index.jsp">Go Back</a>

</body>
</html>