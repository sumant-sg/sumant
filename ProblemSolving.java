import java.sql.SQLOutput;
import java.util.*;
public class ProblemSolving extends AbstractClass{
    public void m1() {
        System.out.println("over riding method ");

    }
    public static void main(String[] args) {
        //Abstract class
        //1) abstract keyword, abstract and non-abstract methods
        //2) can have static methods
        //3) can have constructor
        //4) Final methods
        //5) object creation not possible 6) From abstract parent class
        ProblemSolving p1 = new ProblemSolving();
        p1.m1();
        }
    }


abstract class AbstractClass{
    abstract public void m1();
    void m2(){
        System.out.println("inside abstract non-abstract methods");
    }
    public static void m3(){
        System.out.println("static inside Abstract");
    }
    AbstractClass(){
        System.out.println("constructor inside abstract class");
    }
    public final void m4(){
        System.out.println("this is final method inside abstract class");
    }

    public static void main(String[] args) {

    }
}








