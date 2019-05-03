 <%@ taglib  uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE HTML>
<html>
<head>
<title><spring:message code="productDetail.head"/></title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
    <h4><spring:message code="productDetail.title"/></h4>

        <h5><spring:message code="productDetail.subtitle"/></h5>
        <spring:message code="productDetail.productName"/>${product.name}<br/>
        <spring:message code="productDetail.category"/>${product.category.name}<br/>
        <spring:message code="productDetail.description"/>${product.description}<br/>
        <spring:message code="productDetail.price"/>${product.price}
    
    <form action="listproducts" method="get">
           <input id="submit" type="submit"  
                value='<spring:message code="productDetail.listproduct"/>'>
	</form>
    
</div>
</body>
</html>