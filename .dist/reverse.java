public class reverse {
    public static void main(String[] args) {
        int[] numb = {3, 4, 6, 2, 6, 8};
        int first = 0;
        int last = numb.length - 1;

        // Reverse the array using swapping
        while (first < last) {
            int temp = numb[last];
            numb[last] = numb[first];
            numb[first] = temp;
            first++;
            last--;
        }

        // Print the reversed array correctly
        for (int i = 0; i < numb.length; i++) {
            System.out.print(numb[i] + " ");
        }
        System.out.println();
    }
}
