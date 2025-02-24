
public class typepromotions {
    public static void main(String args[])
    {
        char a = 'a';
        char b = 'b';
        byte c = 5;
        int num=20; //implicit
        double e=num;
        double x=9.9;
        int y=(int)x;
        // byte d = b*2; //lossy coversion
        byte d=(byte) (b*2);
        System.out.println((int)(b)); // Added semicolon here
        System.out.println((int)(a));
        System.err.println(e);
        System.out.println(b - a);
        System.err.println(c-b);
        System.err.println(d);
        System.err.println(y);
    }
}
