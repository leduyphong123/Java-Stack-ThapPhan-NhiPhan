import java.util.Stack;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Stack stack=new Stack();
        Scanner input= new Scanner(System.in);
        System.out.println("input number");
        int number=input.nextInt();
        while (number!=0){
            stack.push(number%2);
            number/=2;
        }
        for (int i=0;i<stack.size();i++){
            System.out.print(stack.get(i));
        }
    }
}