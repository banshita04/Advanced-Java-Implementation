<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<font size = 10 color="orange">CALCULATOR</font>
	<br>
	<form action="cal.htm">
	Enter num1: <input type="text" name="num1">
	<br>
	Enter num2: <input type="text" name="num2">
	<br>
	<input type="submit" value="Add" name="calc">
	<input type="submit" value="Subtract" name="calc">
	<input type="submit" value="Multiply" name="calc">
	<input type="submit" value="Divide" name="calc">
	</form>
${msg}
</body>
</html>