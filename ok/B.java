package ok;
import one.A; 
public class B{
     public static void main(String[] args) {
         A.publicMethod();
        //  A.privateMethod(); wont run as private method is not accessible outside the class
        //  A.protectedMethod(); //  wont run as protected method is not accessible outside the class
        //  A.defaultMethod(); // default cannotbe accessed outside the package
        
            
     }
}