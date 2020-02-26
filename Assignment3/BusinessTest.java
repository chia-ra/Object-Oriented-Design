
public class BusinessTest {

	public static void main(String[] args) {

		//note: the "flag" to toggle whether to show ssn/payment information for each person is
		//the boolean in the introduce method- true will print both ssn and payment info, false 
		//will print just the ssn, and no input parameters will print neither one

		Address a1 = new Address("Green Ln.", "Campbell", "CA", 3423, 95008);
		Executive ex1 = new Executive("Bob", "Smith", a1);
		ex1.setPay(85000); 
		ex1.setYearlyBonus(6000); 
		ex1.setAge(46);
		ex1.setID(235119);  
		ex1.setSSN(936837234);
		ex1.setAccomodation("no");
		ex1.setDirectDeposit(true); 
		ex1.setEduLvl("Master's in Management");
		ex1.introduce(); //no parameters = show neither ssn or payment info
		System.out.println();

		Address a2 = new Address("Berry St.", "San Jose", "CA", 1134, 95120);
		Executive ex2 = new Executive("Mary", "Jones", a2);
		ex2.setPay(105000); 
		ex2.setYearlyBonus(7500); 
		ex2.setAge(54);
		ex2.setID(834510); //6 digit 
		ex2.setSSN(683429849);
		ex2.setAccomodation("wheelchair");
		ex2.setDirectDeposit(true); 
		ex2.setEduLvl("Master's in Business");
		ex2.introduce(true); //true parameter = show both ssn and payment info
		System.out.println();

		Address a3 = new Address("Peninsula Ave.", "Santa Cruz", "CA", 674, 95062);
		FullTimeSalaryEmployee fts1 = new FullTimeSalaryEmployee("Tyson", "Morey", a3);
		fts1.setPay(69700); 
		fts1.setAge(30);
		fts1.computePay(25); //25 weeks
		fts1.setID(968645); //6 digit 
		fts1.setSSN(928395039);
		fts1.setAccomodation("no");
		fts1.setDirectDeposit(false); 
		fts1.setEduLvl("Bachelor's in Mechanical Engineering");
		fts1.introduce(false); //false parameter = show ssn only
		System.out.println();

		Address a4 = new Address("Tiger St.", "Fremont", "CA", 980, 94536);
		FullTimeSalaryEmployee fts2 = new FullTimeSalaryEmployee("Mary", "Jones", a4);
		fts2.setPay(65900); 
		fts2.computePay(12);  //12 weeks
		fts2.setAge(27);
		fts2.setID(230985); 
		fts2.setSSN(679284765);
		fts2.setAccomodation("no");
		fts2.setDirectDeposit(true); 
		fts2.setEduLvl("Bachelor's in Computer Hardware");
		fts2.introduce(true);
		System.out.println();

		Address a5 = new Address("Plymouth Pl.", "Oakland", "CA", 12, 94615);
		Contractor con = new Contractor("Julie", "Wells", a5);
		con.setPay(35); //hourly wage
		con.computePay(67);  //67 hours
		con.setAge(32);
		con.setID(909876); 
		con.setSSN(456345234);
		con.setAccomodation("no");
		con.setDirectDeposit(true); 
		con.setEduLvl("Trade School");
		con.introduce();
		System.out.println();

		Address a6 = new Address("Fairoaks Ct.", "Saratoga", "CA", 980, 95012);
		Contractor con2 = new Contractor("Walter", "Freeman", a6);
		con2.setPay(38); 
		con2.computePay(45);  //45 hours
		con2.setAge(24);
		con2.setID(343987); 
		con2.setSSN(235465487);
		con2.setAccomodation("no");
		con2.setDirectDeposit(false); 
		con2.setEduLvl("Associate's Degree");
		con2.introduce(false);
		System.out.println();

		Address a7 = new Address("Redwood Rd", "Sunnyvale", "CA", 562, 95673);
		FullTimeHourlyEmployee fth = new FullTimeHourlyEmployee("Geillis", "Welch", a7);
		fth.setPay(50); 
		fth.computePay(49);  //49 hours (9 of which are overtime)
		fth.setAge(37);
		fth.setID(776934); 
		fth.setSSN(254309890);
		fth.setAccomodation("wheelchair");
		fth.setDirectDeposit(false); 
		fth.setEduLvl("Bachelor's in Software");
		fth.introduce(true);
		System.out.println();

		Address a8 = new Address("Maple St.", "Pleasanton", "CA", 88, 94566);
		FullTimeHourlyEmployee fth2 = new FullTimeHourlyEmployee("Mary", "Jones", a8);
		fth2.setPay(48); 
		fth2.computePay(52);  //52 hours (12 of which are overtime)
		fth2.setAge(49);
		fth2.setID(454387); 
		fth2.setSSN(679284765);
		fth2.setAccomodation("no");
		fth2.setDirectDeposit(true); 
		fth2.setEduLvl("Bachelor's in Computer Science");
		fth2.introduce();
		System.out.println();

		Address a9 = new Address("Lyphen Ln.", "San Jose", "CA", 117, 95058);
		PartTimeHourlyEmployee pth = new PartTimeHourlyEmployee("Lois", "Lane", a9);
		pth.setPay(45); 
		pth.computePay(23);  //23 hours
		pth.setAge(49);
		pth.setID(546778); 
		pth.setSSN(229098937);
		pth.setAccomodation("no");
		pth.setDirectDeposit(true); 
		pth.setEduLvl("Bachelor's in Marketing");
		pth.introduce(false);
		System.out.println();

		Address a10 = new Address("Hochi Blvd.", "Santa Clara", "CA", 2345, 95121);
		PartTimeHourlyEmployee pth2 = new PartTimeHourlyEmployee("Teresa", "Mottleby", a10);
		pth2.setPay(45); 
		pth2.computePay(52);  //35 hours
		pth2.setAge(29);
		pth2.setID(233389); 
		pth2.setSSN(992758474);
		pth2.setAccomodation("no");
		pth2.setDirectDeposit(true); 
		pth2.setEduLvl("Bachelor's in Sales");
		pth2.introduce(true);
		System.out.println();

		Address a11 = new Address("Starfield St.", "San Jose", "CA", 556, 95012);
		Customer cust = new Customer("Teresa", "Mottleby", a11);
		cust.setPayPref("Credit Card");
		cust.setAge(29);
		cust.setID(233389); 
		cust.setSSN(992758474);
		cust.setAccomodation("no");
		cust.setEduLvl("Bachelor's in Sales");
		cust.introduce(true);
		cust.makePayment();
		System.out.println();
		
		Address a12 = new Address("Blue Ave.", "Mountain View", "CA", 702, 95045);
		Customer cust2 = new Customer("Pranav", "Rao", a12);
		cust2.setPayPref("Debit Card");
		cust2.setAge(47);
		cust2.setID(885673); 
		cust2.setSSN(456765432);
		cust2.setAccomodation("no");
		cust2.setEduLvl("Bachelor's in Marketing");
		cust2.introduce(false);
		cust2.makePayment();
		System.out.println();


	}

}
