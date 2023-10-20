import java.util.Scanner;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //Sum of digit of a given number
        char ch = 'A';
        int a = ch;
        System.out.println();
    }
}
interface Animal {
    public void m1();
    }
class Abc implements Animal{
    public void m1(){
        System.out.println("inside Abc class");
    }

    public static void main(String[] args) {
        Animal a1 = new Abc();
        Abc a11 = (Abc) a1;
        a1.m1();
    }
}

class MethodExecution{
    public MethodExecution(){
        System.out.println("inside constructor");
    }
    {
        System.out.println("inside instance");
    }
    static{
        System.out.println("inside static");
    }

    public static void main(String[] args) {
        System.out.println("print from static main");
    }
}

class PatternPrint{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int l1 = 0;
        //Decimal to binary
        if(n1 == 1) System.out.println("binary form is: " + 01);

        else {
            while(n1 >= 1){
                int rem = n1 % 2;
                int divi = n1 /2;
                n1 = n1 / 2;
                l1 = l1 * 10 + rem;


            }
        }
        System.out.println(1/2);
        System.out.println(Integer.reverse(l1));

    }
}


