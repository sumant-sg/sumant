
package FirstPackage;
import Package2.Hello;

public class AccessModifier extends Hello  {
    public static void main(String[] args) {

        Hello h = new Hello();

        Hello h1 = new Hello();

        //System.out.println(h1.a1);
        AccessModifier a11 = new AccessModifier();
        System.out.println(a11.a1);
    }
}

