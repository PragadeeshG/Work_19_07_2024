package com.test1;

public class MappingPolicy {
	private Integer objectMapperId;
	private String manualMapping;
	private boolean automatedObjectMapper;
	private Integer objectMapperTableId;
	private String objectMapperTableName;
	private String simplePolicy;
	private String weightedPolicy;
	private String latencyPolicy;
	private String failOver;
	private Integer geoLocation;
	private String geoProximity;
	private String ipBased;
	private String multiValue;

	public MappingPolicy() {

	}

	public MappingPolicy(Integer objectMapperId, String manualMapping, boolean automatedObjectMapper,
			Integer objectMapperTableId, String objectMapperTableName, String simplePolicy, String weightedPolicy,
			String latencyPolicy, String failOver, Integer geoLocation, String geoProximity, String ipBased,
			String multiValue) {
		super();
		this.objectMapperId = objectMapperId;
		this.manualMapping = manualMapping;
		this.automatedObjectMapper = automatedObjectMapper;
		this.objectMapperTableId = objectMapperTableId;
		this.objectMapperTableName = objectMapperTableName;
		this.simplePolicy = simplePolicy;
		this.weightedPolicy = weightedPolicy;
		this.latencyPolicy = latencyPolicy;
		this.failOver = failOver;
		this.geoLocation = geoLocation;
		this.geoProximity = geoProximity;
		this.ipBased = ipBased;
		this.multiValue = multiValue;
	}

	public Integer getObjectMapperId() {
		return objectMapperId;
	}

	public void setObjectMapperId(Integer objectMapperId) {
		this.objectMapperId = objectMapperId;
	}

	public String getManualMapping() {
		return manualMapping;
	}

	public void setManualMapping(String manualMapping) {
		this.manualMapping = manualMapping;
	}

	public boolean isAutomatedObjectMapper() {
		return automatedObjectMapper;
	}

	public void setAutomatedObjectMapper(boolean automatedObjectMapper) {
		this.automatedObjectMapper = automatedObjectMapper;
	}

	public Integer getObjectMapperTableId() {
		return objectMapperTableId;
	}

	public void setObjectMapperTableId(Integer objectMapperTableId) {
		this.objectMapperTableId = objectMapperTableId;
	}

	public String getObjectMapperTableName() {
		return objectMapperTableName;
	}

	public void setObjectMapperTableName(String objectMapperTableName) {
		this.objectMapperTableName = objectMapperTableName;
	}

	public String getSimplePolicy() {
		return simplePolicy;
	}

	public void setSimplePolicy(String simplePolicy) {
		this.simplePolicy = simplePolicy;
	}

	public String getWeightedPolicy() {
		return weightedPolicy;
	}

	public void setWeightedPolicy(String weightedPolicy) {
		this.weightedPolicy = weightedPolicy;
	}

	public String getLatencyPolicy() {
		return latencyPolicy;
	}

	public void setLatencyPolicy(String latencyPolicy) {
		this.latencyPolicy = latencyPolicy;
	}

	public String getFailOver() {
		return failOver;
	}

	public void setFailOver(String failOver) {
		this.failOver = failOver;
	}

	public Integer getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(Integer geoLocation) {
		this.geoLocation = geoLocation;
	}

	public String getGeoProximity() {
		return geoProximity;
	}

	public void setGeoProximity(String geoProximity) {
		this.geoProximity = geoProximity;
	}

	public String getIpBased() {
		return ipBased;
	}

	public void setIpBased(String ipBased) {
		this.ipBased = ipBased;
	}

	public String getMultiValue() {
		return multiValue;
	}

	public void setMultiValue(String multiValue) {
		this.multiValue = multiValue;
	}

}
