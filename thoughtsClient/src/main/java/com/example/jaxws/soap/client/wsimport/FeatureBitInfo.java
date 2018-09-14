
package com.example.jaxws.soap.client.wsimport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for featureBitInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="featureBitInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instaPOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="missedCallAlert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callEndedAlert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationSubscription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supervisoryOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tuSms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xcapDocDiff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pocOverWifi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="httpsSupport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pagingMessageSupport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reloginMessageSupport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="talkGrpSelectServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="presenceUpdateReduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jitterStats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="historyBasedPresence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decouplePresenceAndCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodicClientLogsAndReport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onDemandClientLogs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onDemandLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="talkGrpSelectClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="talkGroupScanningClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batteryUsageOptimization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="broadcastGrpService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xcapCouchbaseClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pushToText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pushToMultimedia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pushToLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urgentMsgOrig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grpMemLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geoFenceFeature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voiceMsgFallback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pttRadioClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remotePushNotify" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gCMPushNotify" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientUIStats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionParticipants" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mediaReconnect3G" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pttRecordingOnClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="multiSimultaneousSession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="breadcrumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instaDRX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "featureBitInfo", propOrder = {
    "instaPOC",
    "missedCallAlert",
    "callEndedAlert",
    "locationSubscription",
    "supervisoryOverride",
    "tuSms",
    "xcapDocDiff",
    "pocOverWifi",
    "httpsSupport",
    "pagingMessageSupport",
    "reloginMessageSupport",
    "talkGrpSelectServer",
    "presenceUpdateReduction",
    "jitterStats",
    "historyBasedPresence",
    "decouplePresenceAndCall",
    "periodicClientLogsAndReport",
    "onDemandClientLogs",
    "onDemandLocation",
    "talkGrpSelectClient",
    "talkGroupScanningClient",
    "batteryUsageOptimization",
    "broadcastGrpService",
    "xcapCouchbaseClient",
    "pushToText",
    "pushToMultimedia",
    "pushToLocation",
    "urgentMsgOrig",
    "grpMemLoc",
    "geoFenceFeature",
    "voiceMsgFallback",
    "pttRadioClient",
    "remotePushNotify",
    "gcmPushNotify",
    "clientUIStats",
    "sessionParticipants",
    "mediaReconnect3G",
    "pttRecordingOnClient",
    "multiSimultaneousSession",
    "breadcrumb",
    "instaDRX"
})
public class FeatureBitInfo {

    protected String instaPOC;
    protected String missedCallAlert;
    protected String callEndedAlert;
    protected String locationSubscription;
    protected String supervisoryOverride;
    protected String tuSms;
    protected String xcapDocDiff;
    protected String pocOverWifi;
    protected String httpsSupport;
    protected String pagingMessageSupport;
    protected String reloginMessageSupport;
    protected String talkGrpSelectServer;
    protected String presenceUpdateReduction;
    protected String jitterStats;
    protected String historyBasedPresence;
    protected String decouplePresenceAndCall;
    protected String periodicClientLogsAndReport;
    protected String onDemandClientLogs;
    protected String onDemandLocation;
    protected String talkGrpSelectClient;
    protected String talkGroupScanningClient;
    protected String batteryUsageOptimization;
    protected String broadcastGrpService;
    protected String xcapCouchbaseClient;
    protected String pushToText;
    protected String pushToMultimedia;
    protected String pushToLocation;
    protected String urgentMsgOrig;
    protected String grpMemLoc;
    protected String geoFenceFeature;
    protected String voiceMsgFallback;
    protected String pttRadioClient;
    protected String remotePushNotify;
    @XmlElement(name = "gCMPushNotify")
    protected String gcmPushNotify;
    protected String clientUIStats;
    protected String sessionParticipants;
    protected String mediaReconnect3G;
    protected String pttRecordingOnClient;
    protected String multiSimultaneousSession;
    protected String breadcrumb;
    protected String instaDRX;

