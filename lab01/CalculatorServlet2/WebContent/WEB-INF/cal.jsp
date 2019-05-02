
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
		"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Calculate</title>
</head>
<body>
	<form action='calc2' method='get'>
		<input type='text' size='2' name='add1' value='${add1}' />+ <input
			type='text' size='2' name='add2' value='${add2}' /> =<input
			type='text' size='4' name='sum' value='${sum}' readonly /> <br /> <input
			type='text' size='2' name='mult1' value='${mult1}' />* <input
			type='text' size='2' name='mult2' value='${mult2}' />= <input
			type='text' size='4' name='product' value='${product}' readonly /><br />
		<input type='submit' value='Submit' />
	</form>
</body>
</html>