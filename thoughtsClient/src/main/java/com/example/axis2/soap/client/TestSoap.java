package com.example.axis2.soap.client;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.example.axis2.soap.client.InboundPocProvStub.FeatureBits;
import com.example.axis2.soap.client.InboundPocProvStub.GetSubscriberInfo;
import com.example.axis2.soap.client.InboundPocProvStub.GetSubscriberInfoResponseE;
import com.example.axis2.soap.client.InboundPocProvStub.KnPackageInfo;
import com.example.axis2.soap.client.InboundPocProvStub.TransactionInfo;
public class TestSoap {
	public static void main(String[] args) {
		try {
			
			InboundPocProvStub.ClientInfo clientInfo=new InboundPocProvStub.ClientInfo();
			clientInfo.setClientType("3");
			clientInfo.setProtocolVersion("1.0");
			InboundPocProvStub.CredentialInfo credentialInfo=new InboundPocProvStub.CredentialInfo();
			credentialInfo.setPassword("kodiak");
			credentialInfo.setUserId("kodiak");
			InboundPocProvStub.MobileInfo mobileInfo=new InboundPocProvStub.MobileInfo();
			mobileInfo.setMdn("91984570822");
			InboundPocProvStub.AuthInfo authInfo=new InboundPocProvStub.AuthInfo();
			authInfo.setClientInfo(clientInfo);
			authInfo.setCredentialInfo(credentialInfo);
			GetSubscriberInfo param=new GetSubscriberInfo();
			param.setAuthInfo(authInfo);
			param.setMobileInfo(mobileInfo);
			TransactionInfo tparam=new TransactionInfo();
			tparam.setApplicationId("1");
			tparam.setTransactionId("1");
			InboundPocProvStub.GetSubscriberInfoE getSubscriberInfo =new InboundPocProvStub.GetSubscriberInfoE();
			getSubscriberInfo.setGetSubscriberInfo(param);
	        InboundPocProvStub.TransactionInfoE transactionInfo4=new InboundPocProvStub.TransactionInfoE();
	        transactionInfo4.setTransactionInfo(tparam);
	        
			InboundPocProvStub InboundPocProvStub=new InboundPocProvStub();
			GetSubscriberInfoResponseE response = InboundPocProvStub.getSubscriberInfo(getSubscriberInfo, transactionInfo4);
			KnPackageInfo pack = response.getGetSubscriberInfoResponse().getResult().getPackageInfo();
			String[] addOn = pack.getAddOnPkgId().getValue();
			FeatureBits[] festure = response.getGetSubscriberInfoResponse().getResult().getClientFSInfo().getFeatureSetInfo();
			System.out.println("pack :"+addOn[0]);
			System.out.println("aclientfs :"+festure[0].getFeatureId());
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
