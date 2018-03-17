package carbooking;
import java.util.Date;
public class Booking {
	Vehicle vehicle;
	Date bookingDate;
	int booking_id;
	Customer cust;
	static int count;
	
	public Booking(Vehicle v1, Date d1, Customer lvcust) {
		this.vehicle = v1;
		this.bookingDate = d1;
		booking_id = ++count;
		this.cust = lvcust;
	}
	public void bookingDetails() {
		System.out.println("Booking ID: " + booking_id);
		System.out.println(vehicle.variant + " Of " + vehicle.manufacturer + " Has been booked by Customer "+ cust.name 
				+ " for the date " + bookingDate);
	}
}
