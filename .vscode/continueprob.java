
import java.util.*; //display all numbers except multiple of 10
 public class continueprob{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    do { 
        System.err.println("enter the number:");
        int n=sc.nextInt();
        if(n%10==0){
          continue;
        }
        System.out.println(n);
    } while (true);
    }
 }
 
