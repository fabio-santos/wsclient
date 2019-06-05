/**
 * ExamesServerImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soc.exames.webservice;

public class ExamesServerImplServiceLocator extends org.apache.axis.client.Service implements com.soc.exames.webservice.ExamesServerImplService {

    public ExamesServerImplServiceLocator() {
    }


    public ExamesServerImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ExamesServerImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ExamesServerImplPort
    private java.lang.String ExamesServerImplPort_address = "http://localhost:9876/exames";

    public java.lang.String getExamesServerImplPortAddress() {
        return ExamesServerImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ExamesServerImplPortWSDDServiceName = "ExamesServerImplPort";

    public java.lang.String getExamesServerImplPortWSDDServiceName() {
        return ExamesServerImplPortWSDDServiceName;
    }

    public void setExamesServerImplPortWSDDServiceName(java.lang.String name) {
        ExamesServerImplPortWSDDServiceName = name;
    }

    public com.soc.exames.webservice.ExamesServer getExamesServerImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ExamesServerImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getExamesServerImplPort(endpoint);
    }

    public com.soc.exames.webservice.ExamesServer getExamesServerImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.soc.exames.webservice.ExamesServerImplPortBindingStub _stub = new com.soc.exames.webservice.ExamesServerImplPortBindingStub(portAddress, this);
            _stub.setPortName(getExamesServerImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setExamesServerImplPortEndpointAddress(java.lang.String address) {
        ExamesServerImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.soc.exames.webservice.ExamesServer.class.isAssignableFrom(serviceEndpointInterface)) {
                com.soc.exames.webservice.ExamesServerImplPortBindingStub _stub = new com.soc.exames.webservice.ExamesServerImplPortBindingStub(new java.net.URL(ExamesServerImplPort_address), this);
                _stub.setPortName(getExamesServerImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ExamesServerImplPort".equals(inputPortName)) {
            return getExamesServerImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.exames.soc.com/", "ExamesServerImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.exames.soc.com/", "ExamesServerImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ExamesServerImplPort".equals(portName)) {
            setExamesServerImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
