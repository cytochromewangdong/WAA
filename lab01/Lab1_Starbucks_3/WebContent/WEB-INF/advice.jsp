<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Advice List</title>
</head>
<body>
	<form action="../action/login" method="post">
		Starbuck's ${roast} Roast Coffees:
		<table>
			<c:forEach items="${adviceList}" var="advice" varStatus="loop">
				<c:choose>
					<c:when test="${loop.index%2 == 0}">
						<tr style="background-color: cyan">
					</c:when>
					<c:otherwise>
						<tr style="background-color: yellow">
					</c:otherwise>
				</c:choose>
				<td>${advice}</td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" value="Back">
	</form>
</body>
</html>
