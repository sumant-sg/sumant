import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListImplementation1<T>{

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
    public LinkedListImplementation1(){
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
        if(temp.data.equals(data)){
            temp = temp.next;
            size--;
        }



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
        LinkedListImplementation1<String> ll = new LinkedListImplementation1<>();
        ll.add("asdf");ll.add("raj");ll.add("Sumu");ll.add("sumant");
        ll.printList();
        ll.remove("sumant");
        ll.printList();
    }
}




class Linked<T>{
    private class Node{
        T data;
        Node next;
        public Node(T data){
            this.data = data;
            this.next = null;
        }

    }
    private int size;
    private Node head;
    public Linked(){
        this.head = null;
        this.size = 0;
    }
    public void add(T data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            size++;
        }
        else{
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = node;
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
            if(temp.next.data.equals(data)){
                temp.next = temp.next.next;
                size--;
                return;
            }
            temp = temp.next;
        }
        if(temp.data.equals(data)){
            temp =temp.next;
            size--;
        }

    }

    public Node reverse(Node head){
        if(head == null) return null;
        //System.out.println(head.next.data);
        if(head.next == null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    @Override
    public String toString() {
        return "Linked{" +
                "size=" + size +
                ", head=" + head.data +
                '}';
    }

    public void printList(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println(temp.data);

    }


    public static void main(String[] args) {
        Linked<String> ll = new Linked<>();
        ll.add("ram");ll.add("harry");ll.add("Harish");
        System.out.println(ll);
        //ll.printList();
        ll.head = ll.reverse(ll.head);
        //System.out.println(ll.head.data);
        //System.out.println(ll.head.next.data);
        //ll.printList();
        System.out.println(ll);

    }

}


class Linkedlist1<T>{

    private class Node{
        private T data;
        private Node node;

        Node(T data, Node node) {
            this.data = data;
            this.node = null;
        }
    }
    private Node head;
    int size;
    public void add(T data){
        if(head == null){

        }
    }
}