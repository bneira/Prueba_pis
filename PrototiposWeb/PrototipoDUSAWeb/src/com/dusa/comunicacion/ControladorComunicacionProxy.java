package com.dusa.comunicacion;

public class ControladorComunicacionProxy implements com.dusa.comunicacion.ControladorComunicacion {
  private String _endpoint = null;
  private com.dusa.comunicacion.ControladorComunicacion controladorComunicacion = null;
  
  public ControladorComunicacionProxy() {
    _initControladorComunicacionProxy();
  }
  
  public ControladorComunicacionProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorComunicacionProxy();
  }
  
  private void _initControladorComunicacionProxy() {
    try {
      controladorComunicacion = (new com.dusa.comunicacion.ControladorComunicacionServiceLocator()).getControladorComunicacionPort();
      if (controladorComunicacion != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorComunicacion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorComunicacion)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorComunicacion != null)
      ((javax.xml.rpc.Stub)controladorComunicacion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.dusa.comunicacion.ControladorComunicacion getControladorComunicacion() {
    if (controladorComunicacion == null)
      _initControladorComunicacionProxy();
    return controladorComunicacion;
  }
  
  public com.dusa.comunicacion.MensajeError altaUsuario(java.lang.String user) throws java.rmi.RemoteException{
    if (controladorComunicacion == null)
      _initControladorComunicacionProxy();
    return controladorComunicacion.altaUsuario(user);
  }
  
  public com.dusa.comunicacion.Usuario iniciarSesion(java.lang.String user, java.lang.String pass) throws java.rmi.RemoteException{
    if (controladorComunicacion == null)
      _initControladorComunicacionProxy();
    return controladorComunicacion.iniciarSesion(user, pass);
  }
  
  
}