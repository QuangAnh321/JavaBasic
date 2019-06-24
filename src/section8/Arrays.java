package section8;

import java.util.Scanner;

public class Arrays {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void inputArray(int arrayLength) {
		System.out.println("Enter "+arrayLength+" integer values: ");
		int[] number = new int[arrayLength];
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		printArray(number);
	}
	
	public static void printArray(int[] array) {
		System.out.println("The array elements are: ");
		for (int i = 0; i < array.length; i ++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		inputArray(5);
	}

}
