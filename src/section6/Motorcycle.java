package section6;

public class Motorcycle extends Vehicle {

	
	private int currentGearLevel;
	

	public Motorcycle(String color, double maxSpeed, double gasTankSize, String brand) {
		super(color, maxSpeed, gasTankSize, brand, 2);
		// 0 equals to neutral
		this.currentGearLevel = 0;
	}


	@Override
	public void move(double speed) {
		if (speed > getMaxSpeed()) {
			System.out.println("The motorcycle cannot move that fast!");
		} else {
			System.out.println("Moving at "+speed+" km/h");
		}
	}

	public void changeGear(int gearLevel) {
		this.currentGearLevel = gearLevel;
		System.out.println("Current gear level is: "+currentGearLevel);
	}
	
	
}
