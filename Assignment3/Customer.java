
public class Customer extends Person {
	private String payPref; //payment method preference > cash/card?
	
	public Customer() {
		super();
	}
	public Customer(String f, String l) {
		super(f, l);
	}
	public Customer(String f, String l, Address a) {
		super(f, l, a);
	}
	
	public String toString() {
		return "Customer \n" + super.toString();
	}

	public void introduce(boolean show) { //presence of a parameter(boolean) indicate to show the ssn
		super.introduce(); 
		System.out.println("SSN: " + this.getSSN());
	}
	public void makePayment() {
		System.out.println("Preferred Payment Method: " + payPref);
	}
	//getter/setter
	public String getPayPref() {
		return payPref;
	}
	public void setPayPref(String p) {
		this.payPref = p;
	}

}