    /**
     * Gets the value of the instaPOC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstaPOC() {
        return instaPOC;
    }

    /**
     * Sets the value of the instaPOC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstaPOC(String value) {
        this.instaPOC = value;
    }

    /**
     * Gets the value of the missedCallAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMissedCallAlert() {
        return missedCallAlert;
    }

    /**
     * Sets the value of the missedCallAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMissedCallAlert(String value) {
        this.missedCallAlert = value;
    }

    /**
     * Gets the value of the callEndedAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallEndedAlert() {
        return callEndedAlert;
    }

    /**
     * Sets the value of the callEndedAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallEndedAlert(String value) {
        this.callEndedAlert = value;
    }

    /**
     * Gets the value of the locationSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationSubscription() {
        return locationSubscription;
    }

    /**
     * Sets the value of the locationSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationSubscription(String value) {
        this.locationSubscription = value;
    }

    /**
     * Gets the value of the supervisoryOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisoryOverride() {
        return supervisoryOverride;
    }

    /**
     * Sets the value of the supervisoryOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisoryOverride(String value) {
        this.supervisoryOverride = value;
    }

    /**
     * Gets the value of the tuSms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTuSms() {
        return tuSms;
    }

    /**
     * Sets the value of the tuSms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTuSms(String value) {
        this.tuSms = value;
    }

    /**
     * Gets the value of the xcapDocDiff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXcapDocDiff() {
        return xcapDocDiff;
    }

    /**
     * Sets the value of the xcapDocDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXcapDocDiff(String value) {
        this.xcapDocDiff = value;
    }

    /**
     * Gets the value of the pocOverWifi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPocOverWifi() {
        return pocOverWifi;
    }

    /**
     * Sets the value of the pocOverWifi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPocOverWifi(String value) {
        this.pocOverWifi = value;
    }

    /**
     * Gets the value of the httpsSupport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpsSupport() {
        return httpsSupport;
    }

    /**
     * Sets the value of the httpsSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpsSupport(String value) {
        this.httpsSupport = value;
    }

    /**
     * Gets the value of the pagingMessageSupport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagingMessageSupport() {
        return pagingMessageSupport;
    }

    /**
     * Sets the value of the pagingMessageSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagingMessageSupport(String value) {
        this.pagingMessageSupport = value;
    }

    /**
     * Gets the value of the reloginMessageSupport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReloginMessageSupport() {
        return reloginMessageSupport;
    }

    /**
     * Sets the value of the reloginMessageSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReloginMessageSupport(String value) {
        this.reloginMessageSupport = value;
    }

    /**
     * Gets the value of the talkGrpSelectServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTalkGrpSelectServer() {
        return talkGrpSelectServer;
    }

    /**
     * Sets the value of the talkGrpSelectServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTalkGrpSelectServer(String value) {
        this.talkGrpSelectServer = value;
    }

    /**
     * Gets the value of the presenceUpdateReduction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresenceUpdateReduction() {
        return presenceUpdateReduction;
    }

    /**
     * Sets the value of the presenceUpdateReduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresenceUpdateReduction(String value) {
        this.presenceUpdateReduction = value;
    }

    /**
     * Gets the value of the jitterStats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJitterStats() {
        return jitterStats;
    }

    /**
     * Sets the value of the jitterStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJitterStats(String value) {
        this.jitterStats = value;
    }

    /**
     * Gets the value of the historyBasedPresence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryBasedPresence() {
        return historyBasedPresence;
    }

    /**
     * Sets the value of the historyBasedPresence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryBasedPresence(String value) {
        this.historyBasedPresence = value;
    }

    /**
     * Gets the value of the decouplePresenceAndCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecouplePresenceAndCall() {
        return decouplePresenceAndCall;
    }

    /**
     * Sets the value of the decouplePresenceAndCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecouplePresenceAndCall(String value) {
        this.decouplePresenceAndCall = value;
    }

    /**
     * Gets the value of the periodicClientLogsAndReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicClientLogsAndReport() {
        return periodicClientLogsAndReport;
    }

    /**
     * Sets the value of the periodicClientLogsAndReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicClientLogsAndReport(String value) {
        this.periodicClientLogsAndReport = value;
    }

    /**
     * Gets the value of the onDemandClientLogs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnDemandClientLogs() {
        return onDemandClientLogs;
    }

    /**
     * Sets the value of the onDemandClientLogs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnDemandClientLogs(String value) {
        this.onDemandClientLogs = value;
    }

    /**
     * Gets the value of the onDemandLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnDemandLocation() {
        return onDemandLocation;
    }

    /**
     * Sets the value of the onDemandLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnDemandLocation(String value) {
        this.onDemandLocation = value;
    }

    /**
     * Gets the value of the talkGrpSelectClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTalkGrpSelectClient() {
        return talkGrpSelectClient;
    }

    /**
     * Sets the value of the talkGrpSelectClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTalkGrpSelectClient(String value) {
        this.talkGrpSelectClient = value;
    }

    /**
     * Gets the value of the talkGroupScanningClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTalkGroupScanningClient() {
        return talkGroupScanningClient;
    }

    /**
     * Sets the value of the talkGroupScanningClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTalkGroupScanningClient(String value) {
        this.talkGroupScanningClient = value;
    }

    /**
     * Gets the value of the batteryUsageOptimization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatteryUsageOptimization() {
        return batteryUsageOptimization;
    }

    /**
     * Sets the value of the batteryUsageOptimization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatteryUsageOptimization(String value) {
        this.batteryUsageOptimization = value;
    }

    /**
     * Gets the value of the broadcastGrpService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBroadcastGrpService() {
        return broadcastGrpService;
    }

    /**
     * Sets the value of the broadcastGrpService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBroadcastGrpService(String value) {
        this.broadcastGrpService = value;
    }

    /**
     * Gets the value of the xcapCouchbaseClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXcapCouchbaseClient() {
        return xcapCouchbaseClient;
    }

    /**
     * Sets the value of the xcapCouchbaseClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXcapCouchbaseClient(String value) {
        this.xcapCouchbaseClient = value;
    }

    /**
     * Gets the value of the pushToText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPushToText() {
        return pushToText;
    }

    /**
     * Sets the value of the pushToText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPushToText(String value) {
        this.pushToText = value;
    }

    /**
     * Gets the value of the pushToMultimedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPushToMultimedia() {
        return pushToMultimedia;
    }

    /**
     * Sets the value of the pushToMultimedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPushToMultimedia(String value) {
        this.pushToMultimedia = value;
    }

    /**
     * Gets the value of the pushToLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPushToLocation() {
        return pushToLocation;
    }

    /**
     * Sets the value of the pushToLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPushToLocation(String value) {
        this.pushToLocation = value;
    }

    /**
     * Gets the value of the urgentMsgOrig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrgentMsgOrig() {
        return urgentMsgOrig;
    }

    /**
     * Sets the value of the urgentMsgOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrgentMsgOrig(String value) {
        this.urgentMsgOrig = value;
    }

    /**
     * Gets the value of the grpMemLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpMemLoc() {
        return grpMemLoc;
    }

    /**
     * Sets the value of the grpMemLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpMemLoc(String value) {
        this.grpMemLoc = value;
    }

    /**
     * Gets the value of the geoFenceFeature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoFenceFeature() {
        return geoFenceFeature;
    }

    /**
     * Sets the value of the geoFenceFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoFenceFeature(String value) {
        this.geoFenceFeature = value;
    }

    /**
     * Gets the value of the voiceMsgFallback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceMsgFallback() {
        return voiceMsgFallback;
    }

    /**
     * Sets the value of the voiceMsgFallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceMsgFallback(String value) {
        this.voiceMsgFallback = value;
    }

    /**
     * Gets the value of the pttRadioClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPttRadioClient() {
        return pttRadioClient;
    }

    /**
     * Sets the value of the pttRadioClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPttRadioClient(String value) {
        this.pttRadioClient = value;
    }

    /**
     * Gets the value of the remotePushNotify property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemotePushNotify() {
        return remotePushNotify;
    }

    /**
     * Sets the value of the remotePushNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemotePushNotify(String value) {
        this.remotePushNotify = value;
    }

    /**
     * Gets the value of the gcmPushNotify property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGCMPushNotify() {
        return gcmPushNotify;
    }

    /**
     * Sets the value of the gcmPushNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGCMPushNotify(String value) {
        this.gcmPushNotify = value;
    }

    /**
     * Gets the value of the clientUIStats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientUIStats() {
        return clientUIStats;
    }

    /**
     * Sets the value of the clientUIStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientUIStats(String value) {
        this.clientUIStats = value;
    }

    /**
     * Gets the value of the sessionParticipants property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionParticipants() {
        return sessionParticipants;
    }

    /**
     * Sets the value of the sessionParticipants property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionParticipants(String value) {
        this.sessionParticipants = value;
    }

    /**
     * Gets the value of the mediaReconnect3G property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaReconnect3G() {
        return mediaReconnect3G;
    }

    /**
     * Sets the value of the mediaReconnect3G property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaReconnect3G(String value) {
        this.mediaReconnect3G = value;
    }

    /**
     * Gets the value of the pttRecordingOnClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPttRecordingOnClient() {
        return pttRecordingOnClient;
    }

    /**
     * Sets the value of the pttRecordingOnClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPttRecordingOnClient(String value) {
        this.pttRecordingOnClient = value;
    }

    /**
     * Gets the value of the multiSimultaneousSession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiSimultaneousSession() {
        return multiSimultaneousSession;
    }

    /**
     * Sets the value of the multiSimultaneousSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiSimultaneousSession(String value) {
        this.multiSimultaneousSession = value;
    }

    /**
     * Gets the value of the breadcrumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreadcrumb() {
        return breadcrumb;
    }

    /**
     * Sets the value of the breadcrumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreadcrumb(String value) {
        this.breadcrumb = value;
    }

    /**
     * Gets the value of the instaDRX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstaDRX() {
        return instaDRX;
    }

    /**
     * Sets the value of the instaDRX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstaDRX(String value) {
        this.instaDRX = value;
    }

}
