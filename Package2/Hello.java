package Package2;
import FirstPackage.AccessModifier;

public class Hello {
    protected int a1;
    private int a;
    private String str = "hello";

    public Hello(){
        a1 = 12;
        a =90;
    }
    public  Hello(int a11, int a){
        this.a1 = a11;
        this.a = a;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "a1=" + a1 +
                ", a=" + a +
                ", str='" + str + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Hello h1 = new Hello();
        System.out.println(h1.toString());
        Hello h2 = new Hello(12,13);
        System.out.println(h2.toString());

    }
}
