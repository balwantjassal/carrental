package carbooking;
import java.util.Scanner;
import java.util.Date;
public class CarrideFirm {
	public static void main(String[] args) {
		Vehicle car = new Vehicle(2011, "Toyota", 1200188899, "INNOVA SUV" );
		Vehicle truck = new Vehicle(2011, "TATA Motors", 9912827, "Tipper" );
		Customer cust1 = new Customer("Rohan Murti", "9865600000");
		Customer cust2 = new Customer("Shyam Sehgal", "7888988889");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 to add booking and 0 to cancel booking");
		int option = input.nextInt();
		input.close();
		switch(option) {
		case 0:
				System.out.println("You cancelled booking option..");
		case 1:
				Booking book1 = new Booking(car, new Date(), cust1);
				Booking book2 = new Booking(truck, new Date(), cust2);
				System.out.println("*****************Car Ride Firm Booking Details Starts**************************");
				book1.bookingDetails();
				
				book2.bookingDetails();
				System.out.println("*****************Booking Details Ride Firm Ends**************************");
				break;
		default:
				System.out.println("Invalid Entry");
		
		}
	}
}
