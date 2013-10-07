/**
 * ControladorComunicacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dusa.comunicacion;

public interface ControladorComunicacion extends java.rmi.Remote {
    public com.dusa.comunicacion.MensajeError altaUsuario(java.lang.String user) throws java.rmi.RemoteException;
    public com.dusa.comunicacion.Usuario iniciarSesion(java.lang.String user, java.lang.String pass) throws java.rmi.RemoteException;
}
