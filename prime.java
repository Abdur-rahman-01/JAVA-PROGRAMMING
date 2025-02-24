public class prime{
    public static void main(String args[])
    {
        // give a num
        int cnt = 0;
        int num=2;
        int i;
        for(i=1;i<=num;i++){
        if(num%i==0){
            cnt++;
            }
        }
        if(cnt==2){
            System.out.println(num+"it is prime");
        } 
         else{
            System.out.println(num+"not prime");
        }

    }
}
