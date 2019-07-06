package section8;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
	
	private static ArrayList<Contact> contactList;
	private static Scanner sc;
	
	public MobilePhone() {
		contactList = new ArrayList<Contact>();
		sc = new Scanner(System.in);
	}
	
	public void addContact() {
		System.out.println("Enter contact name: ");
		String contactName = sc.nextLine();
		if(findContact(contactName) != null) {
			System.out.println("Contact already exist");
			addContact();
		}
		System.out.println("Enter contact phone number: ");
		int contactPhoneNumber = sc.nextInt();
		sc.nextLine();
		
		Contact newContact = new Contact(contactPhoneNumber, contactName);
		contactList.add(newContact);
		System.out.println("New contact added successfully");
	}
	
	public void modifyContact() {
		System.out.println("Enter the contact name that you want to modify ");
		String name = sc.nextLine();
		Contact contact = findContact(name);
		if (contact == null) {
			System.out.println("The contact with name: "+name+" cannot be found");
			modifyContact();
		} else {
			System.out.println("Enter new contact phone number , or press 0 to skip:");
			int newPhoneNumber = sc.nextInt();
			if (newPhoneNumber == 0) {
				newPhoneNumber = contact.getPhoneNumber();
			} else {
				contact.setPhoneNumber(newPhoneNumber);
			}
			System.out.println("Contact info updated successfully");
			
		}
		
	}
	
	public void removeAllContact() {
		contactList.clear();
		System.out.println("All contacts clear successfully");
	}
	
	public Contact findContact(String name) {
		for (int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getName().equals(name)) {
				return contactList.get(i);
			}
		}
		return null;
	}
	
	public void removeSingleContact() {
		System.out.println("Enter contact name: ");
		String name = sc.nextLine();
		Contact contact = findContact(name);
		if (contact == null) {
			System.out.println("The contact cannot be found!");
		} else {
			contactList.remove(contactList.indexOf(contact));
			System.out.println("Contact removed successfully");
		}
	}
	
	public void viewAllContact() {
		System.out.println("You have "+contactList.size()+" contacts in your phone book");
		for (int i = 0; i < contactList.size(); i++) {
			Contact contact = contactList.get(i);
			System.out.println("Contact name: "+contact.getName());
			System.out.println("Contact phone number: "+contact.getPhoneNumber());
		}
	}
	
	public void findContactByName() {
		System.out.println("Enter the name of the contact that you want to find: ");
		String name = sc.nextLine();
		Contact contact = findContact(name);
		if (contact == null) {
			System.out.println("The contact cannot be found");
		} else {
			System.out.println("Contact "+contact.getName()+" found with phone number: "+contact.getPhoneNumber());
		}
	}
}
