public class Main {

    public static void main(String[] args) {

/*        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Calculate();
        creditManager.Save();

        Customer customer = new Customer();//ornegini olusturmak, instance olusturmak, instance creation.
        customer.id=1;


        customer.City="İstanbul";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();

        Company company = new Company();
        company.TaxNumber="10000";
        company.CompanyName="Arçelik";
        company.id=100;

        CustomerManager customerManager1 = new CustomerManager(new Person());

        Person person = new Person();
        person.NationalIdentity="123456";

        Customer c1 = new Customer();
        Customer c2 = new Company();
        Customer c3 = new Person();*/

        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.GiveCredit();
    }
}

class CreditManager{
    public void Calculate(){
        System.out.println("Hesaplandı");
    }
    public void Save(){
        System.out.println("Kredi Verildi");
    }
}

interface ICreditManager{
    void Calculate();
    void Save();

}
abstract class BaseCreditManager implements ICreditManager{
    @Override
    public abstract void Calculate();

    @Override
    public void Save() {
        System.out.println("Kaydedildi");
    }
}
class TeacherCreditManager extends BaseCreditManager  implements ICreditManager{

    @Override
    public void Calculate() {
        System.out.println("Öğretmen Kredisi Hesaplandı.");
    }
}
class MilitaryCreditManager extends BaseCreditManager implements ICreditManager{

    @Override
    public void Calculate() {
        System.out.println("Asker Kredisi Hesaplandı.");
    }
}
class Customer{
    public Customer(){//CONSTRUCTOR demektir. Her new yaptığınızda bir sefer çalışacaktir.
        System.out.println("Müşteri nesnesi başlatıldı.");
    }
    public int id;
    public String City;

}
class Person extends Customer{
    public String FirstName;
    public String LastName;
    public String NationalIdentity;
}
class Company extends Customer{
    public String CompanyName;
    public String TaxNumber;
}
class CustomerManager{
    private Customer _customer;
    private ICreditManager _creditManager;
    public CustomerManager(Customer customer, ICreditManager creditManager){
        _customer=customer;
        _creditManager=creditManager;
    }
    public void Save(){
        System.out.println("Müşteri Kaydedildi: ");
    }
    public void Delete(){
        System.out.println("Müşteri Silindi: ");
    }
    public void GiveCredit(){
        _creditManager.Calculate();
        System.out.println("Kredi Verildi");
    }
}