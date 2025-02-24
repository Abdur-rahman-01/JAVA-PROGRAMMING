// public class whileloop{
//     public static void main(String[] args) {
//         int counter=1;
//         while(counter<=10){
//             System.out.print(counter);
//             counter++;
//         }
//     }
// }

///for 1 to n numbers
// import java.util.*;
// public class whileloop{ 
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int counter=1;
//     while(counter<=n){
//         System.out.print(counter + " ");
//         counter++;
//     }

//  }
// }

// sum of n terms
import java.util.*;
public class whileloop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;

        int i=1;
        while(i<=n){
         sum+=i;
         System.out.println(sum);
         i++;
        }
        System.out.println("Sum is"+ sum);
    }
}