package section8;

public class ReverseArray {
	
	public static void reverse(int[] array) {
		System.out.println("The elements of the original array are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		int[] reversedArray = new int[array.length];
		int reversedArrayIndex = 0;
		for (int i = array.length -1; i >= 0; i--) {
			reversedArray[reversedArrayIndex] = array[i];
			reversedArrayIndex++;
		}
		System.out.println("The elements of the reversed array are: ");
		for (int i = 0; i < reversedArray.length; i++) {
			System.out.println(reversedArray[i]);
		}
	}

	public static void main(String[] args) {
		int[] test = {1, 2, 3, 4, 5};
		reverse(test);

	}

}
