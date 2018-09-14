package com.example.jaxws.soap.client.wsimport;

import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Holder;

public class TestJaxWsImport {

	
	public static void main(String[] args) {
		InboundPocProv inboundPocProv=new InboundPocProv();
		KnSubsProvInbound port = inboundPocProv.getPort();
		
		ClientInfo clientInfo=new ClientInfo();
		clientInfo.setClientType("3");
		clientInfo.setProtocolVersion("1.0");
		CredentialInfo credentialInfo=new CredentialInfo();
		credentialInfo.setPassword("kodiak");
		credentialInfo.setUserId("kodiak");
		MobileInfo mobileInfo=new MobileInfo();
		mobileInfo.setMdn("91984570822");
		AuthInfo authInfo=new AuthInfo();
		authInfo.setClientInfo(clientInfo);
		authInfo.setCredentialInfo(credentialInfo);
		
		TransactionInfo transactionInfo =new TransactionInfo();
		transactionInfo.setApplicationId("1");
		transactionInfo.setTransactionId("1");
		Holder<TransactionInfo> hTransactionInfo=new Holder<TransactionInfo>(transactionInfo);
		
		
		GetSubscriberInfo GetSubscriberInfo=new GetSubscriberInfo();
		GetSubscriberInfo.setAuthInfo(authInfo);
		GetSubscriberInfo.setMobileInfo(mobileInfo);
		
		GetSubscriberInfoResponse response = port.getSubscriberInfo(GetSubscriberInfo, hTransactionInfo);
		List<String> addOn = response.getResult().getPackageInfo().getAddOnPkgId().getValue();
		System.out.println("addon "+addOn.get(0));
		
	}
}
