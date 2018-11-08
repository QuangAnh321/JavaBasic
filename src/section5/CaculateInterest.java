package section5;

public class CaculateInterest {
	
	public static double caculateInterest(double interestRate, double amount) {
		return(amount*(interestRate/100));
	}

	public static void main(String[] args) {
		for(int i = 2; i <= 8; i++) {
			System.out.println("10000 at "+i+"% interestRate = "+caculateInterest(i,10000));
		}
		
		System.out.println("");
		
		for(int i = 8; i > 1; i--) {
			System.out.println("10000 at "+i+"% interestRate = "+caculateInterest(i,10000));
		}
	}

}
