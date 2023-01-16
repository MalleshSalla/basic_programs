package com.library_application;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Library library = new Library();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.Add Member 2. View All Members 3. Search Member by Address 4.Exit");
			System.out.println("--------------------------------------------------\n");
			System.out.println("Enter your choice :");
			int input = sc.nextInt();
			if (input==1) {
				
				System.out.println("Enter the Id");
				int id =sc.nextInt();
				
				System.out.println("Enter the name");
				String name = sc.next();
				
				sc.nextLine();
				
				System.out.println("Enter the address");
				String address = sc.next();
		
				library.addMember(new Member(id,name,address));
			}
			
			else if (input==2) {
				List<Member> viewDetails = library.viewAllMembers();
				viewDetails.forEach(System.out::println);
			}
			
			else if (input==3) {
				System.out.println("Enter the Address");
				String address = sc.next();
				 List<Member> sortByAddress =  library.viewMembersByAddress(address);
				 sortByAddress.forEach(System.out::println);
			}
			
			else if(input==4){
				sc.close();
				break;
			}
	
		}
		
	}

}
