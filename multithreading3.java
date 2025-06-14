import java.lang.*;
class Thread1 extends Thread{
    public void run(){
        try{
            System.out.println("thread"+ Thread.currentThread().getId()+ " is running");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class multithreading3{
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<=8;i++){
        Thread1 t1= new Thread1();
        t1.start();
    }
}
}