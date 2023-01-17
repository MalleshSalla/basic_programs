package com.insurencebazar_map_interface;

public class PolicyDetails {
	
	private int policyId;
	private String insurancePolicyName;
	
	
	public PolicyDetails() {
		super();
	}
	public PolicyDetails(int policyId, String insurancePolicyName) {
		super();
		this.policyId = policyId;
		this.insurancePolicyName = insurancePolicyName;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getInsurancePolicyName() {
		return insurancePolicyName;
	}
	public void setInsurancePolicyName(String insurancePolicyName) {
		this.insurancePolicyName = insurancePolicyName;
	}
	@Override
	public String toString() {
		return "PolicyDetails [policyId=" + policyId + ", insurancePolicyName=" + insurancePolicyName + "]";
	}
	
	

}
