package section5;

public class DigitSum {

	public static int sumDigit(int number) {
		int sum = 0;
		if (number < 10) {
			return -1;
		} else {
			while (number >= 1) {
				int temp = number % 10;
				sum = sum + temp;
				number = number / 10;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		DigitSum test = new DigitSum();
		System.out.println(test.sumDigit(123));
	}
}
