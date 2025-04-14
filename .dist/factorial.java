    
    import java.util.*;
    class factorial{
        public static int factorial(int n)
     {
         
        if(n==0 || n==1){
        return 1;
        }
        else{
         return n*factorial(n-1);
        }
     }
    
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number to find factorial");
int f=sc.nextInt();

System.out.println(factorial(f));
}

}
//basic even odd functions
//  import java.util.*;
// class factorial{

//     public static void  evenodd(int n){
//     if(n%2==0)
//     System.out.println("even");
//     else{
//         System.out.println("odd");
//     }
//     }

// public static void main(String args[]){
// Scanner sc=new Scanner(System.in);
// System.out.println("enter a number");
// int n=sc.nextInt();
// evenodd(n);
// }
// }


