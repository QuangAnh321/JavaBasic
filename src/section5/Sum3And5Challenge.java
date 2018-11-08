package section5;

public class Sum3And5Challenge {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for(int k = 1; k < 1001; k++) {
			if (k % 3 == 0 && k % 5 == 0 ) {
				System.out.println(k);
				sum = sum + k;
				count++;
				if(count == 5) {
					break;
				}
			}
		}
		System.out.println("The sum is: "+sum);
	}

}
