<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="/WEB-INF/views/ForUser.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <%@ page isELIgnored = "false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
<table class="table table-sm table-light">
  

    <tr class="danger">     
      <td colspan="6"><center>RECEIPT</center></td>        
    </tr>
    
    <tr class="info">     
      <td>ORDER ID</td>    
      <td>ORD000${orderDetail.orderID}</td>  
      <td>Date</td> 
      <td colspan="2">${orderDetail.orderDate}</td>    
    </tr>
    
     <tr>     
      <td colspan="5"><h3>ORDER ITEMS</h3></td>    
         
    </tr>
    
     <tr >     
      <td>Product Id</td>    
      <td>Product Name</td>  
      <td>Quantity</td> 
      <td>Price</td>    
      <td>SubTotal</td>  
    </tr>
    
    <c:forEach items="${cartItemList}" var="cartItem">
    
    <tr class="info">     
      <td>${cartItem.productId}</td>    
      <td>${cartItem.productName}</td>  
      <td>${cartItem.quantity}</td> 
      <td>${cartItem.price}</td>    
      <td>${cartItem.price}*${cartItem.quantity}</td>  
    </tr>
    
    
    </c:forEach>
    
    
     <tr class="warning">     
      <td colspan="4">Total Purchase Amount</td>    
      <td colspan="1">${grandTotal}</td>  
       
    </tr>
    
     <tr class="warning">     
      <td colspan="5">Shipping Address</td>         
           </tr>
           
           <tr class="info">     
      <td>Address</td>    
      <td colspan="4">${addr}</td>  
       
    </tr>
    
 
</table>


</div>

</body>
</html>