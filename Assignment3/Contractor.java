
public class Contractor extends Employee {
	
	private double payment;
	public Contractor() {
		super();
	}
	public Contractor(String f, String l) {
		super(f, l);
	}
	public Contractor(String f, String l, Address a) {
		super(f, l, a);
	}
	
	public String toString() {
		return "Contractor \n" + super.toString();
	}

	public double computePay(double hours) {
		payment  = hours*this.getPay();
		return payment;
	}
	public double getPayment() {
		return payment;
	}
	
	public void introduce(boolean show) {
		if (show == true) { //flags that ssn and payment info will be displayed
			super.introduce();
			System.out.println("SSN: " + this.getSSN() + " Payment: $" + this.getPayment() + ", " + this.getDirectDeposit());
		}
		else { //flags that only ssn will be displayed
			super.introduce();
			System.out.println("SSN: " + this.getSSN());
		}
	}
}
