<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Starbuck's</title>
</head>
<body>
	<h2>Ask for advice about your favorite roast:</h2>
	<p />
	<form action="advice" method="get">
		<select name="roast">
			<option value="-">--Choose Roast--</option>
			<option value="dark">Dark</option>
			<option value="medium">Medium</option>
			<option value="light">Light</option>
		</select> <br /> <br /> <input type="submit" value="Submit" />
	</form>
	<div id='advice'></div>
	<c:if test="${user==null}">
		<p />
	Login:
	<form action="login" method="post">
			Name: <input type="text" name="name" size="9" /><br /> Password: <input
				type="password" name="password" size="9" /><br /> <br /> <input
				type="submit" value="Log In" />
		</form>
	</c:if>
	<c:if test="${user!=null}">
		<form action="logout" method="post">
			<input type="submit" value="Logout" />
		</form>
	</c:if>
</body>
</html>