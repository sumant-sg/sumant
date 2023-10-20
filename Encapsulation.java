public class Encapsulation {
    private int a1;

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getA1() {
        return a1;
    }

    public static void main(String[] args) {
        Encapsulation e1 = new Encapsulation();
        System.out.println(e1.a1);
        e1.setA1(23);
        System.out.println(e1.a1);

    }
}
