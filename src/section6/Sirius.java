package section6;

public class Sirius extends Motorcycle {
	
	
	public Sirius(String color, double maxSpeed, double gasTankSize) {
		super(color, maxSpeed, gasTankSize, "Yamaha");	
	}

	
	public void accelerate(double speed) {
		if (speed == 0) {
			System.out.println("The motorbike is stopped");
		} else if (speed >=1 && speed < 10) {
			changeGear(1);
			super.move(speed);
		} else if (speed >= 10 && speed < 20) {
			changeGear(2);
			super.move(speed);
		} else if (speed >= 20 && speed < 30) {
			changeGear(3);
			super.move(speed);
		} else if (speed >= 30) {
			changeGear(4);
			super.move(speed);
		} else {
			System.out.println("Please check the speed!");
		}
		
	}

	
	
}
