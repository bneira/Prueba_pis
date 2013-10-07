<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%@include file="includes/head.jsp" %>

<title>Drogueria Uruguay - Mi cuenta</title>
</head>
<body>
	<div id="container">
	
		<%@include file="includes/header.jsp" %>
	
		<div id="principal">
			<div id="contenido" >
				<div id="contenido-top">
					<div id="ruta">
						<a href="index.jsp">Inicio</a><span> » </span>
						<a href="#">Mi Cuenta</a><span> » </span>
						Ver Pedido Actual
					</div>
				</div>	
				
				<div id="contenido-middle">
					<%@include file="includes/menu-izquierdo.jsp" %>
					<div id="contenido-derecho">
						<div class="box-90 listado">
							<h1 class="titulo">Pedido en Curso</h1>
								<table width="100%">
									<thead>
										<tr>
											<th width="50%">Nombre</th>
											<th>Cantidad Con Receta</th>
											<th>Cantidad Sin Receta</th>
											<th>Acciones</th>
										</tr>							
									</thead>
									<tr class="impar">
										<td>Nombre 1</td>
										<td>2</td>
										<td>3</td>
										<td><a href="#">Editar</a> <a href="#">Borrar</a></td>
									</tr>
									<tr>
										<td>Nombre 2</td>
										<td>2</td>
										<td>5</td>
										<td><a href="#">Editar</a> <a href="#">Borrar</a></td>								
									</tr>
									<tr class="impar">
										<td>Nombre 3</td>
										<td>0</td>
										<td>3</td>
										<td><a href="#">Editar</a> <a href="#">Borrar</a></td>								
									</tr>
									<tr>
										<td>Nombre 4</td>
										<td>3</td>
										<td>4</td>
										<td><a href="#">Editar</a> <a href="#">Borrar</a></td>								
									</tr>
									<tr class="impar">
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
									</tr>
									<tr class="impar">
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
									</tr>
									<tr class="impar">
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
									</tr>
									<tr class="impar">
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>								
									</tr>							
								</table>
						</div>
						<div class="fright margin5">					
						<form class="fright" action="seleccionar-reparto.jsp">
							<input type="submit" value="Completar Pedido" />			
						</form>		
						<form class="fright" action="productos.jsp">
							<input type="submit" value="Ver Productos" />			
						</form>	
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