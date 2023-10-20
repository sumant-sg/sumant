
import FirstPackage.AccessModifier;
import  java.lang.Character;
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class ProblemSolving2 {
    private int a;
    private String str = "hello";

    public void setA(int a) {
        this.a = a;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getA() {
        return a;
    }

    public String getStr() {
        return str;
    }

    public static void main(String[] args) {
        AccessModifier a1 = new AccessModifier();




    }
}
class Problem {


    public static void main(String[] args) {

        //o remove duplicates from an array of integers.
        Scanner sc = new Scanner(System.in);
        //2nd largest number
        int[] arr = {1, 3, 43, 45, 23, 567, 345, 2, 3, 5, 678, 1, 3, 45};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = arr[i + 1];
                }
            }
        }

    }
}
class Mainn{
    public static int removeDuplicates(int array[], int n){
        if(n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for(int i=0; i<n-1; i++){
            if(array[i] != array[i+1]){
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[n-1];
//Changing the original array
        for(int i=0; i<j; i++){
            array[i] = temp[i];
        }
        return j;
    }
    public static void main (String[] args) {
        int array[] = {1, 3, 43, 45, 23, 567, 345, 2, 3, 5, 678, 1, 3, 45};
        int length = array.length;
        length = removeDuplicates(array, length);
//Printing The array elements
        for(int i=0; i<length; i++)
            System.out.print(array[i]+" ");

    }

}

class AnagramStringCheck{
    public static void main(String[] args) {
        //String str = "kmfwoij 2roijm2 2ork4rji2mr oij2ofm";
        int ans =0; int count =1;
        String str = "asdssssf"; String str2 =  "adsf";
        if(str.length() == str2.length()){
            char[] ch = str.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch);
            Arrays.sort(ch2);
            if(Arrays.equals(ch,ch2)){
                System.out.println("anagram");
            }
           else System.out.println("not angram");

        }
        else System.out.println("not anagram");
    }
}

class StarPatternProgram{
    public static void main(String[] args) {
        for(int i=1 ;i <= 5 ;i++){
            boolean k = true;
            for(int j = 1; j <= 9; j++) {
                if ((j >= 6 - i) && (j <= 4 + i) && k) {
                    System.out.print("* ");
                    k = false;
                } else {
                    System.out.print("  ");
                    k = true;
                }
            }
            System.out.println();
        }
    }
}

class StarPatternProgram1{
    public static void main(String[] args) {
        for(int i=1 ;i <= 5 ;i++){

            for(int j = 1; j <= 9; j++) {
                if ((j >= 6 - i) && (j <= 4 + i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");

                }
            }
            System.out.println();
        }
    }
}
class StarPatternProgram2{
    public static void main(String[] args) {
        for(int i=1 ;i <= 5 ;i++){

            for(int j = 1; j <= 9; j++) {
                if ((j <= 6 - i) || (j >= 4 + i)) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");

                }
            }
            System.out.println();
        }
    }
}


class Ascending{
    public static void main(String[] args) {
        int[] a1 = {1,3,53,21,34};
        for(int i =0; i<a1.length; i++){
            for(int j = i+1; j<a1.length; j++){
                if(a1[i] > a1[j]) {
                    int hold = a1[i];
                    a1[i] = a1[j];
                    a1[j] = hold;
                }
            }
            System.out.println(Arrays.toString(a1));
        }

    }
}
class longword{
    public static void main(String[] args) {
        String str = "adwe ewf ferfrfe 3f rfef f er fef e";
        int count =0; int ans =0;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                count++;
                ans = Math.max(count,ans);
            }
            else count =0;
        }
        System.out.println(ans);
    }
}
class noofwords{
    public static void main(String[] args) {
        String str = "kmsm afcsdc frfcedv erfefe erf";
        int count = 1;
        for(int i =0 ;i<str.length();i++){
            if(str.charAt(i) == ' ') count++;
        }
        System.out.println(count);
    }
}
class FreqEachChar{
    public static void main(String[] args) {
        String str = "jnkjfknkw wkfjenfekn kfjef";
        char[] ch = str.toCharArray();
        int[] freq = new int[str.length()];
        for(int i =0; i < str.length(); i++){
            freq[i] = 0;
            for(int j = i+1; j < str.length(); j++){
                if(ch[i] == ch[j]){
                    freq[i]++;
                    ch[j] = '0' ;
                }
            }

        }
        for(int i = 0; i< freq.length;i++){
            if(ch[i] != ' ' && ch[i] != '0') System.out.println(str.charAt(i) + " " + freq[i]);
        }
    }
}
class CountDigit{
    public static void main(String[] args) {
        String str = "asdf23 ndn23 jjk13jk kjb1333";
        //String str = "GeeksforGeeks password is : 1234";
        int digits = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits++;
            }
        }
        System.out.println("Total number of Digits = "
                + digits);

    }
}

