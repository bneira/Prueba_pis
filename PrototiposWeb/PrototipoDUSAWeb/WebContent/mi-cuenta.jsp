<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%@include file="includes/head.jsp" %>

<title>Drogueria Uruguay - Mi Cuenta</title>
</head>
<body>
	<div id="container">
	
		<%@include file="includes/header.jsp" %>
	
		<div id="principal">
			<div id="contenido">
				<div id="contenido-top">
					<div id="ruta">
						<a href="mi-cuenta.jsp">Inicio</a><span> » </span>
						Mi Cuenta
					</div>
				</div>		
				
				<div id="contenido-middle">
					<%@include file="includes/menu-izquierdo.jsp" %>
					<div id="contenido-derecho">
						<div class="box-90 listado">
							<h1 class="titulo">¡ Hola <span class="usuario">Gonzalo</span> !</h1>
							
							<!-- 
							
							<h3>Recuerda que hacer tu pedido es tan facil como:</h3><br><br>
							<div class="box-30 border-black redondeado fleft">								
								<img alt="" src="/DUSAWeb/images/carrito.jpg" WIDTH="40" class="fleft" style="margin: 10px;" >								
								<div class="fleft">
									<h3>Primer Paso</h3><br>
									<p>Seleccione los productos.</p>
								</div>
							</div>
							<div class="box-30 border-black redondeado fleft">	
								<div>							
									<img alt="" src="/DUSAWeb/images/envio.jpg" WIDTH="40" class="fleft" style="margin: 10px;" >
								</div>								
								<div class="fleft">
									<h3>Segundo Paso</h3><br>
									<p>Seleccione el reparto</p>
									<p>y la forma de pago.</p>
								</div>
							</div>
							<div class="box-30 border-black redondeado fleft">								
								<img alt="" src="/DUSAWeb/images/check.jpg" WIDTH="40" class="fleft" style="margin: 10px;" >								
								<div class="fleft">
									<h3>Ultimo Paso</h3><br>
									<p>Reciba su pedido en la farmacia.</p>
								</div>
							</div>
							
							 -->
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