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
 
<form action="<c:url value="/UpdateProduct"/>" method="post"  enctype="multipart/form-data">

<table align="center" class="table-bordered">

<tr>
<td colspan="2"><h2><center>Update Category</center></h2></td>
</tr>


<tr>
<td>Product Name</td>
<td><input type="text" name="productName" value="${product.productName}" /></td>
</tr>


<tr>
<td>Price</td>
<td><input type="text" name="price" value="${product.price}"/></td>
</tr>

<tr>
<td>Stock</td>
<td><input type="text" name="stoct" value="${product.stoct}"/></td>
</tr>
<tr>
<td>Product Id</td>
<td><input type="text" name="productId" value="${product.productId}" readonly/></td>
</tr>

<tr>
<td>Product Desc</td>
<td><input type="text" name="productDesc" value="${product.productDesc}"/></td>
</tr>

<tr>
<td>Category ID</td>
<td><input type="text" name="categoryId" value="${product.categoryId}"/></td>
</tr>

<tr>
<td>Supplier ID</td>
<td><input type="text" name="supplierId" value="${product.supplierId}"/></td>
</tr>

<tr>
<td>Image</td>
<td><input type="file" name="pimage" value="${product.pimage}"/></td>
</tr>


<tr>

<td colspan="2"><center><input type="submit" value="Update Category"/></center></td>
</tr>

</table>

</form>


</body>
</html>