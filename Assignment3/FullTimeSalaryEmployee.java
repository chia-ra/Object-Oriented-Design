
public class FullTimeSalaryEmployee extends Employee {
	
	private double payment;
	public FullTimeSalaryEmployee() {
		super();
	}
	public FullTimeSalaryEmployee(String f, String l) {
		super(f, l);
	}
	public FullTimeSalaryEmployee(String f, String l, Address a) {
		super(f, l, a);
	}
	
	public String toString() {
		return "Full Time Salary Employee \n" + super.toString();
	}

	public double computePay(double weeks) {
		payment = (weeks/52)*this.getPay();
		return payment;
		//in which case this.getPay would be their annual salary
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
