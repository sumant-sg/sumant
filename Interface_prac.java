import java.util.*;
class Sbi implements interface2 {

    public void m1() {
        System.out.println("inside class SBI");
    }
}
class hdfc implements interface2{
    public void m1(){
        System.out.println("inside class Hdfc");
    }

}

public class Interface_prac{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        interface2 i1 = Factory.getObject(name);
        i1.m1();

    }
}


class Factory{
    public static interface2 getObject(String name){
        if(name.equals("hdfc")) return new hdfc();
        else return new Sbi();
    }
}
interface interface2{
    int a = 6 ;
    public void m1();

}
