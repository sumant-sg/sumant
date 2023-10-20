import java.util.Arrays;
import java.util.Scanner;

public class Repractise {
    public static void main(String[] args) {

    }
}
class LargestAmong3Integers{
    static public void main(String[] args) {
        int n1 = 0;
        int n2 = 0,n3 = 0;

        if (n1 >= n2) {
            if (n1 >= n3)
                System.out.println(n1 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        } else {
            if (n2 >= n3)
                System.out.println(n2 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        }

    }
}
class FibonaciUptoGivenNumber{
    public static void main(String[] args) {
        int fno = 0 ; int sno = 1;
        int result = fno + sno;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.print(fno + " ");
        System.out.println(sno + " ");
        while(result <= input){
            System.out.print(result + " ");
            fno = sno;
            sno = result;
            result = fno + sno;
        }
    }
}

class gcd{
    public static void main(String[] args) {
        int n1 = 10, n2 = 20; int gcd = 0;
        for(int i = 1; i < 20; i++){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;

            }
        }
        System.out.println(gcd);
    }
}
class lcm{
    public static void main(String[] args) {
        int n1 =18; int n2 = 10;
        int lcm = (n1 > n2)? n1: n2;
        while(true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
    }
}


class LongWordCount{
    public static void main(String[] args) {
        String str = "ddd d ddddd d d d d ddddddd ddddd ddeeed ddrreeeerrrrrrrrrrrrrrr";
        int count = 0; int ans =0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ') {
                count++;
                ans = Math.max(ans, count);
            }
            else count = 0;
        }
        System.out.println(ans);
    }
}

class charFreqq{
    public static void main(String[] args) {
        String str = "sfeg gbetyhtrs rhsbxtbsdgdt bfxgvgfshbehthf fffffffff";
        int count = 0; char[] ch = str.toCharArray(); int[] fr = new int[ch.length];
        for(int i = 0; i< ch.length; i++){
            if(ch[i] != '1') {
                int freq = 1;
                for (int j = i+1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        ++freq;
                        ch[j] = '1';


                    }
                }
                fr[i] = freq;
            }
        }
        for(int i =0; i< ch.length; i++){
            if(ch[i] != ' ' && ch[i] != '1') System.out.println(ch[i] + "==>" + fr[i]);
        }
    }
}
class CountDigitt{
    public static void main(String[] args) {
        String str = "derf2345"; int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) count++;
        }
        System.out.println(count);
    }
}
class maxOccureChar{
    public static void main(String[] args) {
        String str = "aasa dddd ffghj eee h hhhhhhh";
        int max_freq =0; int min_freq = 0; char ch_max =0;
        int count =0; int ans =0; char[] ch = str.toCharArray();
        for(int i = 0; i< ch.length; i++){
            int freq = 1;
            if(ch[i] != '1'){
                for(int j = i+1; j < ch.length; j++){
                    if(ch[i] == ch[j]){
                        freq++;
                        ans = Math.max(ans, freq);
                        ch[j] = '1';

                    }

                }
                if(freq > max_freq){
                    max_freq = freq;
                    ch_max = ch[i];
                }

            }

        }
        System.out.println(ch_max + " "+ max_freq);
    }
}

class stackImplementWithArray{
    private int top;
    int[] arr = new int[23];
    private int maxSize;

    public stackImplementWithArray(int size){
        maxSize = size - 1;
        arr= new int[size];
        top = -1;
    }
    int n = arr.length;
    public boolean isFull(){
        if(top == maxSize) return true;
        return false;
    }
    public boolean isEmpty(){
        if(top == -1) return true;
        return false;
    }

    public void push(int ele){
        if(isFull()) System.out.println("stack is full, Can't be inserted");
        top++;
        arr[top] = ele;
    }
    public void pop(){
        if(top == -1) System.out.println("can not be pop");
        arr[top] = -1;
        top--;
    }
    public int peek(){
        if(top == -1) {
            System.out.println("stack is empty");
            return -1;
        }
        int val = arr[top];
        return val;
    }

    @Override
    public String toString() {
        return "stackImplementWithArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
class stackCheck{
    public static void main(String[] args) {
        stackImplementWithArray stack = new stackImplementWithArray(7);
        stack.push(1);stack.push(2);stack.push(3);stack.push(4);stack.push(5);stack.push(6);stack.push(47);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.peek();
        System.out.println(stack);

    }
}


class QueueImplementation1{
    int size = 20;
    int[] arr = new int[size];


    public QueueImplementation1(int size){
//        arr = new int[size];
        //n = size;
        this.arr = new int[size];
    }

    int n = arr.length;
    int front = -1, rear = -1;

    @Override
    public String toString() {
        return "queueImplementation{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public void add(int ele){
        if(rear > n-1) System.out.println("Queue is full==Overflow");
        rear++;
        arr[rear] = ele;

    }
    public void pop(){
        front++;
        if(front < 0 || front > rear) System.out.println("queue is empty==underflow");
        arr[front] = -1;

    }

    public static void main(String[] args) {
        QueueImplementation1 obj1 = new QueueImplementation1(5);
        obj1.add(34);obj1.add(354);obj1.add(344);obj1.add(314);obj1.add(24);

        obj1.pop();
        System.out.println(obj1);

    }

}







class ssss{
    public static void main(String[] args) {
        String str = "'.,kdfg'.,";
        char[] chArray = str.toCharArray();

        // Using sorting

        Arrays.sort(chArray);
        for(int i = 0; i<chArray.length; i++){
            System.out.println(chArray[i]);
        }
    }
}
class GFG {
    public static boolean areBracketsBalanced(String s)
    {
        int i = -1;
        char[] stack = new char[s.length()];
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                stack[++i] = ch;
            else {
                if (i >= 0
                        && ((stack[i] == '(' && ch == ')')
                        || (stack[i] == '{' && ch == '}')
                        || (stack[i] == '[' && ch == ']')))
                    i--;
                else
                    return false;
            }
        }
        return i == -1;
    }

    public static void main(String[] args)
    {
        String expr = "{()}[]";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
class Balancepara{
    public static String paraCheck(String str){
          int openPara =0, closePara = 0;
          for(int i = 0; i < str.length(); i++){
              if(str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') openPara++;
              else{
                  if(str.charAt(i) == '}' ||str.charAt(i) == ')' || str.charAt(i) == ']') closePara++;
              }
          }
          if(openPara == closePara) return "balanced";
          else return "notbalanced";
    }
    public static void main(String[] args) {
        String str = "abdcfrgt";
        System.out.println(paraCheck("{[()}]}}"));
    }
}
