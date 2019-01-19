package section5;

import java.util.Scanner;
/**
 * 
 * @author quanganhlinux
 *
 * @note accept negative numbers
 */
public class ReadingUserInputChallengeWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int counter = 0;
		int sum = 0;
		
		while(true) {
			int order = counter + 1;
			System.out.println("Enter number #"+order+":");
			boolean isAnInt = sc.hasNextInt();
			
			if(isAnInt) {
				int number = sc.nextInt();
				sum += number;
				counter++;
				if (counter == 10) {
					break;
				}
			} else {
				System.err.println("Invalid number");
			}
			
			sc.nextLine();
		}
		
		System.out.println("The sum of all numbers is: "+sum);
		sc.close();
	}

}
