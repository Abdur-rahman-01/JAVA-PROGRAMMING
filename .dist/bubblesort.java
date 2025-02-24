class bubblesort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 8, 9, 2, 1};
        int n = arr.length;
        
        // Bubble Sort Algorithm
        for (int i = 0; i < n - 1; i++) {  // Outer loop (passes)
            for (int j = 0; j < n - i - 1; j++) {  // Inner loop (swapping adjacent elements)
                if (arr[j] > arr[j + 1]) {  // Swap if the order is wrong
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("After sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

