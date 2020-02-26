
public class FullTimeHourlyEmployee extends Employee {

	private double payment;
	public FullTimeHourlyEmployee() {
		super();
	}
	public FullTimeHourlyEmployee(String f, String l) {
		super(f, l);
	}
	public FullTimeHourlyEmployee(String f, String l, Address a) {
		super(f, l, a);
	}

	public String toString() {
		return "Full Time Hourly Employee \n" + super.toString();
	}
	public double computePay(double hours) {
		if (hours<=40) { // counting 40 hours as the cutoff for overtime
			payment = hours*this.getPay();
		}
		else 
			payment = 40*this.getPay() + (hours%40)*(this.getPay()*1.5); 
		//overpay wages are 1.5x normal wage prices and apply to any hours past 40
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
