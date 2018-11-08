package section5;

public class SharedDigit {
	
	public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 > 99 || number1 < 10 || number2 > 99 || number2 < 10) {
            return false;
        } else {
            int number1FirstDigit = 0;
            int number1SecondDigit = 0;
            int number2FirstDigit = 0;
            int number2SecondDigit = 0;
            number1FirstDigit = number1 % 10;
            number1 = number1 / 10;
            number1SecondDigit = number1;
            number2FirstDigit = number2 % 10;
            number2 = number2 / 10;
            number2SecondDigit = number2;
                if (number1FirstDigit == number2FirstDigit || 
                		number1FirstDigit == number2SecondDigit || 
                		number1SecondDigit == number1FirstDigit || 
                		number1SecondDigit == number2SecondDigit) {
                    return true;
                } 
            }
            return false;
        }

	public static void main(String[] args) {

		SharedDigit test = new SharedDigit();
		System.out.println(test.hasSharedDigit(12, 23));
		System.out.println(test.hasSharedDigit(9, 99));
		System.out.println(test.hasSharedDigit(15, 55));
	}

}
