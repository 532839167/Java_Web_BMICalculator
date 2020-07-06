<%--
  Created by IntelliJ IDEA.
  User: vasil
  Date: 2020-07-05
  Time: 6:35 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>BMI Calculator</title>
  </head>
  <body>
      <p>BMI Calculator</p>
      <form action="bmiServlet" method="get">
        Name: <input type="text" name="name"> <br/>
        Weight (in kilogram): <input type="text" name="weight"> <br/>
        Height (in meter): <input type="text" name="height"> <br/>
        <input type="submit" value="submit">
      </form>
  </body>
</html>
