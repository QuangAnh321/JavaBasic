package section8;

import java.util.Scanner;

public class Shopping {
	
	private static Scanner sc = new Scanner(System.in);
	private static GroceryStore store = new GroceryStore();

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
				store.addtoCart();
				break;
			case 2:
				store.changeCart();
				break;
			case 3:
				store.checkCart();
				break;
			case 4:
				store.clearCart();
				break;
			case 5:
				store.removeItem();
				break;
			case 6:
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
		System.out.println("1 to add an item to cart ");
		System.out.println("2 to change an item in cart");
		System.out.println("3 to check items in cart");
		System.out.println("4 to clear cart");
		System.out.println("5 to remove an item");
		System.out.println("6 to quit");
	}

}
