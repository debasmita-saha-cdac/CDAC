public class ReverseArrayInPlace {
    public static void main(String[] args) {
        // Test cases
        int[] input1 = {1, 2, 3, 4};
        System.out.println("Input: [1, 2, 3, 4]");
        reverseArray(input1);
        System.out.print("Output: [");
        printArray(input1);
        System.out.println("]");

        int[] input2 = {7, 8, 9};
        System.out.println("Input: [7, 8, 9]");
        reverseArray(input2);
        System.out.print("Output: [");
        printArray(input2);
        System.out.println("]");
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Swap elements from start and end until the middle is reached
        while (left < right) {
            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
