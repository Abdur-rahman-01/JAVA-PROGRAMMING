//priority threading
import java.lang.*;
class Thread1 extends Thread{
    public void run(){
        for(char ch='A'; ch<='Z'; ch++){
            System.out.println(ch + " ");
            try{
                Thread.sleep(400); // sleep for 1 second
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println(i + "");
            try{
                Thread.sleep(400); // sleep for 1 second
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class multithreading2 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
