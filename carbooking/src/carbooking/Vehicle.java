package carbooking;

public class Vehicle {
	int modelYear;
	String manufacturer;
	private long  engineCode;
	String variant;
	public Vehicle(int modelYear, String manufacturer, long engineCode, String variant) {
		this.modelYear =  modelYear;
		this.manufacturer = manufacturer;
		this.engineCode = engineCode;
		this.variant = variant;
	}
	public void vehicleDetails() {
		System.out.println("Model Year: " + modelYear);
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("engineCode :" + engineCode);
		System.out.println("Variant :" + variant);
	}

}
