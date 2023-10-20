import java.util.Scanner;

public class InnerClass {
}
class Account{
    private double balance;
    public Account(double balance){
        this.balance = balance;
    }
    public void pinValidate(int pin){
        if(pin == 1234){
            InterestRate obj1 = new InterestRate(3.4);
            obj1.intersetCalculate();
        }
        else System.out.println("Please enter the correct pin");

    }
    private class InterestRate{
        double interest;
        public InterestRate(double interest){
            this.interest = interest;
        }
        public void intersetCalculate(){
            interest = balance * interest / 100;
            balance += interest;
            System.out.println("Total balance: " + balance);
        }
    }
}
class operate{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balanceamt = input.nextInt();
        Account obj1 = new Account(balanceamt);

        int pin = input.nextInt();
        obj1.pinValidate(pin);
    }
}
class justtest {
    public static void main(String[] args) {
        int[] n1 = new int[0];
        char[] ch = new char[20];
        boolean[] n2 = new boolean[-200];
//        double[] n3 = new double[2241423798];
//        char[] ch = new char[20];
//    }
    }
}