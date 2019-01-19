package section5;

public class GreatestCommonDivisor {

	public static int getGreatestCommonDivisor(int first, int second) {
		while (first != second) {
			if (first > second) {
				first = first / (first - second);
			} else {
				second = second / (second - first);
			}
		}
		return first;
	}

	public static void main(String[] args) {
		GreatestCommonDivisor test = new GreatestCommonDivisor();
		System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(10, 15));
	}

}
