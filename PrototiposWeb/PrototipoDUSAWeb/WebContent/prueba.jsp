<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%@include file="includes/head.jsp" %>

<title>Insert title here</title>
</head>
<body>
	

	
	
	

		
		<div id="principal">
			<div id="contenido">
				
				<div id="top-perfil">
					<a class="tab-link-on" href="perfil.jsp" style="margin: 0px 0px 0px 0px; float:left;">Datos</a>
					<img style="margin: 0px 0px 0px 0px; float:left;" alt="" src="/DUSA/images/pestania-der-blanco.png">
					<a class="tab-link-off" href="mis-pedidos.jsp" style="margin: 0px 0px 0px 0px; float:left;">Historial Pedidos</a>
					<img style="margin: 0px 0px 0px 0px; float:left;" alt="" src="/DUSA/images/pestania-der-gris.png">
				</div>
				<div id="perfil">	
					<div id="datos">
					<h2>Datos Usuario</h2>
							<table>
								<tr>
									<td width="100px">Nombre:</td>
									<td>Francisco Reyes</td>
								</tr>
								<tr>
									<td>Telefono:</td>
									<td>094 499657</td>
								</tr>
								<tr>
									<td>E-mail</td>
									<td>freyes@mail.com</td>
								</tr>							
							</table>
					</div>
								
					<div id="datos" style="margin-top: 30px;">
					<h2>Datos Farmacia</h2>
							<table>
								<tr>
									<td width="100px">Nombre:</td>
									<td>FCIA GARIBALDI</td>
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
									<td>fgaribaldi@adinet.com.uy</td>
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
			
	<div id="clearfooter"></div>
	</div>
	
	<%@include file="includes/footer.jsp" %>
	
</body>
</html>