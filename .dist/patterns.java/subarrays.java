public class subarrays {
    public static void subarray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int start=i;  // Start point
            for (int j = i; j < nums.length; j++) {
                int end=j;  // End point
                for (int k = start; k <= end; k++) {  // Print subarray from i to j
                    System.out.print(nums[k] + " ");
                }
                System.out.println();  // Newline after each subarray
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10};
        subarray(nums);  // No need to print as method already prints
    }
}
