public class Main {
    public static void main(String[] args) {
        FullTime sara = new FullTime("Sara", "22222222", "33333333", "19123812", 20000);
        FullTime jessica = new FullTime("jessica", "22222222", "33333333", "19123812", 20000);
        Hourly carl = new Hourly("carl", "12312312", "1312512", "1231254125", 15);
        Hourly john = new Hourly("john", "12312312", "1312512", "1231254125", 15);

        carl.setMonthlyHours(160);
        john.setMonthlyHours(160);
        double totalPayroll = sara.pay()+jessica.pay()+ carl.pay()+john.pay();
        System.out.println(totalPayroll);
    }
}
