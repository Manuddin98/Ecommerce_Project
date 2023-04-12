<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="/WEB-INF/views/Header.jsp" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category Manager</title>
</head>
<body>


<form action="AddCategory" method="post">
<table align="center" class="table">


<tr>
<td colspan="2">

<center><h3>Category</h3> </center>

</td>


</tr>

<tr>

<td>Category Name</td>
<td><input type="text" name="catName"/></td>
</tr>

<tr>


 <td>Category Desc</td>
  <td><input type="text" name="catDesc"/> </td>


</tr>

<tr>

 <td colspan="2">
  <center><input type="submit" value="ADD-CATEGORY"/> </center>

</td>
</tr>



</table>

</form>

<table class="table-bordered">

<tr>
<td>Category Id</td>

<td>Category Name</td>

<td>Category Description</td>

<td>Operation</td>

<c:forEach items="${ListCotegories}" var="category">

<tr>
<td>${category.categoryID}</td>

<td>${category.categoryName}</td>

<td>${category.categoryDesc}</td>

<td><a href="<c:url value="/editCategory/${category.categoryID}"/>" class="btn btn-success">EDIT</a></td>

<td><a href="<c:url value="/deleteCategory/${category.categoryID}"/>" class="btn btn-danger">DELETE</a></td>


</tr>

</c:forEach>

</tr>


</table>




</body>
</html>