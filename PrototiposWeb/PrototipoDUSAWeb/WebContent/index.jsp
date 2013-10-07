<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%@include file="includes/head.jsp" %>

<title>Drogueria Uruguay - Sistema de pedidos On-line</title>
</head>
<body>
	<div id="principal" style="">
		<div id="contenido" style="position: absolute; height: 90%; width:980px; margin-bottom: 0.5% ">

		<br><br><br>
		<h1 style="text-align: center;color: #3357B3;font-style: italic;">Bienvenido al sistema de pedidos online de Drogueria Uruguay S.A.</h1>
		<div class="fleft" style="margin-top: 270px;">
			<img alt="logo" src="${pageContext.request.contextPath}/images/logo.png" width="550px" height="130px"/>
		</div>
		<div id="login">
			<h2>Iniciar sesion</h2>
			<form action="mi-cuenta.jsp" method="POST" class="formulario">
				<div class="line-form">
					<label>Usuario:</label>
					<input type="text" name="usuario"/>
				</div>
				<div class="line-form">
					<label>Contraseña:</label>
					<input type="password" name="pass">
				</div>
				<div style="margin: 10px 0px 0px 100px">
					<a href="#" >Recuperar Contraseña</a><br/><br/>
					<input type="submit" value="Entrar">
				</div>
				
			</form>
		</div>
		</div>
	</div>
</body>
</html>