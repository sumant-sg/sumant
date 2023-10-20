import java.util.*;
import java.util.Comparator;
public class MapInterfacePrac {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("ram", 12345.3);
        hm.put("agsg", 242.34);
        //deposit 1000 in ram's account
        double bal = ((Double)hm.get("ram")).doubleValue();
        hm.put("ram", new Double(bal + 1000));
        System.out.println(hm.get("ram"));
        hm.put("harry", 1432.32);
        Set<Map.Entry<String, Double>> set = hm.entrySet();
        System.out.println(set);
        for(Map.Entry<String,Double> me :set){
            System.out.println(me.getKey());
            System.out.println(me.getValue());
            for(int i = 0; i < set.size(); i++){

            }
        }



    }
}

class DynamicHashMap{
    public HashMap<String, String> acceptMap(){
        HashMap<String, String> hm = new HashMap<String, String>();
        System.out.println("Enter values: ");
        Scanner sc =  new Scanner(System.in);
        String s1 = sc.next();
        String s2 =  sc.next();
        while(!s1.equals("end")){
            hm.put(s1,s2);
            s1 = sc.next();
            s2 = sc.next();
        }
        return hm;
    }
    public void display(HashMap<String, String> hm){
        Set<Map.Entry<String, String>> set = hm.entrySet();
        for(Map.Entry<String, String> a : set){
            System.out.println(a.getKey());
            System.out.println(a.getValue());
        }
    }


    public static void main(String[] args){
        DynamicHashMap dhm = new DynamicHashMap();
        HashMap<String, String> x;
        x = dhm.acceptMap();
        dhm.display(x);


    }
}

class LinkeedHaspMap1{
    public static void main(String[] args) {
        LinkedHashMap<String,Double> hs = new LinkedHashMap<String, Double>();
        hs.put("www", 122.22);
        hs.put("fadagf", 1234.21);
        Set<Map.Entry<String, Double>> set = hs.entrySet();
        for(Map.Entry<String, Double> a : set){
            System.out.println(a.getKey());
            System.out.println(a.getValue());
        }
        TreeMap<String, Double> hs1 = new TreeMap<String,Double>();
        hs1.put("ram", 123.21);
        hs1.put("gaga", 1423.11);
        Set<Map.Entry<String, Double>> set1 = hs1.entrySet();
        for(Map.Entry<String, Double> s: set1){
            System.out.println(s.getKey());
            System.out.println(s.getValue());
        }
        TreeMap<String, Double> hs2 = new TreeMap<String,Double>(hs1);
        System.out.println(hs2.tailMap(String.valueOf(123.21)));
        System.out.println(hs2.headMap(String.valueOf(1423.11)));
        System.out.println(hs2.descendingMap());
        System.out.println(hs2.firstEntry());
        System.out.println(hs2.lastEntry());
    }
}





class exam{
    public static void main(String[] args) {
        do{
            System.out.println("ss");
        }while(false);

    }

}
interface i1{
    public void play();
}
class car implements i1{
    public void play(){
        System.out.println("ddd");
    }

    public static void main(String[] args) {

    }
}
class bike implements i1{
    public void play(){
        System.out.println("ssaa");
    }
    public static void main(String[] args) {
        i1 a1 = new car();
        bike b = (bike) a1;
        b.play();

    }
}

class TreeMapComparator implements Comparator<String>{
    public int compare(String a, String b){
        String astr, bstr;
        astr = a; bstr = b;
        return bstr.compareTo(astr);
    }
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>(new TreeMapComparator());
        ts.add("apple");
        ts.add("zebra");
        ts.add("sass");
        for(String str: ts){
            System.out.print(str + " ");
        }

    }
}

class employee{
    private int eid; private String ename;

    public employee(int eid, String ename){
        this.eid = eid;  this.ename = ename;
    }

    @Override
    public String toString() {
        return "employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                '}';
    }

    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }


}
class eidcomp implements Comparator<employee>{

    @Override
    public int compare(employee e1, employee e2) {
        if(e1.getEid() > e2.getEid()) return 1;
        else if(e1.getEid() < e2.getEid()) return -1;
        else return 0;
    }


}
class driver{
    public static void main(String[] args) {
        TreeSet<employee> set1 = new TreeSet<employee>(new eidcomp());
        set1.add(new employee(123, "ram"));
        set1.add(new employee(154, "hary"));
        set1.add(new employee(194, "ahary"));
        for(employee e :set1){
            System.out.println(e.toString());
        }
        System.out.println(set1);
    }

}

