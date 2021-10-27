<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Formulario de actualización</h1>
	<form action="UpdateServlet" method="post">
		<input name="form" value="updateServlet" type="hidden"> 
		Nombre anterior: <input name="nombreAnterior"type="text"><br>
		Nuevo nombre: <input name="nombre" type="text"><br>
		Nueva dirección <input name="direccion" type="text"><br>
		Nuevo teléfono: <input name="telefono" type="text"><br>
		Nueva edad: <input name="edad" type="text"><br>
		Nuevo nivel de amistad: <select name="nivelAmistad">
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
		</select> <br> 
		Nuevos comentarios:	<textarea name="comentarios" rows="4" cols="20"> </textarea><br>
		<button>Enviar</button>
	</form>
</body>
</html>