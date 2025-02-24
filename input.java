
import java.util.*;

public class input {
  public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       //captures the data in string and stores in variable
       String input=sc.next();
       //to also print the output after input
       System.out.println(input); 
       //to print the cahracters after the space eg:'tony stark'
       String name=sc.nextLine();
       System.err.println(name);
       // similarly use nextint(),nextFloat(),nextDouble()
  }
} 