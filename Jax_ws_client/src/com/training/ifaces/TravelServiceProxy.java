package com.training.ifaces;

public class TravelServiceProxy implements com.training.ifaces.TravelService {
  private String _endpoint = null;
  private com.training.ifaces.TravelService travelService = null;
  
  public TravelServiceProxy() {
    _initTravelServiceProxy();
  }
  
  public TravelServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initTravelServiceProxy();
  }
  
  private void _initTravelServiceProxy() {
    try {
      travelService = (new com.training.services.TravelServiceImplServiceLocator()).getTravelServiceImplPort();
      if (travelService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)travelService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)travelService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (travelService != null)
      ((javax.xml.rpc.Stub)travelService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.training.ifaces.TravelService getTravelService() {
    if (travelService == null)
      _initTravelServiceProxy();
    return travelService;
  }
  
  public java.lang.String[] weekEndTrips(java.lang.String city) throws java.rmi.RemoteException{
    if (travelService == null)
      _initTravelServiceProxy();
    return travelService.weekEndTrips(city);
  }
  
  public java.lang.String[] monthEndTrips(java.lang.String city) throws java.rmi.RemoteException{
    if (travelService == null)
      _initTravelServiceProxy();
    return travelService.monthEndTrips(city);
  }
  
  
}