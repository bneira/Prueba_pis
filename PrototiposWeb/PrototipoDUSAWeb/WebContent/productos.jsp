<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%@include file="includes/head.jsp" %>

<title>Drogueria Uruguay - Productos</title>
</head>
<body>

<script type="text/javascript">
/* Script para efecto acordeon en lista de productos*/
  $(document).ready(function() {
    $(".accordion .accord-header").click(function() {  
    	$(".accord-header").removeClass("producto-seleccionado");
    	$(this).addClass("producto-seleccionado");
      	if($(this).next("div").is(":visible")){
        	$(this).next("div").slideUp("slow");
      	} else {
        	$(".accordion .accord-content").slideUp("slow");
        	$(this).next("div").slideToggle("slow");
      }
    });
  });
</script>

	<div id="container">
	
		<%@include file="includes/header.jsp" %>
	
		<div id="principal">
			<div id="contenido">
				<div id="contenido-top">
					<div id="ruta">
						<a href="mi-cuenta.jsp">Inicio</a><span> » </span>
						<a href="#">Nuevo Pedido</a><span> » </span>
						Seleccionar Productos
					</div>
					<div id="buscador">
						Buscar Productos: <input type="text" />
					</div>
				</div>		
				
				<div id="contenido-middle">		
					<div id="categorias">
						<h2 class="menu-titulo-principal">Laboratorios</h2>
							<form action="">
								<ul>
									<li><input type="checkbox" name="laboratorio" value="Bayer">Bayer </li>
									<li><input type="checkbox" name="laboratorio" value="Kern">Kern  </li>
									<li><input type="checkbox" name="laboratorio" value="Andromaco">Andromaco</li>
									<li><input type="checkbox" name="laboratorio" value="Gador">Gador</li>
									<li><input type="checkbox" name="laboratorio" value="Efa">Efa</li>
									<li><input type="checkbox" name="laboratorio" value="Roche">Roche</li>
									<li><input type="checkbox" name="laboratorio" value="Pharmanova">Pharmanova</li>
									<li><input type="checkbox" name="laboratorio" value="Otro">Netva</li>
								</ul>
								<div>
									<input type="submit" value="Filtrar">
								</div>
							</form>
					</div>
					
					<div id="contenido-derecho">
						<div class="box-90 listado">
							<h1 class="titulo">Seleccionar Productos</h1>
							<p>*Los precios no incluyen impuestos ni tributos</p>
							<div id="lista-productos" class="accordion">
							
								<%  String productos [] = { "VOLTAREN  75  5 AMP","BEROTEC SOL 20 ML","AMP. ROJO 2","BRONCEADOR FACTOR 4(PLUS)",
															"FARMACOLETAS GOTAS *****","AMP  FRIO CAOBA 36","BURGUREN EXAM.LTX G X 20",
														   	"REVITSENG 60 CAP.(GINSENG","CALCIO VITAMINA FU 30 TB","IBUPIRAC SUSP. 90CC"};
																	
									for (int i = 0; i < 10; i++ ) { %>
								
									<div class="producto accord-header">
										<p class="fleft"><%= productos[i] %></p>
										<p class="fright">En Stock</p>
									</div>
									<div class="descripcion accord-content">
										<div class="fright">
											Precio: <span class="precio"> $ 79<br><br></span>
											<input type="button" value="Agregar"/>
										</div>  
										<div class="fleft box">
											<p>Oferta: <br> 4+1</p><br>
										</div>
										<div class="fleft box">
											Con Receta: &nbsp; <input type="text" size=3 value="0" />
											<img style="cursor: pointer;" alt="" src="${pageContext.request.contextPath}/images/subir.png" />
											<img style="cursor: pointer;" alt="" src="${pageContext.request.contextPath}/images/bajar.png" />
											<br><br>
											Sin Receta: &nbsp; &nbsp; <input type="text" size=3 value="0" />
											<img style="cursor: pointer;" alt="" src="${pageContext.request.contextPath}/images/subir.png" />
											<img style="cursor: pointer;" alt="" src="${pageContext.request.contextPath}/images/bajar.png" />
										</div> 
									</div>
	
								<%	}; 	%>			
								
							</div>
							
							<div id="paginacion">
							<span>Pagina 29 de 48 | Ir a pagina <input type="text" size="3" /> <input type="button" value="ir" /></span>
							
							<ul>
								<li><a href="#">Anterior</a></li>
								<li><a href="#">27</a></li>
								<li><a href="#">28</a></li>
								<li>29</li>
								<li><a href="#">30</a></li>
								<li><a href="#">31</a></li>
								<li><a href="#">Siguiente</a></li>
							</ul>
							
							</div>
						
						</div>
					</div>								
				</div>
				<div class="fright margin5">					
					<form class="fright" action="seleccionar-reparto.jsp">
						<input type="submit" value="Completar Pedido" />			
					</form>		
					<form class="fright" action="pedido-actual.jsp">
						<input type="submit" value="Ver Pedido Actual" />			
					</form>	
				</div>
			</div>
		</div>
		
		<div id="clearfooter"></div>
	</div>
	
	<%@include file="includes/footer.jsp" %>
</body>
</html>