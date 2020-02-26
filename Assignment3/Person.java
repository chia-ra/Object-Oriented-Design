
public class Person {
	
	private String firstName;
	private String lastName;
	private int SSN;
	private int age;
	private String accomodation; //set to no for default 
	private int IDnum; //customer num OR employee ID;? 
	private Address a;
	private String eduLvl; 

	
	public Person() {
		firstName = "";
		lastName = "";
	}
	public Person(String f, String l) {
		firstName = f;
		lastName = l;
	}
	public Person(String f, String l, Address a) {
		firstName = f;
		lastName = l;
		this.a = a;
	}

	
	public String toString() {
		return firstName + " " + lastName + "; Age " + age + "; ID: " + IDnum+ "; " + this.getAccomodation() 
		+ " accomodations\n" + "Education: " + eduLvl + "\n" + a.toString();
	}
	public void introduce() {
		System.out.println(this.toString());
	}
	
	//getters/setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String name) {
		this.firstName = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String name) {
		this.lastName = name;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int n) {
		this.SSN = n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		this.age = a;
	}
	public int getID() {
		return IDnum;
	}
	public void setID(int i) {
		this.IDnum = i;
	}
	public String getAccomodation() {
		if (accomodation == null) {return "no";}
		return accomodation;
	}
	public void setAccomodation(String a) {
		this.accomodation = a;
	}
	public String getEduLvl() {
		return eduLvl;
	}
	public void setEduLvl(String edu) {
		this.eduLvl = edu;
	}

}

class Address {
	//"The address should not be a simple String object. It should be a separate class 
	//with individual fields defined for street number, street name, city name, zip code, 
	//and state. For this exercise, we will assume that no person has an apartment number 
	//or a second address line. "
	private String street;
	private String city;
	private int streetNum;
	private int zip;
	private String state;
	
	public Address() {}
	//constructor/s?
	public Address(String s, String c, String st, int sn, int zip) {
		street = s;
		city = c;
		streetNum = sn;
		state = st;
		this.zip = zip;
	}
	
	public String toString() {
		return (this.getStreetNum() + " " + this.getStreet() + ", " + this.getCity() + " " + this.getState() + " " + this.getZip());
		//returns the address
	}
	
	//getters/setters
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getStreetNum() {
		return streetNum;
	}
	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}

