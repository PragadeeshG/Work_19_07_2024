package com.test1;

public class ObjectMapperSerializer {
	private Integer serializerId;
	private Integer serializerName;
	private String publicSerializer;
	private String defaultVPC;
	private String privateSerializer;
	private String subnetsCount;
	private String publicSubnet;
	private String privateSubnet;
	private String internetGateway;
	private String natGateway;
	private String vpcPeering;
	private String endPoint;
	private String vpcFlowLog;
	private String directConnect;

	public ObjectMapperSerializer() {

	}

	public ObjectMapperSerializer(Integer serializerId, Integer serializerName, String publicSerializer,
			String defaultVPC, String privateSerializer, String subnetsCount, String publicSubnet, String privateSubnet,
			String internetGateway, String natGateway, String vpcPeering, String endPoint, String vpcFlowLog,
			String directConnect) {
		super();
		this.serializerId = serializerId;
		this.serializerName = serializerName;
		this.publicSerializer = publicSerializer;
		this.defaultVPC = defaultVPC;
		this.privateSerializer = privateSerializer;
		this.subnetsCount = subnetsCount;
		this.publicSubnet = publicSubnet;
		this.privateSubnet = privateSubnet;
		this.internetGateway = internetGateway;
		this.natGateway = natGateway;
		this.vpcPeering = vpcPeering;
		this.endPoint = endPoint;
		this.vpcFlowLog = vpcFlowLog;
		this.directConnect = directConnect;
	}

	public Integer getSerializerId() {
		return serializerId;
	}

	public void setSerializerId(Integer serializerId) {
		this.serializerId = serializerId;
	}

	public Integer getSerializerName() {
		return serializerName;
	}

	public void setSerializerName(Integer serializerName) {
		this.serializerName = serializerName;
	}

	public String getPublicSerializer() {
		return publicSerializer;
	}

	public void setPublicSerializer(String publicSerializer) {
		this.publicSerializer = publicSerializer;
	}

	public String getDefaultVPC() {
		return defaultVPC;
	}

	public void setDefaultVPC(String defaultVPC) {
		this.defaultVPC = defaultVPC;
	}

	public String getPrivateSerializer() {
		return privateSerializer;
	}

	public void setPrivateSerializer(String privateSerializer) {
		this.privateSerializer = privateSerializer;
	}

	public String getSubnetsCount() {
		return subnetsCount;
	}

	public void setSubnetsCount(String subnetsCount) {
		this.subnetsCount = subnetsCount;
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

	public String getInternetGateway() {
		return internetGateway;
	}

	public void setInternetGateway(String internetGateway) {
		this.internetGateway = internetGateway;
	}

	public String getNatGateway() {
		return natGateway;
	}

	public void setNatGateway(String natGateway) {
		this.natGateway = natGateway;
	}

	public String getVpcPeering() {
		return vpcPeering;
	}

	public void setVpcPeering(String vpcPeering) {
		this.vpcPeering = vpcPeering;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public String getVpcFlowLog() {
		return vpcFlowLog;
	}

	public void setVpcFlowLog(String vpcFlowLog) {
		this.vpcFlowLog = vpcFlowLog;
	}

	public String getDirectConnect() {
		return directConnect;
	}

	public void setDirectConnect(String directConnect) {
		this.directConnect = directConnect;
	}

}
