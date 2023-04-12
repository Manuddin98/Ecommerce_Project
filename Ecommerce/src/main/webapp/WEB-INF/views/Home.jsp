<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<title>Insert title here</title>
</head>
<body>


<nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
  
  <div class="collapse navbar-collapse" id="navbarNav">
    <div class="container-fluid">

 
 

 
 <ul class="nav navbar-nav">
 
  <div class="navbar-header">
 <a class="navbar-brand" href="#">Fashion World</a>
 </div>
 
   <li><a class="nav-link" href="<c:url value='/adminhome'/>">HOME</a></li>
 
 <li><a class="nav-link" href="<c:url value='/login'/>">LOGIN</a></li>
 
  <li><a class="nav-link" href="<c:url value='/register'/>">REGISTER</a></li>
 
  <li><a class="nav-link" href="<c:url value='/aboutus'/>">ABOUT US</a></li>
  
  <li><a class="nav-link" href="<c:url value='/contactus'/>">CONTACT US</a></li>
  
  
  </ul>
  
  
  
 </div>
 
  </div>
 
</nav>


 <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img  src="<c:url value='resources/images/Bigbazar.jpg' />" alt="Los Angeles" style="width:100%;">
    </div>
    <div class="carousel-item">
     <img  src="<c:url value='resources/images/wc-banner.jpg' />" alt="Chicago" style="width:100%;">
    </div>
    <div class="carousel-item">
      <img  src="<c:url value='resources/images/winter-ware.jpg' />" alt="Chicago" style="width:100%;">
    </div>
     <div class="carousel-item">
      <img  src="<c:url value='resources/images/mobile.jpg.jpg' />" alt="Chicago" style="width:100%;">
    </div>
     <div class="carousel-item">
      <img  src="<c:url value='resources/images/Bigbazar.jpg' />" alt="Chicago" style="width:100%;">
    </div>
     <div class="carousel-item">
      <img  src="<c:url value='resources/images/Bigbazar.jpg' />" alt="Chicago" style="width:100%;">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
 
 
 
</body>
</html>