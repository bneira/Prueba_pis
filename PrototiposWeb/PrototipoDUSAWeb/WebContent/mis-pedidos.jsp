<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%@include file="includes/head.jsp" %>

<title>Drogueria Uruguay - Mis Pedidos</title>
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
						Mis Pedidos
					</div>
				</div>
				
				<div id="contenido-middle">
					<%@include file="includes/menu-izquierdo.jsp" %>
					<div id="contenido-derecho">		
						<div class="box-90 listado">
							<h1 class="titulo">Mis Pedidos</h1>
								<table width="100%">
									<thead>
										<tr>
											<th width="15%">Id</th>
											<th width="25%">Fecha</th>
											<th width="20%">Reparto</th>
											<th width="20%">Estado</th>
											<th width="20%">Informacion</th>
										</tr>							
									</thead>
									<tr class="impar">
										<td>1</td>
										<td>26/08/2013</td>
										<td>Reparto 3</td>
										<td>Entregado</td>
										<td><a href="#">Ver Detalles</a></td>								
									</tr>
									<tr>
										<td>2</td>
										<td>26/08/2013</td>
										<td>Reparto 5</td>
										<td>Entregado</td>
										<td><a href="#">Ver Detalles</a></td>								
									</tr>
									<tr class="impar">
										<td>3</td>
										<td>27/08/2013</td>
										<td>Reparto 1</td>
										<td>Entregado</td>
										<td><a href="#">Ver Detalles</a></td>								
									</tr>
									<tr>
										<td>4</td>
										<td>27/08/2013</td>
										<td>Reparto 3</td>
										<td>Entregado</td>
										<td><a href="#">Ver Detalles</a></td>								
									</tr>
									<tr class="impar">
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
									</tr>
									<tr class="impar">
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
									</tr>
									<tr class="impar">
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
									</tr>
									<tr class="impar">
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