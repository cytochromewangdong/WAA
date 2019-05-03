<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib  uri="http://www.springframework.org/tags" prefix="spring" %>
 
<!DOCTYPE HTML>
<html>
<head>
<title><spring:message code="listProduct.head"/></title>
<style type="text/css">@import url(<spring:url value="css/main.css"/>);</style>
</head>
<body>
<div id="global">
    <h2><spring:message code="listProduct.title"/></h2>


<table>
		<tr><th><spring:message code="listProduct.name"/></th><th><spring:message code="listProduct.category"/></th>
		<th><spring:message code="listProduct.description"/></th></tr>

	<c:forEach var="product" items = "${products}">
		<tr>
		<td>${product.name}</td>
		<td>${product.category.name}</td>
		<td>${product.description}</td>
		</tr>
	</c:forEach>
</table>   

    <form action="product" method="get">
           <input id="submit" type="submit"  
                value='<spring:message code="listProduct.submit"/>'>
	</form>
     
</div>
</body>
</html>