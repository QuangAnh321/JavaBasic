package section7.polymorphism;

public class Exciter extends MotorBike {

	public Exciter() {
		super(150);
	}
	
	public void useClutch() {
		System.out.println("Clutch is manual. Pulling the clutch");
	}
	
	public void accelerate(double speed) {
		System.out.println("EXCITER: ");
		if (speed > 0 && speed <= 20) {
			useClutch();
			changeGear(1);
			move(speed);
		} else if (speed > 20 && speed <= 40) {
			useClutch();
			changeGear(2);
			move(speed);
		} else if (speed > 40 && speed <= 60) {
			useClutch();
			changeGear(3);
			move(speed);
		} else if (speed > 60 && speed <= 80) {
			useClutch();
			changeGear(4);
			move(speed);
		} else if (speed > 80) {
			useClutch();
			changeGear(5);
			move(speed);
		} else {
			System.err.println("Cannot accelerate to that speed!");
		}
	}

}
