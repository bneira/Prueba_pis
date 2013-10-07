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
						Mi Perfil
					</div>
				</div>		
				
				<div id="contenido-middle">
					<%@include file="includes/menu-izquierdo.jsp" %>
					<div id="contenido-derecho">
						<div class="box-90">
							<h1 class="titulo">Mi Perfil</h1>
							<div id="" class="box-50 aux border-black">
							<h2>Datos Usuario</h2>
									<table>
										<tr>
											<td width="100px">Nombre:</td>
											<td>Gonzalo Reyes</td>
										</tr>
										<tr>
											<td>Telefono:</td>
											<td>094 499657</td>
										</tr>
										<tr>
											<td>E-mail</td>
											<td>greyes@mail.com</td>
										</tr>
									</table>
							</div>
							<div class="clear-30px"></div>			
							<div id="" class="box-50  aux border-black">
								<h2>Datos Farmacia</h2>
								<table>
									<tr>
										<td width="100px">Nombre:</td>
										<td>Farmacia La Esmeralda</td>
									</tr>
									<tr>
										<td>Direccion:</td>
										<td>GARIBALDI 2248 2250</td>
									</tr>
									<tr>
										<td>Telefono:</td>
										<td>telefono de contacto</td>
									</tr>
									<tr>
										<td>E-mail</td>
										<td>flaesmeralda@adinet.com.uy</td>
									</tr>
									<tr>
										<td>Rut</td>
										<td>210001200011</td>
									</tr>														
								</table>
							</div>
							<div class="fright" style="width:100%;">
								<input class="fright" style="margin: 30px 10px 0px 0px;" type="button" value="Modificar Datos" />
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	<div id="clearfooter"></div>
	</div>
	
	<%@include file="includes/footer.jsp" %>
	
</body>
</html>