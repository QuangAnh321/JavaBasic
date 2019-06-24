package section7.polymorphism;

public class AirBlade extends MotorBike {

	public AirBlade() {
		super(125);
	}
	
	public void brake() {
		System.out.println("Brake: Using the right hand brake only");
		System.out.println("");
	}
	
	public void useClutch() {
		System.out.println("Clutch is automatic");
	}
	
	public void changeGear(int gearLevel) {
		System.out.println("Gear is changed automatically");
	}
	
	/*
	 * 
	 * @note gear level -1 mean automatic gear
	 */
	public void accelerate (double speed) {
		System.out.println("AIR BLADE: ");
		useClutch();
		changeGear(-1);
		move(speed);
	}

}
