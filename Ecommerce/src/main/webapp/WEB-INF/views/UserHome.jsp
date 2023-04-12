<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/views/Header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <%@ page isELIgnored = "false" %>
    
    <h3></h3>
    
    <div class="row">
    
    <c:forEach items="${productList}" var="product">
    
    <div class="col-sm-4 col-md-3">
    
    <a href="<c:url value="/resources/images/${product.productId}"/>" class="thumbnail"> 
    
    <img  src="<c:url value="/resources/images/${product.productId}.jpg"/>" height="300" alt="Generic placeholder thumbnail"/>
    
    </a>
    
    <p align="center">${product.productName}</p>
    <p align="center">Price : ${product.productName}</p>
    <p align="center">Stock : ${product.stock}</p>
    
    </div>
    
    
    </c:forEach>
    
    
    </div>