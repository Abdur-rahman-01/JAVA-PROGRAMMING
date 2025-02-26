class binarysearch {
    public static void main(String args[]) {
        int nums[] = {1, 4, 6, 7, 8, 9};
        int start = 0;
        int key = 6;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == key) {
                System.out.println("Element is at index: " + mid);
                return; // Exit after finding the key
            }

            if (key < nums[mid]) {
                start = mid -1; // Search right half
            } else {
                end = mid + 1; // Search left half
            }
        }

        System.out.println("Element not found");
    }
}
