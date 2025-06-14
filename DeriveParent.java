class ParentBase {
    int a = 50;
}
public class DeriveParent extends ParentBase {
    int a=100;
    void display() {
        System.out.println(super.a);
        System.out.println(a);

    }


    public static void main(String args[]) {
        DeriveParent derive = new DeriveParent(); // Create an object of the derived class
        derive.display(); // Call the display method to see the output
        System.out.println("Parent class variable a: " + derive.a); // Accessing the derived class variable
        
    }

}


