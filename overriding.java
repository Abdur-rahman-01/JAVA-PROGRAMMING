class Parent {
void display() {
System.out.println("Parent display");
}
}
class Child extends Parent {
void display() {
System.out.println("Child display");
}
}
public class overriding {
public static void main(String[] args) {
Parent obj = new Child();
obj.display();
}
}