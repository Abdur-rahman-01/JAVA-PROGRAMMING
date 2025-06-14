interface Vehicle{
    void startEngine();
    void stopEngine();
    final int a=20; 
     // all classes are default public and final in interface
}
interface Vehicle1{
    void startMotor();
    void stopGear();
    int a=30;
}
class car implements Vehicle,Vehicle1{
    public void startEngine(){
        System.out.println("Car engine started");
    }
    public void stopEngine(){
        System.out.println("Car engine stopped");
    }
    public void startMotor(){
        System.out.println("Car motor started");

    }
    public void stopGear(){
        System.out.println("Car gear stopped");
    }

}
abstract class Gaadi{
public abstract void blowHorn();
}
    // all classes are default public and final in interface
 // abstract method in interface

class interface1{ // implements Vehicle,Vehicle1{
    public static void main(String[] args) {
        Vehicle myCar = new car(); 
        myCar.startEngine();
        myCar.stopEngine();
        System.out.println(Vehicle.a);
        System.out.println(Vehicle1.a);
        
         
    }
}
