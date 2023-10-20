package ArrayListPrac;

import java.util.*;
import java.util.LinkedList;


public class LinkedList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("jawuwh");
        l1.add("ksksk");
        l1.add(1,"wer");
        ListIterator<String> li = l1.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }




    }
}

class Student1 implements Comparable<Student1> {
    int id;
    String name;
    int mark;
    public Student1(int id, String name, int mark){
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student1 arg) {
        return arg.mark-this.mark;
    }
    public  String toString(){
        return this.id + "\t" + this.name +"\t" + this.mark;
    }

}
class StudentSort{
    public static void main(String[] args) {
        ArrayList<Student1>  a = new ArrayList<>();
        Student1 s1 = new Student1(1,"www", 34);
        Student1 s2 = new Student1(3,"ew", 14);
        Student1 s3 = new Student1(2,"aww", 24);

        a.add(s1);
        a.add(s2);
        a.add(s3);
        for(Student1 stu : a){
            System.out.println(stu);
        }
        Collections.sort(a);
        for(Student1 stu : a){
            System.out.println(stu);
        }
    }
}
