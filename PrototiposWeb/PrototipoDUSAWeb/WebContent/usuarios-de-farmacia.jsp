<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%@include file="includes/head.jsp" %>

<title>Drogueria Uruguay - Modificación de Usuarios</title>
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
						Modificación de Usuarios
					</div>
				</div>
				
				<div id="contenido-middle">
					<%@include file="includes/menu-izquierdo.jsp" %>
					<div id="contenido-derecho">		
						<div class="box-90 listado">
							<h1 class="titulo">Ver Usuarios</h1>
								<table width="100%">
									<thead>
										<tr>
											<th>Id</th>
											<th>Nombre</th>
											<th>rol</th>
											<th>Estado</th>
											<th>Editar</th>
											<th>Borrar</th>
										</tr>							
									</thead>
									<tr class="impar">
										<td>1</td>
										<td>Nombre 1</td>
										<td>rol 1</td>
										<td>Habilitado</td>
										<td><a href="#">Editar</a></td>	
										<td><a href="#">Borrar</a></td>								
									</tr>
									<tr>
										<td>2</td>
										<td>Nombre 2</td>
										<td>rol 1</td>
										<td>Deshabilitado</td>
										<td><a href="#">Editar</a></td>	
										<td><a href="#">Borrar</a></td>									
									</tr>
									<tr class="impar">
										<td>3</td>
										<td>Nombre 3</td>
										<td>rol 3</td>
										<td>Deshabilitado</td>
										<td><a href="#">Editar</a></td>	
										<td><a href="#">Borrar</a></td>								
									</tr>
									<tr>
										<tr class="impar">
										<td>4</td>
										<td>Nombre 4</td>
										<td>rol 3</td>
										<td>Habilitado</td>
										<td><a href="#">Editar</a></td>	
										<td><a href="#">Borrar</a></td>								
									</tr>	
									<tr class="impar">
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>							
									</tr>
									<tr>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>							
									</tr>
									<tr class="impar">
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>									
									</tr>
									<tr>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>							
									</tr>
									<tr class="impar">
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>									
									</tr>
									<tr>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>							
									</tr>
									<tr class="impar">
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>								
									</tr>							
								</table>
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