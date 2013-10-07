package com.dusa.comunicacion;

import javax.xml.ws.Endpoint;

public class StartService {

 /**
 * @param args
 */
    
public static void main(String[] args) {
		
	ControladorComunicacion c = new ControladorComunicacion();
	 System.out.println("SayHello Web Service started.");
	 Endpoint.publish("http://localhost:9015/wsServerExample", c);
	 

 }
}
