public class charpattern {
    public static void main(String args[]) {
        char ch = 'A';
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " "); // Print character in same line
                ch++;
            }
            System.out.println(); // Move to next line after inner loop
        }
    }
}