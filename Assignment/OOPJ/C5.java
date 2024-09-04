package helloPack;

public class C5 {

	    public static void main(String[] args) {
	        int rows = 5; // Number of rows for the pyramid

	        for (int i = 1; i <= rows; i++) {
	            // Print leading spaces
	            for (int j = i; j < rows; j++) {
	                System.out.print(" ");
	            }

	            // Print the first half of the palindrome
	            for (int k = 1; k <= i; k++) {
	                System.out.print(k);
	            }

	            // Print the second half of the palindrome
	            for (int l = i - 1; l >= 1; l--) {
	                System.out.print(l);
	            }

	            System.out.println(); // Move to the next line
	        }
	    }
	}

