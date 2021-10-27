<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de bajas</title>
</head>
<body>


	<h1>Formulario de bajas</h1>
	<form action="DeleteServlet" method="post">
		<input name="form" value="deleteServlet" type="hidden"> 
		Nombre de la persona a borrar: <input name="nombre" type="text"><br>
		<button>Enviar</button>
	</form>
</body>
</html>