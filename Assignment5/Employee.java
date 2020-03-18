public class Employee {

    //variables
    private String firstName;
    private String lastName;
    private int employeeID;
    private double hourlyPay;

    //constructors
    Employee() {
        this.firstName = "";
        this.lastName = "";
    }
    Employee(String firstName, String lastName, int employeeID, double hourlyPay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.hourlyPay = hourlyPay;
    }

    public double computePay(int hours) {
        try {
            double result = hours*hourlyPay;
            if (hours < 0) { throw new NumberFormatException(); }
            else if (hours > 40) { throw new TooManyHoursWorkedException(); }
            else {
                return result;
            }
        } catch (TooManyHoursWorkedException e) {
            System.out.print("TooManyHoursWorkedException: maximum hours is 40.  -- ");
        } catch (NumberFormatException e) {
            System.out.print("NumberFormatException: hours must be >= 0.  -- ");
        }
        return 0;
    }

    //getters, setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
}

//toomanyhours class for computePay method
class TooManyHoursWorkedException extends Exception {
    TooManyHoursWorkedException() {super();}
}
