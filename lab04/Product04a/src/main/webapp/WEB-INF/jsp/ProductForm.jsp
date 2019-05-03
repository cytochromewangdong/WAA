 <%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
  <%@ taglib  uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE HTML>
<html>
<head>
<title><spring:message code="productForm.head"/></title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>

<div id="global">
<form:form action="product" method="post" modelAttribute="product">
    <fieldset>
        <legend><spring:message code="productForm.title"/></legend>
        <p>
            <label for="category"><spring:message code="productForm.category"/></label>
		    <form:select path="category" items="${categories}" itemLabel="name" itemValue="id"/>
		    
        </p>
         
        <p>
            <label for="name"><spring:message code="productForm.name"/></label>
            <form:input  path="name"/>
        </p>
        <p>
            <label for="description"><spring:message code="productForm.description"/></label>
            <form:input  path="description"/>
        </p>
        <p>
            <label for="price"><spring:message code="productForm.price"/></label>
            <form:input path="price"/>
        </p>
        <p id="buttons">
            <input id="reset" type="reset" tabindex="4">
            <input id="submit" type="submit" tabindex="5" 
                value='<spring:message code="productForm.submit"/>'>
        </p>
    </fieldset>
</form:form>
</div>
</body>
</html>
