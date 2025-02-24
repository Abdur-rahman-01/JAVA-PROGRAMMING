public class armsstrong {
    public static void main(String[] args) {
        int number = 153; // Example number
        int temp = number, sum = 0, digits = 0;

        // Count the number of digits
        int n = number;
        while (n > 0) {
            digits++;
            n /= 10;
        }

        // Calculate the sum of digits raised to the power of 'digits'
        n = number;
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        // Check if it's an Armstrong number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
