package section5;

public class NumberToWords {
	public static void numberToWords(int number) {
		if (number < 0) {
			System.out.println("Invalid Value");
		} else {
			int difference = getDigitCount(number) - getDigitCount(reverse(number));
			number = reverse(number);
			while (number > 0) {
				int temp = number % 10;
				switch (temp) {
				case 0:
					System.out.println("Zero");
					break;
				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3:
					System.out.println("Three");
					break;
				case 4:
					System.out.println("Four");
					break;
				case 5:
					System.out.println("Five");
					break;
				case 6:
					System.out.println("Six");
					break;
				case 7:
					System.out.println("Seven");
					break;
				case 8:
					System.out.println("Eight");
					break;
				case 9:
					System.out.println("Nine");
					break;
				default:
					System.out.println("Error");
					break;
				}
				number = number / 10;
			}
			for (int i = 1; i <= difference; i++) {
				System.out.println("Zero");
			}
		}
	}

	public static int reverse(int numberTobeReversed) {
		int reversedNumber = 0;
		while (numberTobeReversed != 0) {
			int temp = numberTobeReversed % 10;
			reversedNumber *= 10;
			reversedNumber += temp;
			numberTobeReversed /= 10;
		}
		return reversedNumber;
	}

	public static int getDigitCount(int number) {
		int count = 0;
		if (number < 0) {
			return -1;
		} else if (number == 0) {
			count = 1;
		} else {
			while (number > 0) {
				count++;
				number /= 10;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		NumberToWords.numberToWords(100);
		// NumberToWords.reverse(124);
		// System.out.println(NumberToWords.getDigitCount(100));
	}
}
