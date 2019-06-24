package section8;

import java.util.Scanner;

public class MobilePhoneDemo {

	private static Scanner sc = new Scanner(System.in);
	private static MobilePhone phone = new MobilePhone();

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printInstruction();
		while (!quit) {
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 0:
				printInstruction();
				break;
			case 1:
				phone.addContact();
				break;
			case 2:
				phone.modifyContact();
				break;
			case 3:
				phone.viewAllContact();
				break;
			case 4:
				phone.removeAllContact();
				break;
			case 5:
				phone.removeSingleContact();
				break;
			case 6:
				phone.findContactByName();
				break;
			case 7:
				quit = true;
				System.out.println("Shutting down...");
				break;
			default:
				System.out.println("Please choose a vaild option");
			}
		}
	}

	private static void printInstruction() {
		System.out.println("Press: ");
		System.out.println("0 to show this instruction");
		System.out.println("1 to add contact to phone book ");
		System.out.println("2 to change a contact in phone book");
		System.out.println("3 to view all contact in phonebook");
		System.out.println("4 to clear the phone book");
		System.out.println("5 to remove an contact in phone book");
		System.out.println("6 to find a contact by name");
		System.out.println("7 to quit");
	}
}
