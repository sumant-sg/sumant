
public class Student {
    String sname;
    int sroll;
    int sid;

    public Student(int sroll, String sname, int sid){
        this.sroll = sroll;
        this.sname = sname;
        this.sid = sid;
    }
    public Student(int roll, String sname){
        this.sroll = roll;
        if(sname == "") System.out.println("its an empty srting");
        else this.sname = sname;
    }

    public void setSname(String sname) {
        if(sname == "") System.out.println("its an empty srting");
        else this.sname = sname;
    }

    public void setSroll(int sroll) {
        this.sroll = sroll;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public int getSroll() {
        return sroll;
    }

    public int getSid() {
        return sid;
    }

    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
    }
}
