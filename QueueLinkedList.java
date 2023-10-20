import java.util.*;
class QueueB {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }


    static class Queue{
        static Node head = null;
        static Node tail = null;


        public static boolean isEmpty() {
            return head == null && tail == null;
        }


        public static void add(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                tail = head = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }


        public static int remove() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            //single node
            if(head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }


        public static int peek() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);


        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}



class QueueImplementation{
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    static class queue{
        static Node head = null;
        static Node tail = null;
        public static boolean isEmpty(){
            return head == null & tail ==null;
        }
        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()) {
//                tail = newNode;
//                tail.next = null;
                tail = head = newNode;
            }

//            tail = newNode ;
//            tail.next = null;
            tail.next = newNode;
            tail = newNode;
        }
        public static int remove(){
            if(isEmpty()) return -1;
            int front = head.data;
            if(head == tail){
                tail = null;
                return front;
            }
            head = head.next;
            return front;

        }
        public static int peek(){
            if(isEmpty()) return -1;
            return head.data;

        }
    }

    public static void main(String[] args) {
        queue q1 = new queue();
        q1.add(2);
        q1.add(9);
        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
        //System.out.println(q1.peek());
    }
}
abstract class Calculate
{
    abstract int multiply(int a, int b);
}

class Mainnn
{
    public static void main(String[] args)
    {
        int result = new Calculate()
        {
            @Override
            int multiply(int a, int b)
            {
                return a*b;
            }
        }
        .multiply(12,32);
        System.out.println("result = "+result);
    }
}
class MethodOverloading{
    public void hi(){
        System.out.println("hi");
    }
    public void hi(int a){
        System.out.println("hi");
    }
    public void hi(String str){
        System.out.println("hi");
    }
    public static void main(String[] args) {

    }
}

class MethodOverriding extends MethodOverloading{

        static boolean areBracketsBalanced(String expr)
        {
            // Using ArrayDeque is faster than using Stack class
            Deque<Character> stack
                    = new ArrayDeque<Character>();

            // Traversing the Expression
            for (int i = 0; i < expr.length(); i++) {
                char x = expr.charAt(i);

                if (x == '(' || x == '[' || x == '{') {
                    // Push the element in the stack
                    stack.push(x);
                    continue;
                }

                // If current character is not opening
                // bracket, then it must be closing. So stack
                // cannot be empty at this point.
                if (stack.isEmpty())
                    return false;
                char check;
                switch (x) {
                    case ')':
                        check = stack.pop();
                        if (check == '{' || check == '[')
                            return false;
                        break;

                    case '}':
                        check = stack.pop();
                        if (check == '(' || check == '[')
                            return false;
                        break;

                    case ']':
                        check = stack.pop();
                        if (check == '(' || check == '{')
                            return false;
                        break;
                }
            }

            // Check Empty Stack
            return (stack.isEmpty());
        }

        // Driver code
        public static void main(String[] args)
        {
            String expr = "([{}])";

            // Function call
            if (areBracketsBalanced(expr))
                System.out.println("Balanced ");
            else
                System.out.println("Not Balanced ");
        }
    }

class StaticTest{

    public static int a1= 90;
    public static  int m1(int a, int b){
        System.out.println("acb");
        return a+b;
    }

    public static void main(String[] args) {

    }
}
class mfg extends StaticTest{

    public static int m1(int c, int d){
        System.out.println("jhb");
        return c*d;
    }
    public static void main(String[] args) {

        mfg s1 = new mfg();
        int a11 = s1.a1;
        System.out.println(a11);
        s1.m1(6,7);
    }
}




