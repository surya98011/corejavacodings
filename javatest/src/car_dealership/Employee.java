package car_dealership;

public class Employee {
	
	
	public void handleCustomer(Customer cust,boolean finance, Vehicle v) {
		if(finance==true) {
			double loanAmount = v.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust,loanAmount);
		}
		else if (v.getPrice()<=cust.getCashOnHand()) {
			// customer pay in cash
			processTransaction(cust,v);
		}
		else {
			System.out.println("customer will need more money to buy the car "+v);
		}
	}

	private void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("ran the credit history");
		System.out.println("customer has been approved the car purchase");
		
	}
	public void processTransaction(Customer cust, Vehicle v) {
		System.out.println("customer has purchaged the car "+v +" for the price"+v.getPrice());
	}

}
