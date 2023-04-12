<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@include file="/WEB-INF/views/ForUser.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>

<form action="homeregistration" method="post">
<div align="center">
    Enter Name :        <input type="text" name="userName"/><br><br>

Enter Password :    <input type="password" name="password"/>  <br><br>

    Enter Role :        <input type="text" name="role"/><br><br>

 Enter Enabled :     <input type="text" name="enabled"/><br><br>

Enter Mobile No. :  <input type="text" name="cutomerNumber"/><br><br>

 Enter Address :     <input type="text" name="CustomerAddr"/><br><br>

<button type="submit">Submit</button>
</div>
</form>





</body>
</html>