package ArrayListPrac;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<>();//very recommended with interface type reference

        a1.add(70);
        a1.add(23);
        System.out.println(a1);
        List<Integer> a2 = new ArrayList<>(a1);
        System.out.println(a2);
        System.out.println(a2.contains(23));//checks if contains element
        System.out.println(a2.indexOf(23));//index of element in the arraylist
        Collections.sort(a2);//////Sort method is of void return type
        System.out.println(a2);

        for (int ele : a2) System.out.println(ele);//retriving elements using for loop from ArrayList

        Iterator<Integer> i1 = a2.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
        ListIterator<Integer> a11 = a2.listIterator();
        while (a11.hasPrevious()) {
            System.out.println(a11.previous());
        }
        Student s1 = new Student(11, "ram");
        Student s2 = new Student(12, "Shyam");
        ArrayList<Student> obj = new ArrayList<>();
        obj.add(s1);
        obj.add(s2);
        for (Student s : obj) {
            System.out.println(s);
        }

    }
}


class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}



class DynamicArrayTest{
    public ArrayList<Integer> dynamicArray(){
        ArrayList<Integer> a1= new ArrayList<Integer>();
        Scanner sc =new Scanner(System.in);
        int val = sc.nextInt();
        while(val != -99){
            a1.add(val);
            val = sc.nextInt();

        }
        return a1;
    }
    public static void main(String[] args) {
        DynamicArrayTest t1 = new DynamicArrayTest();
        //ArrayList<Integer> a1 = t1.dynamicArray();
        //System.out.println(a1);
        ArrayList<String> str = new ArrayList<>();
        str.add("wer");
        str.add("sdf");
        Collections.sort(str);
        System.out.println(str);
    }
}

