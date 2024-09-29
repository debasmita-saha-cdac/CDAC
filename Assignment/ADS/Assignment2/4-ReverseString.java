public class ReverseString {
    public static void main(String[] args) {
        // Test cases
        String input1 = "hello";
        String output1 = reverseString(input1);
        System.out.println("Input: \"" + input1 + "\"");
        System.out.println("Output: \"" + output1 + "\"");

        String input2 = "Java";
        String output2 = reverseString(input2);
        System.out.println("Input: \"" + input2 + "\"");
        System.out.println("Output: \"" + output2 + "\"");
    }

    public static String reverseString(String str) {
        // Create a StringBuilder to hold the reversed string
        StringBuilder reversed = new StringBuilder(str);
        // Reverse the string using StringBuilder's reverse method
        return reversed.reverse().toString();
    }
}
