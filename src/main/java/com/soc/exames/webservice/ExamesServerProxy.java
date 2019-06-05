package com.soc.exames.webservice;

public class ExamesServerProxy implements com.soc.exames.webservice.ExamesServer {
  private String _endpoint = null;
  private com.soc.exames.webservice.ExamesServer examesServer = null;
  
  public ExamesServerProxy() {
    _initExamesServerProxy();
  }
  
  public ExamesServerProxy(String endpoint) {
    _endpoint = endpoint;
    _initExamesServerProxy();
  }
  
  private void _initExamesServerProxy() {
    try {
      examesServer = (new com.soc.exames.webservice.ExamesServerImplServiceLocator()).getExamesServerImplPort();
      if (examesServer != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)examesServer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)examesServer)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (examesServer != null)
      ((javax.xml.rpc.Stub)examesServer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.soc.exames.webservice.ExamesServer getExamesServer() {
    if (examesServer == null)
      _initExamesServerProxy();
    return examesServer;
  }
  
  public com.soc.exames.webservice.Exame getExame(long arg0) throws java.rmi.RemoteException{
    if (examesServer == null)
      _initExamesServerProxy();
    return examesServer.getExame(arg0);
  }
  
  public com.soc.exames.webservice.Exame[] getExamesList() throws java.rmi.RemoteException{
    if (examesServer == null)
      _initExamesServerProxy();
    return examesServer.getExamesList();
  }
  
  
}