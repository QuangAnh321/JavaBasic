package section6;

public class ANewPhone {

	public static void main(String[] args) {
		Apple iPhone = new Apple(5.5, "ios", "Apple A12", 4, "Xs");
		iPhone.call();
		System.out.println(iPhone.getScreenSize());
		iPhone.setScreenSize(6.9);
		System.out.println(iPhone.getScreenSize());
		iPhone.sleep();
	}

}
