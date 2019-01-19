package section5;

import java.util.Scanner;

public class MinimumAndMaximumChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int counter = 0;
		int minNumber = 0;
		int maxNumber = 0;
		boolean first = true;
		
		while (counter < 10) {
			System.out.println("Enter number: ");
			boolean isAnInt = sc.hasNextInt();
			
			if(isAnInt) {
				int number = sc.nextInt();
				counter++;
				//This allow the program to find min and max with negative numbers input from user
				if(first) {
					first = false;
					minNumber = number;
					maxNumber= number;
				}
				
				if(maxNumber < number) {
					maxNumber = number;
				}
				
				if(minNumber > number) {
					minNumber = number;
				}
				
			} else {
				System.err.println("Invalid number");
				break;
			}
			sc.nextLine();
		}
		System.out.println("Max =  "+maxNumber+", Min = "+minNumber);
		sc.close();
	}

}
