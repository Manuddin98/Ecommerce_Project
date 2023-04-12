<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fashion</title>

<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


</head>
<body>


 
 <div class="container">
 <nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
 
 <div class="container-fluid">
 <div class="navbar-header">
 <a class="navbar-brand" href="#">Fashion World</a>
 </div>
 
 

 
 <ul class="nav navbar-nav">
 <li><a class="nav-link" href="<c:url value='/login'/>">LOGIN</a></li>
 
  <li><a class="nav-link" href="<c:url value='/register'/>">REGISTER</a></li>
 
  <li><a class="nav-link" href="<c:url value='/aboutus'/>">ABOUT US</a></li>
  
  <li><a class="nav-link" href="<c:url value='/contactus'/>">CONTACT US</a></li>
  </ul>
  
  
  <%-- <c:if test="${sessionScope.loggedIn}">
  <c:if test="{sessionScope.role=='ROLE_ADMIN'}"> --%>
  <ul>
  <li><a class="nav-link" href="<c:url value='/adminhome'/>">HOME</a></li>
   <li><a class="nav-link" href="<c:url value='/product'/>">MANAGE PRODUCT</a></li>
   
   <li><a class="nav-link" href="<c:url value='/category'/>">MANAGE CATEGORY</a></li>
   
   <li><a class="nav-link" href="<c:url value='/productDisplay'/>">PRODUCT CATALOG</a></li>
    <li><a  class="nav-link" href="<c:url value='/cart'/>">CART</a></li>
 </ul>
<%--  </c:if> --%>
 
<c:if test="{sessionScope.role=='Role_User'}">
 
 
 <li><a href="<c:url value='/username'/>">HOME</a></li>
 
  <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" >">CATEGORY <span class="caret"></span></a>
 <ul class="dropdown-menu">
 <li><a class="nav-link" href="<c:url value='/mens'/>">Men's</a></li>
 
  <li><a class="nav-link" href="<c:url value='/productDisplay'/>">Women's</a></li>
   <li><a class="nav-link" href="<c:url value='/productDisplay'/>">Kid's</a></li> 
 </ul>
 </li>
 
  <li><a class="nav-link" href="<c:url value='/aboutus'/>">ABOUT US</a></li>
  
  <li><a class="nav-link" href="<c:url value='/contactus'/>">CONTACT US</a></li>
  
   <li><a  class="nav-link" href="<c:url value='/cart'/>">CART</a></li>
 
 
 </c:if>
 
 <%-- </c:if> --%>
 
 <c:if test="${sessionScope.loggedIn}">
 <div class="nav navbar-nav navbar-right">
 <font color="white" face="calibri" size="2">Welcome:${sessionScope.username}</font>
 
 <a href="<c:url value='/perform_logout' />" class="btn btn-danger">LOGOUT</a>
 </div>
 
 </c:if>
 
 
 
 </div>
 
 </nav>
 
 </div>
</body>
</html>