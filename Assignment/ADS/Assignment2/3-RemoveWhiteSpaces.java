public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        // Test cases
        String input1 = "Hello World";
        String output1 = removeWhiteSpaces(input1);
        System.out.println("Output: \"" + output1 + "\"");

        String input2 = "  Java   Programming  ";
        String output2 = removeWhiteSpaces(input2);
        System.out.println("Output: \"" + output2 + "\"");
    }

    public static String removeWhiteSpaces(String str) {
        // Use replaceAll to remove all white spaces
        return str.replaceAll("\\s+", "");
    }
}