class faculty{
    private int id;
    private String name;

    @Override
    public String toString() {
        return "faculty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
class idcomp implements Comparator<faculty>{
    public int compare(faculty f1, faculty f2){
        if(f1.getId() > f2.getId()) return 1;
        else if(f1.getId()<f2.getId()) return -1;
        else return 0;
    }

}
/*class driver1{
    public static void main(String[] args) {
        HashMap<faculty>
    }
}*/


class Queue1{

    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("amit");
        queue.add("harry");
        queue.add("buny");
        System.out.println("head: " + queue.element());
        System.out.println("head: " + queue.peek());
        System.out.println(queue);
        queue.remove();
        queue.poll();
        System.out.println(queue);
    }
}

class book implements Comparable<book>{
    int bid;
    String bookname;

    @Override
    public String toString() {
        return "book{" +
                "bid=" + bid +
                ", bookname='" + bookname + '\'' +
                '}';
    }

    public book(int bid, String bookname){
        this.bid = bid;
        this.bookname = bookname;
    }
    @Override
    public int compareTo(book b1){
        if(b1.bid > this.bid) return 1;
        else if(b1.bid < this.bid) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        book b1 = new book(198, "book1");
        book b2 = new book(195, "book2");
        book b3 = new book(167, "book3");
        PriorityQueue<book> queue = new PriorityQueue<>();
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
        System.out.println(queue.toString());
        for(book b: queue){
            System.out.println(b);
        }
        System.out.println(queue.remove());
        System.out.println(queue.toString());


    }
}
class Reverse_S_orderPrint{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int i = 0; int j = 0;
        for(int row = 0; row < 3; row++) {

            if (i % 2 == 0) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(arr[i][j] + " ");
                    j++;
                }
            }
            else{
                j = j - 1;
                for (int k = 0; k < 3; k++) {
                    System.out.print(arr[i][j] + " ");
                    j--;
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
class book1 implements Comparable<book1>{
    int id;
    String name;
    public int compareTo(book1 b1){
        if(b1.id > this.id) return 1;
        else if(b1.id < this.id) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "book1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public book1(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args){
        book1 b1 = new book1(112,"asdf");
        book1 b2 = new book1(132,"asdkmkmf");
        book1 b3 = new book1(812,"asdf");
        PriorityQueue<book1> queue = new PriorityQueue<>();
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
        System.out.println(queue);


    }
}
class dqqueue{
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.offer("axzsd");
        deque.add("wweew");
        deque.offer("ssss");
//        for(String item : deque){
//            System.out.println(item);
//        }
        deque.add("qwer");
        deque.offer("huilo");
        deque.pollFirst();
        deque.pollLast();
        for(String item : deque){
            System.out.println(item);
        }
        deque.offerFirst("hi");
        System.out.println(deque);
    }
}
class book2{
    int id;
    String authorname,name, publisher;
    public book2(int id, String bookname, String publisher){
        this.id = id;
        this.authorname = authorname;
        this.publisher = publisher;

    }

    @Override
    public String toString() {
        return "book2{" +
                "id=" + id +
                ", authorname='" + authorname + '\'' +
                ", name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public static void main(String[] args) {
        book2 b1 = new book2(123, "asdf", "aswqa");
        book2 b2 = new book2(323, "asdf", "aswqa");
        book2 b3 = new book2(223, "asdf", "aswqa");
        Deque<book2> set = new ArrayDeque<>();
        set.add(b1);
        set.add(b2);
        set.add(b3);
        System.out.println(set);
        for(book2 item : set){
            System.out.println(item);
        }


        

    }
}

class stringbuffer{

    public static void ma(){
        System.out.println("aaassaadd");
    }
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("core");
        str.insert(1, "java");
        Character[] ch  = new Character[22];//= ['a', 's', 'q'];
        str.append(ch);
        System.out.println(str);
        StringBuilder str1 = new StringBuilder("ujwhw");
        StringBuilder str2 = new StringBuilder(34);
        System.out.println(str1);
        System.out.println(str2.append("aaa"));
        stringbuffer s1 = new stringbuffer();
        s1.ma();

    }
}