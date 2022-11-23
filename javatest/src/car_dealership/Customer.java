package car_dealership;

public class Customer {
	private String name;
	private String address;
	private double cashOnHand;
	private long contactNumb;
	
	
	
	public Customer(String name, String address, double cashOnHand, long contactNumb) {
	
		this.name = name;
		this.address = address;
		this.cashOnHand = cashOnHand;
		this.contactNumb = contactNumb;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		address+= "delearship city";
		this.address = address;
	}


	public double getCashOnHand() {
		return cashOnHand;
	}


	public void setCashOnHand(double cashOnHand) {
		cashOnHand +=5000;
		this.cashOnHand = cashOnHand;
	}


	public long getContactNumb() {
		return contactNumb;
	}


	public void setContactNumb(long contactNumb) {
		this.contactNumb = contactNumb;
	}


	public void purchageCar(Vehicle vehicle , Employee emp , boolean finance) {
		emp.handleCustomer(this, finance, vehicle);
	}

}
