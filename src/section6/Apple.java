package section6;

public class Apple extends MobilePhone {

	public Apple(double screenSize, String operatingSystem, 
			String processor, int ram, String model) {
		super(screenSize, operatingSystem, processor, ram, model);
	}

	@Override
	public void sleep() {
		super.sleep();
		System.out.println("iPhone is sleeping");
	}
	
}
