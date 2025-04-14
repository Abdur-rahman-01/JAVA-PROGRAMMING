import java.util.InputMismatchException;
import java.util.Scanner;
public class methods{
    public static void main(String[] args) {
        System.out.println("hello world");
        greet();
        //  System.err.println(sum(1,2) * sum(2,3));
        Scanner sc=new Scanner(System.in);
        int a=0,b=0;
        try { 
            
        System.err.println("enter the first number:");
        a = sc.nextInt();
        System.err.println("enter the second number:");
        b = sc.nextInt();
        }
        catch (InputMismatchException e) {
            System.err.println("invalid input, enter only numbers ");
        }
        
        System.out.println("the sum is:" + sum(a,b));
        
        System.err.println("nice try diddy");
    }
    public static void greet(){
        
        System.out.println("good morning");
    }
    public static int sum(int a, int b){
        return a+b;
         
}
 
}

