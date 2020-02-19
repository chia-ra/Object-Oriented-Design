
public class EmployeeTest {

	public static void main(String[] args) {

		String fName1 = "Joe";
		String lName1 = "Smith";		
		Employee e1 = new Employee(fName1, lName1);
		e1.setAddress("123 Rainbow Dr.");
		e1.setAge(31);
		e1.setGender("male");
		e1.setID(38409);
		e1.setSSN(687236498);
		e1.setSalary(60);
		e1.setStartDate("01/30/09");
		e1.setStatus("contractor");
		e1.setWeight(200.3);
	
		String fName2 = "Lisa";
		String lName2 = "Gray";		
		Employee e2 = new Employee(fName2, lName2);
		e2.setAddress("456 Red Ave.");
		e2.setAge(50);
		e2.setGender("female");
		e2.setID(82371);
		e2.setSSN(901943589);
		e2.setSalary(110000);
		e2.setStartDate("10/13/14");
		e2.setStatus("full time");
		e2.setWeight(130.8);
		
		String fName3 = "Timothy";
		String lName3 = "Briggs";		
		Employee e3 = new Employee(fName3, lName3);
		e3.setAddress("789 Yellow Blvd.");
		e3.setAge(25);
		e3.setGender("male");
		e3.setID(59003);
		e3.setSSN(397890341);
		e3.setSalary(80000);
		e3.setStartDate("04/09/19");
		e3.setStatus("full time");
		e3.setWeight(133.0);
		
		String fName4 = "George";
		String lName4 = "Wallace";		
		Employee e4 = new Employee(fName4, lName4);
		e4.setAddress("909 Green St.");
		e4.setAge(43);
		e4.setGender("male");
		e4.setID(94562);
		e4.setSSN(589473678);
		e4.setSalary(20);
		e4.setStartDate("09/27/17");
		e4.setStatus("part time");
		e4.setWeight(145.2);
		
		String fName5 = "Amy";
		String lName5 = "Student";		
		Employee e5 = new Employee(fName5, lName5);
		e5.setAddress("876 Blue Pl.");
		e5.setAge(29);
		e5.setGender("female");
		e5.setID(90248);
		e5.setSSN(230958367);
		e5.setSalary(45);
		e5.setStartDate("07/11/18");
		e5.setStatus("contractor");
		e5.setWeight(139.4);
		
		
		e1.introduce();
		System.out.println("Pay: " + e1.calculatePay(30));
		System.out.println();
		e2.introduce();
		System.out.println("Pay: " + e2.calculatePay(2));
		System.out.println();
		e3.introduce();
		System.out.println("Pay: " + e3.calculatePay(4));
		System.out.println();
		e4.introduce();
		System.out.println("Pay: " + e4.calculatePay(25));
		System.out.println();
		e5.introduce();
		System.out.println("Pay: " + e5.calculatePay(45));
	}

}
