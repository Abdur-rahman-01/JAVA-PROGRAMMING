import java.util.*;
public class calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a:");
        int a=sc.nextInt();
        System.out.println("enter value of b:");
        int b=sc.nextInt();
        System.out.println("enter the operator");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+': System.out.println("the sum is " +a+b);
            break;
            case'-': System.out.println(a-b);
            break;
            case'*': System.out.println(a*b);
            break;
            case'/': System.out.println(a/b);
            default: System.err.println("your calculator sucks");

        }
    }
}