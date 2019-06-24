package section8;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryStore {

	private static Scanner sc;
	private ArrayList<String> cart;
	
	public GroceryStore() {
		cart = new ArrayList<String>();
		sc = new Scanner(System.in);
	}
	
	public void changeCart() {
		System.out.println("Enter item name to be modified: ");
		String name = sc.nextLine();
		if(cart.contains(name)) {
			System.out.println("Enter new name");
			String newName = sc.nextLine();
			cart.set(cart.indexOf(name), newName);
			System.out.println("New Item "+name+" is changed to"+newName+" successfully");
		} else {
			System.out.println("The item "+name+" cannot be found.");
		}
	}
	
	public void addtoCart() {
		System.out.println("Enter the item name: ");
		String name = sc.nextLine();
		cart.add(name);
		System.out.println("Added item "+name+" to cart");
	}
	
	public void checkCart() {
		System.out.println("You have "+cart.size()+" items in your cart");
		for(int i = 0; i < cart.size(); i++) {
			System.out.println(cart.get(i));
		}
	}
	
	public void clearCart() {
		cart.clear();
		System.out.println("Cart clear successfully");
	}
	
	public void removeItem() {
		System.out.println("Enter the item name to be removed" );
		String name = sc.nextLine();
		if(cart.contains(name)) {
			cart.remove(cart.indexOf(name));
			System.out.println("Item "+name+" removed successfully");
		} else {
			System.out.println("The item "+name+" cannot be found.");
		}
	}
}

