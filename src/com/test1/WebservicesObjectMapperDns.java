package com.test1;

public class WebservicesObjectMapperDns {
	private String objectMapperName;
	private String objectMapperId;
	private String sourceIp;
	private String objectMapperEntryType;
	private String healthCheckStatus;
	private String primitiveResourceId;
	private String primitiveResourceName;
	private String publicSubnet;
	private String privateSubnet;
	private String status;

	public WebservicesObjectMapperDns() {

	}

	public WebservicesObjectMapperDns(String objectMapperName, String objectMapperId, String sourceIp,
			String objectMapperEntryType, String healthCheckStatus, String primitiveResourceId,
			String primitiveResourceName, String publicSubnet, String privateSubnet, String status) {
		super();
		this.objectMapperName = objectMapperName;
		this.objectMapperId = objectMapperId;
		this.sourceIp = sourceIp;
		this.objectMapperEntryType = objectMapperEntryType;
		this.healthCheckStatus = healthCheckStatus;
		this.primitiveResourceId = primitiveResourceId;
		this.primitiveResourceName = primitiveResourceName;
		this.publicSubnet = publicSubnet;
		this.privateSubnet = privateSubnet;
		this.status = status;
	}

	public String getObjectMapperName() {
		return objectMapperName;
	}

	public void setObjectMapperName(String objectMapperName) {
		this.objectMapperName = objectMapperName;
	}

	public String getObjectMapperId() {
		return objectMapperId;
	}

	public void setObjectMapperId(String objectMapperId) {
		this.objectMapperId = objectMapperId;
	}

	public String getSourceIp() {
		return sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

	public String getObjectMapperEntryType() {
		return objectMapperEntryType;
	}

	public void setObjectMapperEntryType(String objectMapperEntryType) {
		this.objectMapperEntryType = objectMapperEntryType;
	}

	public String getHealthCheckStatus() {
		return healthCheckStatus;
	}

	public void setHealthCheckStatus(String healthCheckStatus) {
		this.healthCheckStatus = healthCheckStatus;
	}

	public String getPrimitiveResourceId() {
		return primitiveResourceId;
	}

	public void setPrimitiveResourceId(String primitiveResourceId) {
		this.primitiveResourceId = primitiveResourceId;
	}

	public String getPrimitiveResourceName() {
		return primitiveResourceName;
	}

	public void setPrimitiveResourceName(String primitiveResourceName) {
		this.primitiveResourceName = primitiveResourceName;
	}

	public String getPublicSubnet() {
		return publicSubnet;
	}

	public void setPublicSubnet(String publicSubnet) {
		this.publicSubnet = publicSubnet;
	}

	public String getPrivateSubnet() {
		return privateSubnet;
	}

	public void setPrivateSubnet(String privateSubnet) {
		this.privateSubnet = privateSubnet;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
