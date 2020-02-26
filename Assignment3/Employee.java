
public class Employee extends Person {

	private boolean directDeposit;
	private double pay;
	
	public Employee() {
		super();
	}
	public Employee(String f, String l) {
		super(f, l);
	}
	public Employee(String f, String l, Address a) {
		super(f, l, a);
	}
	
	//getter, setter

	public String getDirectDeposit() {
		if (directDeposit == true) {return "Direct Deposit";} 
		else {return "no Direct Deposit";}
	}
	public void setDirectDeposit(boolean dd) {
		this.directDeposit = dd;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}

	
}
