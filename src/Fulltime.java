public class FullTime extends Employee{
    public double basicSalary;

    public FullTime(String empName,String empSSN,String empAddress,String empPhone, double empBasicSalary){
        super (empName, empAddress, empPhone, empSSN);
        basicSalary = empBasicSalary;
    }
    public double pay(){
        return this.basicSalary;
    }
}
