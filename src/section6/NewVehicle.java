package section6;

public class NewVehicle {

	public static void main(String[] args) {
		Sirius one = new Sirius("red", 65, 4.2);
		one.accelerate(50);
		System.out.println(one.getNumberofWheels());
		System.out.println(one.getBrand());
		
	}
}
