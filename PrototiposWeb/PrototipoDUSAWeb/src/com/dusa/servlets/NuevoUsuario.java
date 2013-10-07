package com.dusa.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dusa.comunicacion.MensajeError;

public class NuevoUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NuevoUsuario() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");

	    PrintWriter out = response.getWriter();
		String title = "Nuevo Usuario";
	    String docType =
		    "<!doctype html public \"-//w3c//dtd html 4.0 " +
		    "transitional//en\">\n";
	      	      
	    String html = docType +
	            "<html>\n" +
	        "<head><title>" + title + "</title></head>\n" +
	        "<body bgcolor=\"#f0f0f0\">\n" +
	        "<h1 align=\"center\">" + title + "</h1>\n" +
	        "<div style='align: center;'>" + "Metodo do get" + "</div>\n" +
            "</body></html>";
	      
	      out.println(html);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("usuario");
		String pass = request.getParameter("pass");
		String passConfirmacion = request.getParameter("pass-confirmacion");
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("e-mail");
		String telefono = request.getParameter("telefono");
		String rol = request.getParameter("rol");
		
		//IControladorUsuario icu = new Fabrica().getIUsuario();
		String mensaje = "Mensaje: ";
		MensajeError mensajee = new MensajeError();
		
		SOAPClient comunicacion = new SOAPClient();
		try {
			
			mensajee = comunicacion.altaUsuario(usuario);
			
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Cambios hechos por Gaston R a partir de los nuevos retornos
		//MensajeError msj = icu.altaUsuario(usuario);
		
		/*if (msj.getCodigo() == 1) {
			
			msj = icu.altaUsuarioAdminDUSA(usuario, pass, nombre, email);
			if (msj.getCodigo() == 1) {
				mensaje = msj.getMensaje();
			} else {
				mensaje = msj.getMensaje();
			}
		} else {
			mensaje = msj.getMensaje();
		}*/
		
		request.getSession().setAttribute("mensaje", mensajee.getMensaje());
		response.sendRedirect("nuevo-usuario-de-farmacia.jsp");
		
		
		response.setContentType("text/html");

	    PrintWriter out = response.getWriter();
		String title = "Buscar Producto";
	    String docType =
		    "<!doctype html public \"-//w3c//dtd html 4.0 " +
		    "transitional//en\">\n";
	      	      
	    String html = docType +
	            "<html>\n" +
	        "<head><title>" + title + "</title></head>\n" +
	        "<body bgcolor=\"#f0f0f0\">\n" +
	        "<h1 align=\"center\">" + title + "</h1>\n" +
	        "<div style='align: center;'>" + "Metodo do Post" + "</div>\n" +
	        "<br> " + usuario + " " + pass + " "  + passConfirmacion + " "  
	        		+ nombre + " "  + email + " "  + telefono + " <br>" +
	        		  rol + " <br>" + mensaje +
            "</body></html>";
	      
	      out.println(html);
	}

}
