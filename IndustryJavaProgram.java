
class Product1{
    int pid;
    String product_name;
    String companyName;
    public Product1(){
        this.companyName = "Amazon";
    }
    public Product1(int pid, String product_name){
        this();
        this.pid = pid;
        this.product_name = product_name;
    }

    @Override
    public String toString() {
        return "product1{" +
                "pid=" + pid +
                ", product_name='" + product_name + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
class Product2{
    int pid;
    String product_name;
    String companyName;
    public Product2(){
        this.companyName = "Samsung";
    }
    public Product2(int pid, String product_name){
        this();
        this.pid = pid;
        this.product_name = product_name;
    }

    @Override
    public String toString() {
        return "product2{" +
                "pid=" + pid +
                ", product_name='" + product_name + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
public class IndustryJavaProgram {
    public static void main(String[] args) {
        Product1 p1 = new Product1(111, "Charger");
        Product2 p2 = new Product2(222,"Adapter");
        System.out.println(p1);
        System.out.println(p2);


    }
}
