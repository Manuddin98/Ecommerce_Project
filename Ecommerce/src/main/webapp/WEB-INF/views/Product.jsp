 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="/WEB-INF/views/Header.jsp" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <%@ page isELIgnored = "false" %>
    
    <br><br>
    <form:form action="InsertProduct" modelAttribute="product" method="post" enctype="multipart/form-data">
    <table align="center" class="table-bordered">
    
    <tr>
    <td colspan="2"><center>Product info</center></td>
    
    </tr>
    
    <tr>
    <td>Product Name</td>
    <td><form:input path="productName"/></td>    
    </tr>
    
    <tr>
    <td>Price</td>
    <td><form:input path="price"/></td>    
    </tr>
    <tr>
    <td>Stock</td>
    <td><form:input path="stoct"/></td>    
    </tr>
    
     <tr>
    <td>CategoryID</td>
    <td><form:input path="categoryId"/></td>    
    </tr>
    
     <tr>
    <td>Supplier</td>
    <td><form:input path="supplierId"/></td>    
    </tr>
    
    <tr>
    <td>Product Description</td>
    <td><form:input path="productDesc"/></td>    
    </tr>
    
    <tr>
    <td>Product image</td>
    <td><form:input type="file" path="pimage"/></td>    
    </tr>
   
   <tr>
    <td colspan="2"><center><input type="submit" value="Insert Product"/></center></td> 
    </tr>
  
</table>

    
    
    
    </form:form>
    
    
    <<table class="table-bordered">
  <tr>
  <td>Product Id</td>
   <td>Product Name</td>
    <td>Price</td>
     <td>Stock</td>
      <td>Supplier</td>
       <td>Operations</td>
  
      </tr>
      
      <c:forEach items="${productList}" var="product">
      <tr>
      <td>${product.productId}</td>
      <td>${product.productName}</td>
      <td>${product.price}</td>
      <td>${product.stoct}</td>
      <td>${product.supplierId}</td>
      
      <td><a href="<c:url value="/editProduct/${product.productId}"/>" class="btn btn-success">EDIT</a></td>
 <td><a href="<c:url value="/deleteProduct/${product.productId}"/>" class="btn btn-danger">DELETE</a></td>
      
      </tr>
      </c:forEach>
 
</table>

    