class NonRepeatingChar{
    public static void main(String[] args) {
        String str = "gibblegabbler"; int count =0;

        for(int i =0; i<str.length(); i++)
        {
            boolean bool = true;
            for(int j =0; j < str.length(); j++){
                if(i != j && str.charAt(i) == str.charAt(j) ){
                    bool = false;
                    break;
                }
            }
            if(bool){
                System.out.println(str.charAt(i));
                break;
            }

        }

    }
}


class MaxOccuringChar{
     public static void main(String[] args) {
        String str = "aaasjndhen aaaaakjwdknjewjn aaaaaakjnjnjz";
        char[] ch = str.toCharArray(); int ans = 0; char ch_ans = ' ';
        for(int i =0; i < ch.length; i++){
            int count = 0;
            for(int j =  i; j < ch.length; j++){
                if(ch[i] == ch[j]){
                    count++;
                    ans = Math.max(ans, count);
                    ch_ans = ch[i];
                }
            }


        }
        System.out.println(ch_ans + " " + ans);
    }
}

class SeriesFactSum{
    public static void main(String[] args) {
        double res = 0; int n = 5;
        double multi = 1;
        for(int i = 1; i <= n; i++){
            multi = multi * i;
            res = res + (i / multi);

        }
        System.out.println(res);
    }
}
class Abcd {
    public static void main(String[] args) {

        double res = 0, fact = 1;
        for (int i = 1; i <= 5; i++) {
            // fact variable store
            // factorial of the i
            fact = fact * i;

            res = res + (i / fact);
        }
        System.out.println(res);
    }
}
class Triangle{
    public static void main(String[] args) {
        for(int i =1; i <= 5; i++){
            for(int j =1; j<=9; j++){
                if((j >= 6-i) && (j <= 4 + i)) System.out.print("* ");

                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

class pattern{
    public static void main(String[] args) {
        for(int i =0; i< 6;i++){
            for(int j =0; j<= 9; j++){
                if(j >= 6 -i && j <= 4+i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
class factorialSum{
    public static void main(String[] args) {
        double sum = 0, multi = 1, n= 5;
        for(int i =1; i<n; i++){
            multi = multi * i;
            sum = sum + (double) i/(multi);
        }
        System.out.println(sum);
    }
}
class factorial{
    public static int factorial(int n) {
        if (n <= 0) return 1;
        return    n * factorial(n - 1);
        }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
class BinaryToDecimal{
    public static void main(String[] args) {
        int n = 110110111,  i = 0; double num =0;
        while(n > 0){
            int hold = n % 10;
            num = num + hold * Math.pow(2, i);

            n = n / 10;
            i++;

        }
        System.out.println(num);
    }
}
class decimalToBinary{
    public static void main(String[] args) {
        int n = 0;
        n = 19;
        int binarynum = 0, i = 1;
        while (n > 0) {
            int hold = n % 2;
            binarynum += hold * i;
            n = n / 2;
            i = i * 10;
        }
        System.out.println(binarynum);
    }
}
class charFreq{
    public static void main(String[] args) {
        String str = "kmqm kqjncn dwuqhwquid ouhduih";
        int[] freq = new int[str.length()];
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i+1 ; j < str.length(); j++) {
                if (ch[i] == ch[j]) {
                    freq[i]++;
                    ch[j] = '0';

                }
            }
        }
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] != '0' && ch[i] != ' ') System.out.println(ch[i] + ": " + freq[i] + "  ");
        }
    }
}
class asdd{
    public static void main(String[] args) {
        String str= "madam ljnsan xakjxjksajkn", str1 = "";
        int count = 0, ans = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                count++;
                ans = Math.max(ans, count);
            }
            else count =0;
        }
        System.out.println(ans);
    }
}
class aaa{
    public static void main(String[] args) {
       int[] a1 = {1,2,3,2,1,54};
       Arrays.sort(a1);
       int[] a11 = new int[a1.length];
       for(int i =0; i<a1.length - 1; i++){
           if(a1[i] != a1[i+1]) a11[i] = a1[i];
       }
        System.out.println(Arrays.toString(a11));
    }
}
class Mani{
    public static void main(String[] args) {
        String str = "Hi this is java kjhjb";
        String str1 = "";
        for(int i =0; i< str.length(); i++){

            if(str.charAt(i) != ' ') str1 = str1 + str.charAt(i);
            else{
                System.out.println(str1);
                str1 ="";
            }
        }
       // System.out.println(str1);
    }
}


class PrimeSortedPrintMani{
    public int[] m1(int[] a1){
        int[] arr = new int[a1.length];
        for(int i =0; i<a1.length; i++){
            int val = a1[i];
            boolean flag = true;
            for(int j =2; j < val; j++){

                if(val % j == 0) flag = false;

            }
            if(flag == true) arr[i] = val;


        }
        return arr;
    }
    public static void main(String[] args) {
        int[] a11= {1,3,5,67,54,7};
        PrimeSortedPrintMani p1 = new PrimeSortedPrintMani();
        int[] ans = p1.m1(a11);
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));

    }
}

class MaxFreqWord{
    public static void main(String[] args) {
        String str = "alkmdon fo nerfni tkjgngi tgjnrtgorng";
        char[] ch = str.toCharArray();
        int[] freq = new int[ch.length];
        for(int i = 0; i< ch.length; i++){
            freq[i] = 1;
            for(int j = i + 1; j < ch.length; j++){
                if(ch[i] == ch[j]){
                    freq[i]++;
                    ch[j] = '0';

                }
            }
        }

       for(int i =0; i<ch.length;i++){
           if(ch[i] != '0' && ch[i] != ' ') System.out.println(ch[i] + " "+ freq[i]);
       }
    }
}

class Arraylist1{
    public static void main(String[] args) {
        List<Object> a1 = new ArrayList<>();
        a1.add("sss");
        a1.add(7);
        a1.add(23);
        System.out.println(a1);
        List<Object> a2 = new ArrayList<Object>(a1);
        System.out.println(a2);


    }
}


class Factorial{
    public int m1(int n){
        if(n <= 0) return 1;
        return n * m1(n - 1);
    }
    public static void main(String[] args) {
        int num = 5;
        Factorial f1 = new Factorial();
        System.out.println(f1.m1(num));

    }
}





class Stack {

    private int maxSize;
    private Object[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new Object[maxSize];
        top = -1;
    }

    public void push(Object value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        top++;
        stackArray[top] = value;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        }
        int oldTop = top;
        top--;
        stackArray[oldTop] = null;
        return stackArray[oldTop];
    }

    public Object peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek element.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    @Override
    public String toString() {
        return "Stack: " + Arrays.toString(stackArray);
    }
}
class TestStackImpl {

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        stack.push(6);

        stack.pop();

        System.out.println(stack);

        stack.push(6);

        System.out.println(stack);
    }
}


class hashing{


    public static void main(String[] args) {

    }
}







