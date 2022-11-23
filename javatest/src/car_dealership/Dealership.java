package car_dealership;

public class Dealership {
	
	public static void main(String[]args) {
		Customer cust1 = new Customer("surya","village jigani",50000,82360293);
//		cust1.setName("surya");
//		cust1.setAddress("123456 village jigani");
//		cust1.setContactNumb(123456789);
//		cust1.setCashOnHand(1000000);
		
		Vehicle v1 = new Vehicle("BMW","M4",80000);
//		v1.setMake("Maruti");
//		v1.setModel("swift desire");
//		v1.setPrice(500000);
		Employee emp = new Employee();
		
		cust1.purchageCar(v1, emp, false);
		
	}

}
