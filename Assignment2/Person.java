
public class Person {


	private String firstName;
	private String lastName;
	private int age;
	private int SSN;
	private String address;
	private String gender;
	private double weight;

	Person(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}
	
	//getters, setters
	public void setFirstName(String first) {
		firstName = first;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String last) {
		lastName = last;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	
	public void setSSN(int ssn) {
		SSN = ssn;
	}
	public int getSSN() {
		return SSN;
	}
	
	public void setAddress(String addr) {
		address = addr;
	}
	public String getAddress() {
		return address;
	}
	
	public void setGender(String gen) {
		gender = gen;
	}
	public String getGender() {
		return gender;
	}
	
	public void setWeight(double w) {
		weight = w;
	}
	public double getWeight() {
		return weight;
	}
	
	//overloaded toString method
	public String toString() {
		return firstName + " " + lastName;
	}
	
	public void introduce() {
		System.out.println(this.toString());
		System.out.println("Age: " + age + " Gender: " + gender + " Weight: " + weight);
		System.out.println("SSN: " + SSN + " Address: " + address);
	}
	
	
}
