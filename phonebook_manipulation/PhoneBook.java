package com.phonebook_manipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneBook {
	
	List<Contact> phoneBook = new ArrayList<>();

	public List<Contact> getPhoneBook() {
		return phoneBook;
	}

	public void setPhoneBook(List<Contact> phoneBook) {
		this.phoneBook = phoneBook;
	}
	
	public void addContact(Contact contactObj) {
		phoneBook.add(contactObj);
	}
	
	public List<Contact>  viewAllContacts(){
		return phoneBook;
	}
	
	public List<Contact> viewContactGivenPhone(long phoneNumber) {
		return  phoneBook.stream().filter(s->s.getPhoneNumber()==phoneNumber).collect(Collectors.toList());
	}
	
	public boolean removeContact(long phoneNumber) {
		return phoneBook.removeIf(s -> s.getPhoneNumber()==phoneNumber);
	}

}
