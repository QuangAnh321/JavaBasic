package section6;

public class MobilePhone {

	private double screenSize;
	private String operatingSystem;
	private String processor;
	private int ram;
	private String model;

	public MobilePhone(double screenSize, String operatingSystem, 
			String processor, int ram, String model) {
		this.screenSize = screenSize;
		this.operatingSystem = operatingSystem;
		
		
	}
	
	public void call() {
		System.out.println("Calling");
	}
	
	public void sleep() {
		System.out.println("Sleeping");
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		operatingSystem = operatingSystem;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	
}
