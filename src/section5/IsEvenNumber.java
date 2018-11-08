package section5;

public class IsEvenNumber {
	
	public static boolean isEvenNumber(int number) {
		 while (number % 2 == 0) {
			 return true;
		 }
		 return false;
	}

	public static void main(String[] args) {
		IsEvenNumber test = new IsEvenNumber();
		System.out.println(test.isEvenNumber(4));
	}

}
