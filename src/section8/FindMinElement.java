package section8;

import java.util.Scanner;

public class FindMinElement {

	private static Scanner sc;
	
	public static int[] readInteger(int count) {
		sc = new Scanner(System.in);
		System.out.println("Enter "+count+" numbers");
		int[] integerArray = new int[count];
		for (int i = 0; i < integerArray.length; i++) {
			integerArray[i] = sc.nextInt();
		}
		return integerArray;
		
	}
	
	public static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The minimum element in the array is "+findMin(readInteger(5)));
	}

}
