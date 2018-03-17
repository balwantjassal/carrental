package carbooking;

public class Customer {
	String name;
	String mobile;
	static int customer_id;
	public Customer(String lname, String lmobile) {
		this.name = lname;
		this.mobile = lmobile;
		++customer_id;
	}
}
