package section5;

public class Blabla {
	
	public static int reverse(int numberTobeReversed) {
		int reversedNumber = 0;
		while (numberTobeReversed > 0) {
			int temp = numberTobeReversed % 10;
			reversedNumber *= 10;
			reversedNumber += temp;
			numberTobeReversed /= 10;                       
		}
		return reversedNumber;
	}

	public static void main(String[] args) {
		Blabla a = new Blabla();
		System.out.print(a.reverse(1234));
	}

}
