package section8;

import java.util.Scanner;

public class SortArray {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int[] getInteger(int arrayLength) {
		System.out.println("Enter "+arrayLength+" integer values: ");
		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}
	
	public static void sortArray(int[] x) {
		boolean swapped = true;
	    while (swapped) {
	        swapped = false;
	        for(int i=0; i<x.length - 1; i++) {
	            int temp=0;
	            if(x[i] < x[i+1]) {
	                temp = x[i];
	                 x[i] = x[i+1];
	                 x[i+1] = temp;
	                 swapped = true;
	             }
	         }
	     }
	}
	
	public static void printArray(int[] array) {
		System.out.println("The array elements are: ");
		for (int i = 0; i < array.length; i ++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		int[] test = getInteger(5);
		sortArray(test);
		printArray(test);
	}

}
