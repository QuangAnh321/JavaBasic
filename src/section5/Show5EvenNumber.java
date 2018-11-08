package section5;

public class Show5EvenNumber {

	public static void main(String[] args) {
		int number = 4;
		int finishNumber = 20;
		int totalEvenNumber = 0;
		while (number <= finishNumber) {
			number++;
			if (!IsEvenNumber.isEvenNumber(number)) {
				continue;
			}
			System.out.println("Even number: " + number);
			totalEvenNumber++;
			if (totalEvenNumber >= 5) {
				break;
			}
		}
		System.out.println("Total even numbers: " + totalEvenNumber);
	}

}
