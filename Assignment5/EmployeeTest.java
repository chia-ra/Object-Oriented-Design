public class EmployeeTest {
    public static void main(String[] args) {
        //create instance of employee
        Employee e1 = new Employee();
        e1.setFirstName("John");
        e1.setLastName("Smith");
        e1.setEmployeeID(101);
        e1.setHourlyPay(35);

        //compute pay for given hours
        System.out.println(e1.computePay(40));
        System.out.println(e1.computePay(23));
        System.out.println(e1.computePay(1));
        System.out.println(e1.computePay(0));
        System.out.println(e1.computePay(-5));
        System.out.println(e1.computePay(45));

    }
}
