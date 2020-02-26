
public class Executive extends Employee {
	
	private double yearlyBonus;
	
	public Executive() {
		super();
	}
	public Executive(String f, String l) {
		super(f, l);
	}
	public Executive(String f, String l, Address a) {
		super(f, l, a);
	}
	

	public String toString() {
		return "Executive \n" + super.toString();
	}

	public double computePay() {
		return this.getPay() + yearlyBonus;
	}
	
	public void introduce(boolean show) {
		if (show == true) { //flags that ssn and payment info will be displayed
			super.introduce();
			System.out.println("SSN: " + this.getSSN() + " Payment: $" + this.computePay() + ", " + this.getDirectDeposit());
		}
		else { //flags that only ssn will be displayed
			super.introduce();
			System.out.println("SSN: " + this.getSSN());
		}
	}
	public double getYearlyBonus() {
		return yearlyBonus;
	}
	public void setYearlyBonus(double yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}

	
	
}
