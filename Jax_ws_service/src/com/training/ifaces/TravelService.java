package com.training.ifaces;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.training.domains.TravelResponse;

@WebService
@SOAPBinding(style=Style.RPC)
public interface TravelService {

	@WebMethod
	public String[] weekEndTrips(@WebParam(name="city") String city);
	
	@WebMethod
	public TravelResponse monthEndTrips(@WebParam(name="city") String city);
	
}
