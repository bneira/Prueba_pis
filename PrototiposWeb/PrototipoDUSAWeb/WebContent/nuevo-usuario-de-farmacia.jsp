<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	
<%@ page import="java.util.List" %>		
<%@ page import="controladores.Fabrica,
				 controladores.IControladorUsuario,
				 dominio.Farmacia" %>
				 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%@include file="includes/head.jsp" %>

<title>Drogueria Uruguay - Nuevo Usuario</title>
</head>
<body>

<script  type="text/javascript">
$(document).ready(function(){  
	
	//Codigo encargado de mostrar/ocultar los campos al seleccionar rol en SELECT
	$('#fau-jq-telefono').hide();
	$('#fau-jq-farmacia-asociada').hide();
	$('#fau-jq-max-usuarios').hide();
	$('#fau-rol').change(function(){
		if($(this).val()== 0) {
		    $('#fau-jq-telefono').hide();
		    $('#fau-jq-farmacia-asociada').hide();
		    $('#fau-jq-max-usuarios').hide();
		} else if($(this).val()== 1) {
			$('#fau-jq-telefono').hide();
		    $('#fau-jq-farmacia-asociada').hide();
		    $('#fau-jq-max-usuarios').hide();
		} else if($(this).val()== 2) {
			$('#fau-jq-telefono').show();
		    $('#fau-jq-farmacia-asociada').show();
		    $('#fau-jq-max-usuarios').show();
		} else if($(this).val()== 3) {
			$('#fau-jq-telefono').show();
		    $('#fau-jq-farmacia-asociada').show();
		    $('#fau-jq-max-usuarios').hide();
		}
	});
	//FIN Codigo encargado de mostrar/ocultar los campos al seleccionar rol en SELECT
	
	
	// Control de formulario
    $("#form-alta-usuario").submit(function () {  
    	
    	alert("Trabajando en esta funcionalidad");  
    	return false;
    	
    	//Expresión para validar un correo electrónico
        var expr = /^[a-zA-Z0-9_\.\-]+@[a-zA-Z0-9\-]+\.[a-zA-Z0-9\-\.]+$/;
    	
    	// Variables quitando los espacios en blanco
        var usuario = ($("#fau-usuario").val()).replace(/\s/g, '');
        var nombre = ($("#fau-nombre").val()).replace(/\s/g, '');
        var telefono = ($("#fau-telefono").val()).replace(/\s/g, '');
        var email = ($("#fau-email").val()).replace(/\s/g, '');
        
        var pass = $("#fau-pass").val();
        var passConfirmacion = $("#fau-pass-confirmacion").val();
    	
		if ($("#fau-rol option:selected").val() == "0") {
			alert("Seleccione el rol del usuario a crear");  
    		return false;
        } else if ($("#fau-rol option:selected").val() != "1") {
        	alert("El rol elegido esta momentaneamente deshabilitado");  
    		return false;
        }        
        
    	/* se controla que se ingresen los datos obligatorios */
    	if ( usuario.length == 0 ) {
    		alert("Ingrese el nombre de usuario");  
    		return false;
    	}
    	if ( (pass.length == 0 ) && ( passConfirmacion.length == 0) )  {
    		alert("Ingrese su contraseña");  
    		return false;
    	} else if ( pass.length != passConfirmacion.length )  {
    		alert("Sus contraseñas no coinciden");  
    		return false;
    	}    	
    	if ( nombre.length == 0 ) {
    		alert("Ingrese su nombre");  
    		return false;
    	}
    	if ( email.length == 0 ) {
    		alert("Ingrese su email");  
    		return false;
    	} else 	if ( !expr.test(email) ) {
    		alert("Ingrese un email valido");  
    		return false;
    	}
    	
    	/*if ( telefono.length == 0 ) {
    		alert("Ingrese su telefono");  
    		return false;
    	}*/
        return true;  
    }); 
	// FIN de control de Formulario
	
	
	//Toma el Valor de celda clickeada de tabla con Farmacias para colocarlo en imput Farmacia
    $(".nombre-farmacia").click(function() {     	
     		$("#fau-farmacia").val($(this).text());     	
     }); 
	//FIN de Toma el Valor de celda clickeada de tabla con Farmacias para colocarlo en imput Farmacia
	
	
	
	// Despliega mensaje de exito/error al tras intentar crear usuario
    <%	try { 
    		String msg = (String)session.getAttribute("mensaje"); 
    		if (msg != null) {	%>
    	 		alert("<%= msg %>");
    	 	<%	session.setAttribute("mensaje", null);
    	 	}    			
    	} catch ( Exception e ) { 
    		e.printStackTrace();%>
    		alert("catch");
    <% } %>
 		
 	
 	  
 
	
});	
</script> 

	<div id="container">
	
		<%@include file="includes/header.jsp" %>
	
		<div id="principal">
			<div id="contenido">
				<div id="contenido-top">
					<div id="ruta">
						<a href="mi-cuenta.jsp">Inicio</a><span> » </span>
						<a href="mi-cuenta.jsp">Mi Cuenta</a><span> » </span>
						Nuevo Usuario
					</div>
				</div>
				
				<div id="contenido-middle">
					<%@include file="includes/menu-izquierdo.jsp" %>
					<div id="contenido-derecho">
					
						<form id="form-alta-usuario" name="formNuevoUsuario" method="POST" action="${pageContext.request.contextPath}/NuevoUsuario" class="formulario">
							<div id="" class="box-90">			
								<h1 class="titulo">Nuevo Usuario</h1>
									<div class="linea-form input-text">
										<label>Seleccionar Rol: </label>
										<select id="fau-rol" name="rol">
											<option value="0">-- Seleccionar Rol --</option>
											<option value="1">Administrador</option>
											<option value="2">Administrador de Farmacia</option>
											<option value="3">Usuario de Farmacia</option>
										</select>
									</div>
									
									<!-- Campos en comun para todos los roles --> 						
									<div class="linea-form input-text">
										<label>Nombre de Usuario: </label>
										<input type="text" id="fau-usuario" name="usuario" />
									</div>
									<div class="linea-form input-text">
										<label>Contraseña: </label>
										<input type="password" id="fau-pass" name="pass"/>
									</div>
									<div class="linea-form input-text">
										<label>Confirmar Contraseña: </label>
										<input type="password" id="fau-pass-confirmacion" name="pass-confirmacion" />
									</div>
									<div class="linea-form input-text">
										<label>Nombre: </label>
										<input type="text" id="fau-nombre" name="nombre"/>
									</div>
									<div class="linea-form input-text">
										<label>E-mail: </label>
										<input type="text" id="fau-email" name="e-mail" />
									</div>
									
									
									<!-- Campos comunes a crear administrador de Farmacia y usuario de Farmacia  -->
									<div id="fau-jq-telefono" class="linea-form input-text">
											<label>Telefono: </label>
											<input type="text" id="fau-telefono" name="telefono" />
									</div>	
									
									<div id="fau-jq-farmacia-asociada" >
										<div class="linea-form input-text">
											<label>Farmacia Asociada: </label>
											<input type="text" id="fau-farmacia" name="farmacia" />
										</div>
										<div >
											<label style="padding-left: 90px; width: 110px;">Filtrar Farmacias: </label>
											<input type="text" id="" name="" /> <input type="button" value="buscar">
											<div style="border: 2px solid #D5D5D5;height: 100px; overflow:auto; margin: 20px 30px 20px 200px;width: 200px;">
												
												
												<% 
												// IControladorUsuario icu = new Fabrica().getIUsuario();
												// List<Farmacia> farmacias = icu.iniciarAltaUsuarioFarmacia();
												%>
												
												
												
												<table class="lista-simple">
												<% //for(Farmacia f : farmacias) { %>
										        										       	
										       	<% //} %>
												
																						
													<tr><td class="nombre-farmacia">Farmacia 1</td></tr>
													<tr><td class="impar nombre-farmacia">Farmacia 2</td></tr>
													<tr><td class="nombre-farmacia">Farmacia 3</td></tr>
													<tr><td class="impar nombre-farmacia">Farmacia 4</td></tr>
													<tr><td class="nombre-farmacia">Farmacia 5</td></tr>
													<tr><td class="impar nombre-farmacia">Farmacia 6</td></tr>
													<tr><td class="nombre-farmacia">Farmacia 7</td></tr>
													<tr><td class="impar nombre-farmacia">Farmacia 8</td></tr>
													<tr><td class="nombre-farmacia">Farmacia 9</td></tr>
													<tr><td class="impar nombre-farmacia">Farmacia 10</td></tr>
												</table>
											</div>
										</div>
									</div>
									
									<!-- Campo unico para crear Administrador de Farmacia -->
									<div id="fau-jq-max-usuarios" class="linea-form">
										<label>Cuantos usuarios puede crear?: </label>
										<input type="text" size="3" id="fau-telefono" name="telefono" />
									</div>														
							</div>	
							
							<div class="fright" style="width:100%;">
								<input class="fright" style="margin: 30px 10px 0px 0px;" type="submit" value="Crear Usuario" />
								
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