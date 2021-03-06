
package com.example.jaxws.soap.client.wsimport;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "KnSubsProvInbound", targetNamespace = "/pocprov_V1.0")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface KnSubsProvInbound {


    /**
     * 
     * @param parameters
     * @param transactionInfo
     * @return
     *     returns com.example.jaxws.soap.client.wsimport.DeleteExternalSubscriberResponse
     */
    @WebMethod(action = "deleteExternalSubscriber")
    @WebResult(name = "deleteExternalSubscriberResponse", targetNamespace = "/pocprov_V1.0", partName = "result")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public DeleteExternalSubscriberResponse deleteExternalSubscriber(
        @WebParam(name = "deleteExternalSubscriber", targetNamespace = "/pocprov_V1.0", partName = "parameters")
        DeleteExternalSubscriber parameters,
        @WebParam(name = "transactionInfo", targetNamespace = "/pocprov_V1.0", header = true, mode = WebParam.Mode.INOUT, partName = "transactionInfo")
        Holder<TransactionInfo> transactionInfo);

    /**
     * 
     * @param parameters
     * @param transactionInfo
     * @return
     *     returns com.example.jaxws.soap.client.wsimport.IsAliveResponse
     */
    @WebMethod(action = "isAlive")
    @WebResult(name = "isAliveResponse", targetNamespace = "/pocprov_V1.0", partName = "result")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public IsAliveResponse isAlive(
        @WebParam(name = "isAlive", targetNamespace = "/pocprov_V1.0", partName = "parameters")
        IsAlive parameters,
        @WebParam(name = "transactionInfo", targetNamespace = "/pocprov_V1.0", header = true, mode = WebParam.Mode.INOUT, partName = "transactionInfo")
        Holder<TransactionInfo> transactionInfo);

    /**
     * 
     * @param parameters
     * @param transactionInfo
     * @return
     *     returns com.example.jaxws.soap.client.wsimport.GetSubscriberDetailsResponse
     */
    @WebMethod(action = "getSubscriberDetails")
    @WebResult(name = "getSubscriberDetailsResponse", targetNamespace = "/pocprov_V1.0", partName = "result")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public GetSubscriberDetailsResponse getSubscriberDetails(
        @WebParam(name = "getSubscriberDetails", targetNamespace = "/pocprov_V1.0", partName = "parameters")
        GetSubscriberDetails parameters,
        @WebParam(name = "transactionInfo", targetNamespace = "/pocprov_V1.0", header = true, mode = WebParam.Mode.INOUT, partName = "transactionInfo")
        Holder<TransactionInfo> transactionInfo);

    /**
     * 
     * @param parameters
     * @param transactionInfo
     * @return
     *     returns com.example.jaxws.soap.client.wsimport.GetSysConfigResponse
     */
    @WebMethod(action = "getSysConfig")
    @WebResult(name = "getSysConfigResponse", targetNamespace = "/pocprov_V1.0", partName = "result")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public GetSysConfigResponse getSysConfig(
        @WebParam(name = "getSysConfig", targetNamespace = "/pocprov_V1.0", partName = "parameters")
        GetSysConfig parameters,
        @WebParam(name = "transactionInfo", targetNamespace = "/pocprov_V1.0", header = true, mode = WebParam.Mode.INOUT, partName = "transactionInfo")
        Holder<TransactionInfo> transactionInfo);

    /**
     * 
     * @param parameters
     * @param transactionInfo
     * @return
     *     returns com.example.jaxws.soap.client.wsimport.ForceSyncResponse
     */
    @WebMethod(action = "forceSync")
    @WebResult(name = "forceSyncResponse", targetNamespace = "/pocprov_V1.0", partName = "result")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public ForceSyncResponse forceSync(
        @WebParam(name = "forceSync", targetNamespace = "/pocprov_V1.0", partName = "parameters")
        ForceSync parameters,
        @WebParam(name = "transactionInfo", targetNamespace = "/pocprov_V1.0", header = true, mode = WebParam.Mode.INOUT, partName = "transactionInfo")
        Holder<TransactionInfo> transactionInfo);

    /**
     * 
     * @param parameters
     * @param transactionInfo
     * @return
     *     returns com.example.jaxws.soap.client.wsimport.GetSubscriberInfoResponse
     */
    @WebMethod(action = "getSubscriberInfo")
    @WebResult(name = "getSubscriberInfoResponse", targetNamespace = "/pocprov_V1.0", partName = "result")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public GetSubscriberInfoResponse getSubscriberInfo(
        @WebParam(name = "getSubscriberInfo", targetNamespace = "/pocprov_V1.0", partName = "parameters")
        GetSubscriberInfo parameters,
        @WebParam(name = "transactionInfo", targetNamespace = "/pocprov_V1.0", header = true, mode = WebParam.Mode.INOUT, partName = "transactionInfo")
        Holder<TransactionInfo> transactionInfo);

    /**
     * 
     * @param parameters
     * @param transactionInfo
     * @return
     *     returns com.example.jaxws.soap.client.wsimport.UpdateAutoPairingResponse
     */
    @WebMethod(action = "updateAutoPairing")
    @WebResult(name = "updateAutoPairingResponse", targetNamespace = "/pocprov_V1.0", partName = "result")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public UpdateAutoPairingResponse updateAutoPairing(
        @WebParam(name = "updateAutoPairing", targetNamespace = "/pocprov_V1.0", partName = "parameters")
        UpdateAutoPairing parameters,
        @WebParam(name = "transactionInfo", targetNamespace = "/pocprov_V1.0", header = true, mode = WebParam.Mode.INOUT, partName = "transactionInfo")
        Holder<TransactionInfo> transactionInfo);

    /**
     * 
     * @param parameters
     * @param transactionInfo
     * @return
     *     returns com.example.jaxws.soap.client.wsimport.DeleteSubscriberResponse
     */
    @WebMethod(action = "deleteSubscriber")
    @WebResult(name = "deleteSubscriberResponse", targetNamespace = "/pocprov_V1.0", partName = "result")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public DeleteSubscriberResponse deleteSubscriber(
        @WebParam(name = "deleteSubscriber", targetNamespace = "/pocprov_V1.0", partName = "parameters")
        DeleteSubscriber parameters,
        @WebParam(name = "transactionInfo", targetNamespace = "/pocprov_V1.0", header = true, mode = WebParam.Mode.INOUT, partName = "transactionInfo")
        Holder<TransactionInfo> transactionInfo);

    /**
     * 
     * @param parameters
     * @param transactionInfo
     * @return
     *     returns com.example.jaxws.soap.client.wsimport.UpdateSubscriberResponse
     */
    @WebMethod(action = "updateSubscriber")
    @WebResult(name = "updateSubscriberResponse", targetNamespace = "/pocprov_V1.0", partName = "result")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public UpdateSubscriberResponse updateSubscriber(
        @WebParam(name = "updateSubscriber", targetNamespace = "/pocprov_V1.0", partName = "parameters")
        UpdateSubscriber parameters,
        @WebParam(name = "transactionInfo", targetNamespace = "/pocprov_V1.0", header = true, mode = WebParam.Mode.INOUT, partName = "transactionInfo")
        Holder<TransactionInfo> transactionInfo);

    /**
     * 
     * @param parameters
     * @param transactionInfo
     * @return
     *     returns com.example.jaxws.soap.client.wsimport.ChangeServiceAuthStatusResponse
     */
    @WebMethod(action = "changeServiceAuthStatus")
    @WebResult(name = "changeServiceAuthStatusResponse", targetNamespace = "/pocprov_V1.0", partName = "result")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public ChangeServiceAuthStatusResponse changeServiceAuthStatus(
        @WebParam(name = "changeServiceAuthStatus", targetNamespace = "/pocprov_V1.0", partName = "parameters")
        ChangeServiceAuthStatus parameters,
        @WebParam(name = "transactionInfo", targetNamespace = "/pocprov_V1.0", header = true, mode = WebParam.Mode.INOUT, partName = "transactionInfo")
        Holder<TransactionInfo> transactionInfo);

    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "initialize", targetNamespace = "/pocprov_V1.0", className = "com.example.jaxws.soap.client.wsimport.Initialize")
    @ResponseWrapper(localName = "initializeResponse", targetNamespace = "/pocprov_V1.0", className = "com.example.jaxws.soap.client.wsimport.InitializeResponse")
    public void initialize();

    /**
     * 
     * @param parameters
     * @param transactionInfo
     * @return
     *     returns com.example.jaxws.soap.client.wsimport.ChangeMdnResponse
     */
    @WebMethod(action = "changeMdn")
    @WebResult(name = "changeMdnResponse", targetNamespace = "/pocprov_V1.0", partName = "result")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public ChangeMdnResponse changeMdn(
        @WebParam(name = "changeMdn", targetNamespace = "/pocprov_V1.0", partName = "parameters")
        ChangeMdn parameters,
        @WebParam(name = "transactionInfo", targetNamespace = "/pocprov_V1.0", header = true, mode = WebParam.Mode.INOUT, partName = "transactionInfo")
        Holder<TransactionInfo> transactionInfo);

    /**
     * 
     * @param parameters
     * @param transactionInfo
     * @return
     *     returns com.example.jaxws.soap.client.wsimport.CreateSubscriberResponse
     */
    @WebMethod(action = "createSubscriber")
    @WebResult(name = "createSubscriberResponse", targetNamespace = "/pocprov_V1.0", partName = "result")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public CreateSubscriberResponse createSubscriber(
        @WebParam(name = "createSubscriber", targetNamespace = "/pocprov_V1.0", partName = "parameters")
        CreateSubscriber parameters,
        @WebParam(name = "transactionInfo", targetNamespace = "/pocprov_V1.0", header = true, mode = WebParam.Mode.INOUT, partName = "transactionInfo")
        Holder<TransactionInfo> transactionInfo);

}
