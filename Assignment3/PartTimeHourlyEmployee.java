
public class PartTimeHourlyEmployee extends Employee {
	
	private double payment;
	public PartTimeHourlyEmployee() {
		super();
	}
	public PartTimeHourlyEmployee(String f, String l) {
		super(f, l);
	}
	public PartTimeHourlyEmployee(String f, String l, Address a) {
		super(f, l, a);
	}
	
	public String toString() {
		return "Part Time Hourly Employee \n" + super.toString();
	}
	public void introduce() {
		System.out.println(this.toString());

	}
	public double computePay(double hours) {
		if (hours>40) {return -1;} //part time workers can work up to 40hrs only
		payment = this.getPay()*hours;
		return payment; //getPay returns their hourly wages
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
