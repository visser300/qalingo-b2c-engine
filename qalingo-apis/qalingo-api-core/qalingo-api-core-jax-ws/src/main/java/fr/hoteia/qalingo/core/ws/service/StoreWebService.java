/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.7.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package fr.hoteia.qalingo.core.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import fr.hoteia.qalingo.core.ws.pojo.StoreWsPojo;

@WebService(name="storeWsClient", targetNamespace="http://www.qalingo.com")
public interface StoreWebService {

	@WebMethod(operationName="getStore")
	StoreWsPojo getStoreById(@WebParam(name="id") String storeId);
	
}
