package section5;

public class PrimeNumber {

	public static void findThreePrimeNumber(int startingNumber, int endingNumber) {

		int count = 0;
		for (int i = startingNumber; i < endingNumber; startingNumber++) {
			if (startingNumber == 1) {
				System.err.println("number should start at 2");
				break;
			}
			for (int n = 2; n <= startingNumber / 2; n++) {
				if (startingNumber % n == 0) {
					System.out.println("Not a prime");
				} else {
					System.out.println(startingNumber);
					count++;
				}
				if (count == 3) {
					break;
				}

			}
		}
	}

	public static void main(String[] args) {
		PrimeNumber test = new PrimeNumber();
		test.findThreePrimeNumber(4, 10);

	}
}
