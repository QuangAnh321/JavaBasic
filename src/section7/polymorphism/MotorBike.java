package section7.polymorphism;

public class MotorBike {
	
	private int cylinderVolume;
	private int wheelNum;
	private int currentGearLevel;
	
	public MotorBike (int cylinderVolume) {
		this.cylinderVolume = cylinderVolume;
		this.wheelNum = 2;
		this.currentGearLevel = 0;
	}
	
	public void move (double speed) {
		System.out.println("Moving at: "+speed+" km/h");
	}
	
	public void changeGear(int gearLevel) {
		this.currentGearLevel = gearLevel;
		System.out.println("Current gear level is set to: "+currentGearLevel);
	}
	
	public void accelerate(double speed) {
		System.out.println("Each vehicle accelerate differently!");
	}
	
	public void brake () {
		System.out.println("Brake: Using the right hand brake and/or the right foot brake");
		System.out.println("");
	}
	
	public void useClutch() {
		System.out.println("Clutch is either manual or automatic");
	}
	
	public int getCylinderVolume() {
		return cylinderVolume;
	}

	public int getWheelNum() {
		return wheelNum;
	}

	public int getCurrentGearLevel() {
		return currentGearLevel;
	}

	public static void main(String[] args) {
		WaveAlpha wave = new WaveAlpha();
		wave.accelerate(10);
		wave.brake();
		AirBlade ab = new AirBlade();
		ab.accelerate(100);
		ab.brake();
		Exciter ex = new Exciter();
		ex.accelerate(90);
		ex.brake();
	}

}
