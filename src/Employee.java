abstract public class Employee {

    protected String SSN;
    protected String Name;
    protected String Address;
    protected String Phone;

    public Employee(String empName,String empSSN,String empAddress,String empPhone){
        Name = empName;
        SSN = empSSN;
        Address = empAddress;
        Phone = empPhone;
    }

    public abstract double pay();
}
