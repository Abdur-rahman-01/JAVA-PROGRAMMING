class sstatic {
static int count = 0;
public sstatic() {
count++;
}
 
public static void main(String[] args) {
sstatic obj1 = new sstatic();
sstatic obj2 = new sstatic();
sstatic obj3 = new sstatic();
System.out.println("Count: " + sstatic.count);
System.out.println( " "+ 8 + 3 + " " );
}
}
