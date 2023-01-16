package com.phonebook_manipulation;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		PhoneBook book = new PhoneBook();

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("--------------------------------------------------");
			System.out.println("1.Add contacts 2. Display All contact 3. Search Member by Phone Number 4.Exit");
			System.out.println("--------------------------------------------------\n");
			System.out.println("Enter your choice :");
			int input = sc.nextInt();

			if (input == 1) {

				System.out.println("Enter contact first name ");
				String firstName = sc.next();

				sc.nextLine();

				System.out.println("Enter contact last name ");
				String lastName = sc.nextLine();

				System.out.println("Enter contact phone number ");
				long phoneNumber = sc.nextLong();

				System.out.println("Enter contact Email Id ");
				String emailId = sc.next();
				book.addContact(new Contact(firstName, lastName, phoneNumber, emailId));

			}

			else if (input == 2) {
				List<Contact> allContacts = book.viewAllContacts();
				allContacts.forEach(System.out::println);
			} else if (input == 3) {

				System.out.println("Enter the phone number !");
				long number = sc.nextLong();

				System.out.print("Do you want to remove the contact (Y/N):");
				char yesOrNo = sc.next().charAt(0);
				if (yesOrNo == 'y') {
					book.removeContact(number);
					System.out.println("Contact is deleted successfully ");
				}

			} else if (input == 4) {
				sc.close();
				break;
			}

		}

	}

}
