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
						<a href="#">Nuevo Pedido</a><span> » </span>
						Completar Pedido
					</div>
				</div>
				
				<div class="width-100 fleft">
					<div id="" class="box-60 border-black">			
						<h2>Forma de Pago</h2>
						<p>Seleccione la forma de pago que desea para su pedido</p>
						<div class="" style="margin: 10px 0px 10px 30%">
							<br>
							Forma de Pago: 
							<select>
						   		<option value="contado">Contado</option>
						   		<option value="credito">credito</option>
						   		<option value="especial">Especial</option>
						 	</select>
						 </div>													
					</div>		
					<div class="clear-30px"></div>	
					<div id="" class="box-60 border-black">			
						<h2>Reparto</h2>
						<p>Seleccione el reparto que desea para su pedido</p>
						<div class="" style="margin: 10px 0px 30px 30%">
						 	<table>
						 		<tr>
									<td>&nbsp;</td>
									<td><input type="checkbox" name="pago" value="RepartoJet">&nbsp;&nbsp; Reparto JET</td>
								</tr>
								<tr>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
						 		<tr>
									<td>Numero de Reparto:&nbsp;&nbsp;</td>
									<td>
										<select>
									   		<option value="Reparto1">Reparto1</option>
									   		<option value="Reparto2">Reparto2</option>
									   		<option value="Reparto3">Reparto3</option>
									   		<option value="Reparto4">Reparto4</option>
									   		<option value="Repartox">...</option>
									   		<option value="RepartoN">RepartoN</option>
									 	</select>
									 </td>
								</tr>
							</table>
						 </div>
						<div class="" style="margin-left: 20%">
							<form action="productos.jsp">
								<input type="submit" value="Seleccionar Productos" />
								<input type="button" value="Enviar Pedido" />	
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