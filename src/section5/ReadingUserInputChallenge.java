package section5;

import java.util.Scanner;

public class ReadingUserInputChallenge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int number4 = 0;
		int number5 = 0;
		int number6 = 0;
		int number7 = 0;
		int number8 = 0;
		int number9 = 0;
		int number10 = 0;
		System.out.println("Enter number #1: ");
		boolean isNumber1AnInt = sc.hasNextInt();

		if (isNumber1AnInt) {
			number1 = sc.nextInt();
			sc.nextLine();
		} else {
			System.err.println("Invalid number");
			sc.nextLine();
		}
		
		System.out.println("Enter number #2: ");
		boolean isNumber2AnInt = sc.hasNextInt();

		if (isNumber2AnInt) {
			number2 = sc.nextInt();
			sc.nextLine();
		} else {
			System.err.println("Invalid number");
		}
		
		System.out.println("Enter number #3: ");
		boolean isNumber3AnInt = sc.hasNextInt();

		if (isNumber3AnInt) {
			number3 = sc.nextInt();
			sc.nextLine();
		} else {
			System.err.println("Invalid number");
		}
		
		System.out.println("Enter number #4: ");
		boolean isNumber4AnInt = sc.hasNextInt();

		if (isNumber4AnInt) {
			number4 = sc.nextInt();
			sc.nextLine();
		} else {
			System.err.println("Invalid number");
		}
		
		System.out.println("Enter number #5: ");
		boolean isNumber5AnInt = sc.hasNextInt();

		if (isNumber5AnInt) {
			number5 = sc.nextInt();
			sc.nextLine();
		} else {
			System.err.println("Invalid number");
		}
		
		System.out.println("Enter number #6: ");
		boolean isNumber6AnInt = sc.hasNextInt();

		if (isNumber6AnInt) {
			number6 = sc.nextInt();
			sc.nextLine();
		} else {
			System.err.println("Invalid number");
		}
		
		System.out.println("Enter number #7: ");
		boolean isNumber7AnInt = sc.hasNextInt();

		if (isNumber7AnInt) {
			number7 = sc.nextInt();
			sc.nextLine();
		} else {
			System.err.println("Invalid number");
		}
		
		System.out.println("Enter number #8: ");
		boolean isNumber8AnInt = sc.hasNextInt();

		if (isNumber8AnInt) {
			number8 = sc.nextInt();
			sc.nextLine();
		} else {
			System.err.println("Invalid number");
		}
		
		System.out.println("Enter number #9: ");
		boolean isNumber9AnInt = sc.hasNextInt();

		if (isNumber9AnInt) {
			number9 = sc.nextInt();
			sc.nextLine();
		} else {
			System.err.println("Invalid number");
		}
		
		System.out.println("Enter number #10: ");
		boolean isNumber10AnInt = sc.hasNextInt();

		if (isNumber10AnInt) {
			number10 = sc.nextInt();
		} else {
			System.err.println("Invalid number");
		}

		if (number1 <= 0 || number2 <= 0 || number3 <= 0 || number4 <= 0 || number5 <= 0 || 
				number6 <= 0 || number7 <= 0 || number8 <= 0 || number9 <= 0 || number10 <= 0) {
			System.err.println("Number(s) must be greater than 0");
		} else {
			int sum = number1 + number2 + number3 + number4 + number5 + 
					number6 + number7 + number8 + number9 + number10;
			System.out.println("The sum of all numbers is: "+sum);
		}
	}
}
