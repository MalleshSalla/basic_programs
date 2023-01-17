package com.insurencebazar_map_interface;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args){
		InsuranceBazar insuranceBazar = new InsuranceBazar();
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("-----------------------------------------------------------------------");
			System.out.println("1.Add insurance policies 2. View Policies 3. Search policy typess 4.Exit");
			System.out.println("-----------------------------------------------------------------------\n");
			System.out.println("Enter your choice :");
			int menuInput = sc.nextInt();
			if (menuInput == 1) {
				int count = 1;
				System.out.println("Enter the number of policy names you want to store");
				int noOfPolicies = sc.nextInt();
				while (count <= noOfPolicies) {
					System.out.println("Enter the policy Id");
					int policyId = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter the policy name");

					String policyName = sc.nextLine();
					sc.nextLine();
					PolicyDetails policyDetails = new PolicyDetails(policyId, policyName);
					insuranceBazar.addPolicyDetails(policyDetails);
					count++;
				}
			} else if (menuInput == 2) {
				Map<Integer, String> viewAllDetails = insuranceBazar.viewAllPolicyDetails();
				System.out.println("Policy Id" + " " + "Policy Name");
				for (Map.Entry<Integer, String> details : viewAllDetails.entrySet()) {
					System.out.println(details.getKey() + "      " + details.getValue());
				}
			} else if (menuInput == 3) {
				System.out.println("Enter policy type to search");
				String searchInput = sc.next();
				Map<Integer, String> searchBasedOnPolicyType = insuranceBazar.searchBasedOnPolicyType(searchInput);
				List<Integer> policyId = searchBasedOnPolicyType.entrySet().stream().map(s -> s.getKey())
						.collect(Collectors.toList());
				policyId.forEach(System.out::println);
			} else {
				sc.close();
				break;
			}

		}
	}

}
