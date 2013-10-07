<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%@include file="includes/head.jsp" %>

<title>Drogueria Uruguay - Mi perfil</title>
</head>
<body>
	<div id="container">
	
		<%@include file="includes/header.jsp" %>
	
		<div id="principal">
			<div id="contenido">
				<div id="contenido-top">
					<div id="ruta">
						<a href="mi-cuenta.jsp">Inicio</a><span> » </span>
						<a href="mi-cuenta.jsp">Mi Cuenta</a><span> » </span>
						Cambiar Contraseña
					</div>
				</div>		
				
				<div id="contenido-middle">
					<%@include file="includes/menu-izquierdo.jsp" %>
					<div id="contenido-derecho">
						<form action="" class="formulario">
							<div class="box-90">			
								<h1 class="titulo">Cambiar Contraseña</h1>	
									<div class="linea-form input-text">
										<label>Contraseña antigua: </label>
										<input type="password"/>
									</div>
									<div class="linea-form input-text">
										<label>Nueva contraseña: </label>
										<input type="password"/>
									</div>
									<div class="linea-form input-text">
										<label>Confirme su contraseña: </label>
										<input type="password" />
									</div>	
								
								<div class="fright" style="width:100%;">
									<input class="fright" style="margin: 30px 10px 0px 0px;" type="button" value="Guardar" />
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>

	<div id="clearfooter"></div>
	</div>
	
	<%@include file="includes/footer.jsp" %>
	
</body>
</html>