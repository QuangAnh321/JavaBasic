package section6;

public class Vehicle {

	private String color;
	private double maxSpeed;
	private double gasTankSize;
	private String brand;
	private int numberofWheels;

	public Vehicle(String color, double maxSpeed, double gasTankSize, String brand, int numberofWheels) {

		this.color = color;
		this.maxSpeed = maxSpeed;
		this.gasTankSize = gasTankSize;
		this.brand = brand;
		this.numberofWheels = numberofWheels;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getGasTankSize() {
		return gasTankSize;
	}

	public void setGasTankSize(double gasTankSize) {
		this.gasTankSize = gasTankSize;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNumberofWheels() {
		return numberofWheels;
	}

	public void setNumberofWheels(int numberofWheels) {
		this.numberofWheels = numberofWheels;
	}

	public void move(double speed) {

	}

}
