<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="/WEB-INF/views/ForUser.jsp" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ page isELIgnored = "false" %>
<div class="row">


<c:forEach items="${productList}" var="product">

<div class="col-sm-4 col-md-3">

<a href="<c:url value="/totalProductDisplay/${product.productId}" /> " class="thumbnail">

<img  src="<c:url value="/resources/images/${product.productId}.jpg"/>" alt="Generic placeholder thumbnail" >
</a>

<p align="center">${product.productName}</p>
<p align="center">Price:${product.price}</p>
<p align="center">Stock:${product.stoct}</p>

</div>

</c:forEach>



</div>