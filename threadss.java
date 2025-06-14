class threadx implements Runnable{
public void run(){
    for (int i = 0; i < 10; i++) {
        System.out.println("Thread x with i = " + -1* i);
    }
    System.out.println("thread x exits");
}
}
 class thready implements Runnable{
    public void run(){
        try{
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        for(int j = 0; j < 10; j++){
            System.out.println("Thread y with j = " +2* j);
        }
        System.out.println("thread y exits");
    }
 }

class threadss{
    public static void main(String[] args) {
        try{
        threadx x = new threadx();
        Thread t1 = new Thread(x);
        thready y = new thready();
        Thread t2 = new Thread(y);
        t1.start();
        t2.start();
        }
        catch(Exception E){
            System.out.println("Exception caught: " + E.getMessage());
        }
        
    }
}
