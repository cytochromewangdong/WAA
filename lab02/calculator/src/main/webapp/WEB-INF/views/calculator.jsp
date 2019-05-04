
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
		"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Calculate</title>
</head>
<body>
	<c:if test="${errors != null}">
		<p id="errors">Error(s)!
		<ul>
			<c:forEach var="error" items="${errors}">
				<li>${error}</li>
			</c:forEach>
		</ul>
	</c:if>
	<form action='calculate' method='post'>
		<input type='text' size='2' name='add1' value='${calculator.add1}' />+
		<input type='text' size='2' name='add2' value='${calculator.add2}' />
		=<input type='text' size='4' name='sum' value='${calculator.sum}'
			readonly /> <br /> <input type='text' size='2' name='mult1'
			value='${calculator.mult1}' />* <input type='text' size='2'
			name='mult2' value='${calculator.mult2}' />= <input type='text'
			size='4' name='product' value='${calculator.product}' readonly /><br />
		<input type='submit' value='Submit' />
	</form>
</body>
</html>