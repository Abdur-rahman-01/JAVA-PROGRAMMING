package one;
public class A {
    public static void publicMethod(){
        System.out.println("Public method in class A");
    }
    private static void privateMethod(){
        System.out.println("Private method in class A");
    }
    protected static void protectedMethod(){
        System.out.println("Protected method in class A");
    }
    static void defaultMethod(){
        System.out.println("Default method in class A");
    }
}