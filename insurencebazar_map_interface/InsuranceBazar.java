package com.insurencebazar_map_interface;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class InsuranceBazar {

	Map<Integer, String> insuranceBazar = new TreeMap<>();

	public Map<Integer, String> getInsuranceBazar() {
		return insuranceBazar;
	}

	public void setInsuranceBazar(Map<Integer, String> insuranceBazar) {
		this.insuranceBazar = insuranceBazar;
	}

	public void addPolicyDetails(PolicyDetails policyDetails) {
		insuranceBazar.put(policyDetails.getPolicyId(), policyDetails.getInsurancePolicyName());
	}

	public Map<Integer, String> viewAllPolicyDetails() {
		return insuranceBazar;
	}

	public Map<Integer, String> searchBasedOnPolicyType(String insurancePolicyType) {
		return insuranceBazar.entrySet().stream().filter(s -> s.getValue().contains(insurancePolicyType))
				.collect(Collectors.toMap(s -> s.getKey(), s -> s.getValue()));
	}

}
