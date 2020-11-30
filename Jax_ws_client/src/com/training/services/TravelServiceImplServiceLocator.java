/**
 * TravelServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.training.services;

public class TravelServiceImplServiceLocator extends org.apache.axis.client.Service implements com.training.services.TravelServiceImplService {

    public TravelServiceImplServiceLocator() {
    }


    public TravelServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TravelServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TravelServiceImplPort
    private java.lang.String TravelServiceImplPort_address = "http://localhost:4046/travel";

    public java.lang.String getTravelServiceImplPortAddress() {
        return TravelServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TravelServiceImplPortWSDDServiceName = "TravelServiceImplPort";

    public java.lang.String getTravelServiceImplPortWSDDServiceName() {
        return TravelServiceImplPortWSDDServiceName;
    }

    public void setTravelServiceImplPortWSDDServiceName(java.lang.String name) {
        TravelServiceImplPortWSDDServiceName = name;
    }

    public com.training.ifaces.TravelService getTravelServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TravelServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTravelServiceImplPort(endpoint);
    }

    public com.training.ifaces.TravelService getTravelServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.training.services.TravelServiceImplPortBindingStub _stub = new com.training.services.TravelServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getTravelServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTravelServiceImplPortEndpointAddress(java.lang.String address) {
        TravelServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.training.ifaces.TravelService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.training.services.TravelServiceImplPortBindingStub _stub = new com.training.services.TravelServiceImplPortBindingStub(new java.net.URL(TravelServiceImplPort_address), this);
                _stub.setPortName(getTravelServiceImplPortWSDDServiceName());
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
        if ("TravelServiceImplPort".equals(inputPortName)) {
            return getTravelServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.training.com/", "TravelServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.training.com/", "TravelServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TravelServiceImplPort".equals(portName)) {
            setTravelServiceImplPortEndpointAddress(address);
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
