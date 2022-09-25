public class Main {

    public static void main(String[] args) {

    Customer customer = new Customer();
    Employee employee = new Employee();

    EmployeeManager employeeManager = new EmployeeManager();
    CustomerManager customerManager = new CustomerManager();
    //bunda ekstra bestemployee gozukuyor.
    employeeManager.BestEmployee();
    customerManager.Add();


    }
}