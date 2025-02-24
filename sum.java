public class sum{
 public static void main(String[] args) {
     int a=10;
     int b=20;
     int sum=a+b;
     System.out.println(sum);
     System.out.println(""+a+b);
     System.out.println(foo()+a+b);
 }
 public static String foo() {
    return "Hello";
 }
}