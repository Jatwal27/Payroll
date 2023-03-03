public class Hourly extends Employee{

    public int hoursWorked;
    public double hourRate;
    public Hourly (String empName, String empAddress, String empPhone, String empSSN, double empHourly){
        super (empName, empAddress, empPhone, empSSN);
        this.hourRate = empHourly;
    }
    public void setMonthlyHours (int hours){
        this.hoursWorked = hours;
    }
    public double pay(){
        double payment = this.hoursWorked*this.hourRate;
        return payment;
    }
}
