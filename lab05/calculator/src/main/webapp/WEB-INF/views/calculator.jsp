
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
		"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Calculate</title>
</head>
<body>
	<h1>${string}</h1>
	<form:form method="post" modelAttribute="calculator">
		<form:input size="2" path="add1" /> +
		<form:input size="2" path="add2" /> =
		<form:input size="4" path="sum" readonly="true" />
		<br />
		<form:input size="2" path="mult1" /> * 
		<form:input size="2" path="mult2" /> =
		<form:input size="4" path="product" readonly="true" />
		<br />
		<input type='submit' value='Submit' />

	</form:form>
</body>
</html>