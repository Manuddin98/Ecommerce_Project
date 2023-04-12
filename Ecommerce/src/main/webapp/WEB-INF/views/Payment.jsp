<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@include file="/WEB-INF/views/ForUser.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
<form action="<c:url value="/receipt"/>" method="post">

<table class="table table-bordered" width="50%" align="center">

<tr class="success">
<td colspan="2"><center>Payment Detail</center></td>
</tr>

<tr class="info">
<td colspan="2">
<center>

<input type="radio" name="rd" value="cc">Credit Card
<input type="radio" name="rd" value="cod">Cash On Delivery

</center>
</td>
</tr>


<tr class="warning">

<td>Card number</td>
<td><input type="text" name="cardno"/></td>
</tr>

<tr class="warning">

<td>Valid <input type="text" name="valid"/></td>
<td>CVV <input type="text" name="CVV"/></td>
</tr>

<tr class="warning">
<td>Name</td>
<td><input type="text" name="name"/></td>

</tr>

<tr class="success">

<td colspan="2"><center><input type="submit" value="Pay" class="btn btn-success"/></center></td>
 
</tr>






</table>


</form>


</div>


</body>
</html>