public class StreamAndLambda {
}
interface Add{
    public int Add(int a, int b);

    }

class implement{
    public static int Add1(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Add a1 = implement::Add1;
        int r = a1.Add(3,4);
        System.out.println(r);
    }
}

interface hi{
    public void greet();
    public static int add1(int a, int b){
        
        return 0;
    }
    private void m1(){
        System.out.println("private method in m1");
    }
}
class Namaste{
    public static void main(String[] args) {
        hi obj1 = ()->{
            System.out.println("Hello Namaste");
        };
        obj1.greet();
        hi obj2 = () -> {
            System.out.println("Hi namaste");
        };
        obj2.greet();
    }
}
