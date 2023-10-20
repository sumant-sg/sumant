package Package2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StackImplementaion {
    int[] arr = new int[10];
    int top;
    public void push(int item){
        if(top + 1 >= (arr.length)){
            System.out.println("stack is full");

        }
        else arr[top++] = item;

    }
    public void pop(int item){
        if(top <= 0){
            System.out.println("Stack is empty, so pop operation denied");
        }
        else{
            top = top-1;
            arr[top] = top;
        }
    }
    public void isEmpty(){
        if(top == -1) System.out.println("empty arr");
        else System.out.println("Not empty");
    }
    public void isFull(){
        if(top >= arr.length) System.out.println("arr is full");
        else System.out.println("arr is not full yet");
    }
    public static void main(String[] args) {
        int case1;
        StackImplementaion obj1 = new StackImplementaion();
        System.out.println(obj1.top);

        int choice = 0;
        while (choice <= 5){
            System.out.println("\nChose one from the below options...\n");
            System.out.println("1.Push\t2.Pop\t3.Isempty\t4.IsFull\t5.Exit");
            System.out.println("\n Enter your choice \n");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter an iem tp push: ");
                    Scanner scan = new Scanner(System.in);
                    int item = scan.nextInt();
                    obj1.push(item);
                    break;
                case 2:
                    System.out.println("Enter an item to pop: ");
                    Scanner scan1 = new Scanner(System.in);
                    int item1 = scan1.nextInt();
                    obj1.pop(item1);
                    break;
                case 3:
                    obj1.isEmpty();
                    break;
                case 4:
                    obj1.isFull();

                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("enter an input between 1 to 5");
                    break;
            }
        }

    }

}



class StringProblem {
    public static void main(String[] args) {
        String str = "aaaaa";
        String pattern = "([a-zA-Z])\\1*";

        if (str.matches(pattern)) {
            // The string contains is made up of the same character...
            System.out.println("yes");
        }

    }
}

class CheckUniqueChar{
    public static void main(String[] args) {
        String str = "kjbiubib";
        char[] ch = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for(Character c : ch){
            if(!set.add(c)){
                System.out.println("Not unique");
                break;
            }

        }

    }
}
class FindingMin{
    public static void main(String[] args) {
        int[] arr = {1,3,6,34,21,19};
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length - 1; i++){

            min  = min< arr[i] ? min: arr[i];
            //int hold = arr[i];
            //arr[i] = val;
            //arr[i+1] = arr[i];



        }
        System.out.println(min);
    }
}
