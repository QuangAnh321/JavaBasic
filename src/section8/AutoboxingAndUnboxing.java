package section8;

import java.util.ArrayList;

public class AutoboxingAndUnboxing {

	public static void main(String[] args) {

		/*
		 * Autoboxing
		 * Wrap primitive type data so they can be used as object (Convert primitive data to object
		 */
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++) {
			intArray.add(Integer.valueOf(i));
		}
		intArray.add(new Integer(11));
		
		ArrayList<Character> charArray = new ArrayList<Character>();
		char ch = 'a'; 
        Character a = ch; 
		charArray.add(a);
		
		// Unboxing
		for (int i = 0; i < intArray.size(); i++) {
			System.out.println(i+" -> "+intArray.get(i).intValue());
		}
		
		System.out.println("");
		
		for (int i = 0; i < charArray.size(); i++) {
			System.out.println(i+" -> "+charArray.get(i).toString());
		}
	}

}
