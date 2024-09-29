/*
6. Reverse Words in a String
Problem: Write a Java program to reverse the words in a given sentence.

Test Cases:

Input: "Hello World"
Output: "World Hello"
Input: "Java Programming"
Output: "Programming Java" */


public class ReverseWordsInString {
    public static void main(String[] args) {
        // Test cases
        String input1 = "Hello World";
        System.out.println("Input: \"" + input1 + "\"");
        System.out.println("Output: \"" + reverseWords(input1) + "\"");

        String input2 = "Java Programming";
        System.out.println("Input: \"" + input2 + "\"");
        System.out.println("Output: \"" + reverseWords(input2) + "\"");
    }

    public static String reverseWords(String sentence) {
        // Split the sentence into words using space as the delimiter
        String[] words = sentence.split(" ");
        
        // Initialize a StringBuilder to hold the reversed sentence
        StringBuilder reversedSentence = new StringBuilder();
        
        // Iterate through the words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);  // Append each word
            if (i != 0) {
                reversedSentence.append(" "); // Add a space between words
            }
        }
        
        // Return the reversed sentence
        return reversedSentence.toString();
    }
}

