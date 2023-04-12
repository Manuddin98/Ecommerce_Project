<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="/WEB-INF/views/Header.jsp" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Category</title>
</head>
<body>
 
<form action="<c:url value="/UpdateCategory"/>" method="post"  >

<table align="center" class="table">

<tr>
<td colspan="2"><h2><center>Category</center></h2></td>
</tr>


<tr>
<td>Category Id</td>
<td><input type="text" name="catId" value="${category.categoryID}" readonly/></td>
</tr>


<tr>
<td>Category Name</td>
<td><input type="text" name="catName" value="${category.categoryName}"/></td>
</tr>

<tr>
<td>Category Desc</td>
<td><input type="text" name="catDesc" value="${category.categoryDesc}"/></td>
</tr>

<tr>

<td colspan="2"><center><input type="submit" value="Update Category"/></center></td>
</tr>

</table>

</form>


</body>
</html>