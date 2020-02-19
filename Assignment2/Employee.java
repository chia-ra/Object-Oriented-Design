
public class Employee extends Person {

	private int ID;
	private String status;
	private String startDate;
	private double salary;
	
	
	Employee(String first, String last) {
		super(first, last);
	}

	//getters, setters
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void introduce() {
		super.introduce();
		System.out.println("Employee ID: " + ID + " Employee Status: " + status);
		System.out.println("Start Date: " + startDate);
	}
	
	public double calculatePay(double time) {
		if (this.status.equals("full time")) {
			return (time/52)*salary;
		}
		else {
			return (time*salary);
		}
	}
	
}
