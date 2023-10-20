import java.io.*;
import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        //int i1 = sc.nextInt();
        //int i2 = sc.nextInt();
        FileReader fr = null;

        try{
            File file = new File("D:\\Welcome to java.txt");
            fr = new FileReader(file);
            int ch;
            while((ch = fr.read()) != -1){
                System.out.print((char)ch);
            }
        }
        catch(IOException e){
            e.printStackTrace();

        }
        finally{
                try{
                    fr.close();
                } catch(IOException e){
                    e.printStackTrace();
                }
        }
        System.out.println();
        System.out.println("exception handled");
    }
}
class exception{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            //int err = a / b;
            int[] c = {1};
            c[90] = 23;
        }catch(ArithmeticException ae){
            ae.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

class exceptionPrac{
    public static void main(String[] args) {
        System.out.println("open connection: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value: ");
        int n = scan.nextInt();
        try {
            int a = 45 / n;
            System.out.println("value of a is: " + a);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("close connection");

    }
}

class MultipleCatchException{
    public static void main(String[] args) {

        try{
            File f = new File("D:\\Welcome to java.txt");
            FileReader fr = new FileReader(f);

        }catch(Exception e){
            System.out.println("handled");
        }
        System.out.println("handled");
    }
}
class WordFileReadingException{
    public static void main(String[] args) {
        FileReader fr = null;
        try{
            File file = new File("D:\\exception.txt");
            fr = new FileReader(file);
            int ch;
            while((ch = fr.read()) != -1){
                System.out.print((char)ch);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
class ThrowsClauseException{
    static void validate(int age){
        if(age < 18) throw new ArithmeticException("not valid");
        else System.out.println("jsjs");
    }
    public static void main(String[] args) throws IOException{
//        System.out.println("enter name: ");
//        try{
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            String str = br.readLine();
//            System.out.println(str);
//        }catch(IOException e){
//            System.out.println(e.printStackTrace());
//        }
        ThrowsClauseException.validate(12);
    }
}


class maxfreqInteger{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = scan.nextInt();
        }
        int[] arr2 = new int[10];

        for(int i = 0; i < 10; i++){
            int freq = 1;
            for(int j = i + 1; j < 10; j++){
                if(arr[i] != -1 && arr[i] == arr[j]){
                    freq++;
                    arr[j] = -1;
                }
            }
            arr2[i] = freq;

        }
        int max = Integer.MIN_VALUE; int hold= 0;
        for(int i = 0; i < 10; i++){
            if(arr2[i] > max){
                max = arr2[i];
                hold = i;
            }
        }
        System.out.println("max frequency number is: " + arr[hold]);
    }
}

class MaxfreqHashMap{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = scan.nextInt();
        }
        int[] arr2 = new int[10];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < 10; i++) {
            // mp.put(arr[i], mp.get(arr[i]) == null ? 1 : mp.get(arr[i]) + 1);
            if (hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            else{
            hm.put(arr[i], 1);
            }

        }
        int maxFreq = 0;
        Set<Integer> keySet = hm.keySet(); int number = 0;
        for(Integer i:keySet)
        {
            if(hm.get(i) > maxFreq)
            {
                number = i;
                maxFreq = hm.get(i);
            }
        }
        System.out.println("max freq number: " + number);


    }
}
class MergingTwoSortedArray{

    public static void main(String[] args) {
        int[] A = {1,7,10,12,13}; int[] B = {3,5,8,9};
        int m = A.length; int n = B.length; int k = m +n;
        int[] mergerdArr= new int[k];
        int i = 0; int j = 0;
        int l1 = 0;
        while(i < m && j < n) {

            if (A[i] < B[j]) {
                mergerdArr[l1] = A[i];
                i++;l1++;

            } else {
                mergerdArr[l1] = B[j];
                j++;l1++;
            }

        }
        for(int l = l1; i < m && l < k; l++){
            mergerdArr[l] = A[i];
            i++;
        }
        for(int l = l1; j < n && l < k; l++){
            mergerdArr[l] = B[j];
            j++;
        }
        for(int l = 0; l < mergerdArr.length; l++){
            System.out.print(mergerdArr[l] + " ");
        }

    }
}

class String1{
    public static void main(String[] args) {

//        String str1 = "aaa";
//        String str2 = "aaa";
        //System.out.println(str1.equals(str2));
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.next();
        if(str1 == str2) System.out.println("vaild");
        else if(str1.equals(str3)) System.out.println("vaild");
        else{
            System.out.println("invalid");
        }
    }
}
class customer{
    int id;
    public static void main(String[] args) {
        customer c1= new customer();
        c1.id = 10;
        customer c2 = c1;
        c2.id = 10;
        System.out.println(c1.equals(c2));

    }
}


class Student11 {

     int id;
     String name;

    public Student11(int id, String name) {
        this.name = name;
        this.id = id;
    }


}
class student111 extends Student11{

    public student111(int id, String name) {
        super(id, name);

    }
    public boolean equals(Object obj ){
        if(obj == null | this.getClass() != obj.getClass()) return false;
        if(obj == this) return true;
        return this.id == ((student111)obj).id;
    }

    public static void main(String[] args) {
        student111 s1 = new student111(111, "kkk");
        student111 s2 = new student111(111, "kkk");
        System.out.println(s1.equals(s2));

    }
}
class HashcodeEquals {

    public static void main(String[] args) {
        Student11 alex1 = new Student11(1, "Alex");
        Student11 alex2 = new Student11(1, "Alex");
        student111 alex3 = new student111(1, "Alex");

        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
    }
}



class LinkedlistReverse{
    static Node head;
    static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void printNodes(){
        Node current = LinkedlistReverse.head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void reverseList(Node head) {
        if(head == null || head.next == null) return;
        Node current = head.next;
        Node prev = head;
        while(current != null){
            Node nextNode = current.next;
            current.next = prev;

            prev = current;
            current = nextNode;

        }
        head.next = null;
        head  = prev;
    }
    public static void main(String[] args) {
        LinkedlistReverse lst = new LinkedlistReverse();
        lst.head = new Node(9);
        Node first = new Node(5);
        Node second = new Node(5);
        Node third = new Node(5);
        head.next = first;
        first.next = second;
        second.next = third;
        lst.printNodes();
        lst.printNodes();
        lst.reverseList(lst.head);
        lst.printNodes();

    }
}

class linkedlistCycleCheck{
    static Node head;

    static Node next;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    public boolean cycleCheck(){
        Node first = linkedlistCycleCheck.head;
        Node second = linkedlistCycleCheck.head;
        if(head == null) return true;
        while(first != null || first.next != null){
            first = first.next.next;
            second = second.next;

            if(first == second) return true;

        }
        return false;
    }

    public static void main(String[] args) {
        linkedlistCycleCheck lst = new linkedlistCycleCheck();
        linkedlistCycleCheck.head = new Node(8);
        Node first = new Node(9);
        Node second = new Node(89);
        Node third = new Node(99);
        head = first.next;
        first = second.next;
        second.next = third;
        third.next = null;
        boolean val = lst.cycleCheck();
        if(val) System.out.println("cycle exists");
        else System.out.println("cycle does not exist");
    }
}

class LinkedList2<T>{

    private class Node{
        T data;
        Node next;
        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private int size;
    public LinkedList2(){
        head = null;
        size = 0;
    }
    public void add(T data){
        Node node1 = new Node(data);
        if(head == null){
            Node node = new Node(data);
            node.next = head;
            head = node;
            size++;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node1;
            size++;

        }
    }

    public void remove(T data){
        if(head == null) return;
        if(head.data.equals(data)){
            head = head.next;
            size--;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data.equals((data))){
                temp.next = temp.next.next;
                size--;
                return;
            }
            temp = temp.next;
        }
        temp = temp.next;
        size--;


    }
    public void printList(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + "->" );
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        LinkedList2<String> ll = new LinkedList2<>();
        ll.add("asdf");ll.add("raj");ll.add("Sumu");ll.add("sumant");
        ll.printList();
        ll.remove("raj");
        ll.printList();
    }
}




