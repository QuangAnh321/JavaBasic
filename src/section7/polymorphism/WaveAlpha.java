package section7.polymorphism;

public class WaveAlpha extends MotorBike {

	public WaveAlpha() {
		super(110);
	}
	
	public void useClutch () {
		System.out.println("Clutch is automatic");
	}
	
	public void accelerate(double speed) {
		System.out.println("WAVE ALPHA: ");
		if (speed > 0 && speed <= 10) {
			useClutch();
			changeGear(1);
			move(speed);
		} else if (speed > 10 && speed <= 20) {
			useClutch();
			changeGear(2);
			move(speed);
		} else if (speed > 20 && speed <= 30) {
			useClutch();
			changeGear(3);
			move(speed);
		} else if (speed > 30) {
			useClutch();
			changeGear(4);
			move(speed);
		} else {
			System.err.println("Cannot accelerate to that speed!");
		}
	}
}
