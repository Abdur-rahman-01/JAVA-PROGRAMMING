// symbols that tells compiler to perform an action
// arithmetic(bonary and unary)[+,-,*,/,%]
// relational[==,!=,>,<,>=,<=]
// assignment
// bitwise(high level)
// logical

public class operator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //unary increment and decrement
        int x=20;
        int y=++x;
        
        int z=5;
        int i=z++;
        System.out.println(z);
        System.out.println(i);

        System.out.println(x);
        System.err.println(y);

        
        System.err.println("sum = "+ a+b);
        System.out.println("product = "+ a*b);
        System.out.println("difference= "+ (a-b));
        System.out.println(a!=b);//logical(used in conditinal sattements)
        System.out.println((a<b)&&(b<a));
        System.err.println((a<b) || (a>b));
        System.out.println(!(a<b));
        int t=10;
        t+=10;
        System.out.println(t);
    }
}