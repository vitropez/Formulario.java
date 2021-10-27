<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulario de altas</title>
</head>
<body>
	<h1>formulario de altas</h1>
		<form action="CreateServlet" method="post">
			<input name="form" value="CreateServlet" type="hidden">
			Nombre:<input name="nombre" value="nombre" type="text"><br>
			Dirección:<input name="direccion" value="nombre" type="text"><br>
			Telefono:<input name="telefono" value="nombre" type="text"><br>
			Edad:<input name="edad" value="nombre" type="text"><br>
			Nivel de amistad:<select name="niveldeamistad">
				<option>1</option>
				<option>2</option>
				<option>3</option>
				<option>4</option>
				<option>5</option>
				<option>6</option>
				<option>7</option>
				<option>8</option>
				<option>9</option>
				<option>10</option>
				</select><br>
			Comentarios:<textarea name="comentarios" rows="4" cols="20">
			</textarea><br>
			<input type="submit" value="enviar" >
		</form>

</body>
</html>