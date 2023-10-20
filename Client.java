//CONSTRUCTOR OVERLOADING AND CONSTRUCTOR CHAINING

public class Client {
    int id;
    String name;
    String project_name;
    public Client(){
        this.project_name = "JAVA";
    }

    public Client(int id, String name){
        this();
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", project_name='" + project_name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Client client1 = new Client(1,"Amazon");
        Client client2 = new Client(2,"Flipkart");
        System.out.println(client1);
        System.out.println(client2);
    }


}
