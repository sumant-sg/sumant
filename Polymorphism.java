public class Polymorphism {
    public static void main(String[] args) {
        B a1 = new C();
        a1.m3();


    }
}
class A {


        public void m3(){

            System.out.println("inside A-class");
        }
}
class B extends A{
    public void m3(){
        System.out.println("inside class-B");
    }

}
class C extends B{
    public void m3(){
        System.out.println("inside C");
    }

}
