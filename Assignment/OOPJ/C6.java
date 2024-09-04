package helloPack;

public class C6 {
	
	    public static void main(String[] args) {
	        int rows = 4; // Number of rows for the top half of the diamond

	        // Upper part of the diamond
	        for (int i = 1; i <= rows; i++) {
	            // Print leading spaces
	            for (int j = i; j < rows; j++) {
	                System.out.print(" ");
	            }

	            // Print ascending part of the pattern
	            for (int k = 1; k <= i; k++) {
	                System.out.print(k);
	            }

	            // Print descending part of the pattern
	            for (int l = i - 1; l >= 1; l--) {
	                System.out.print(l);
	            }

	            System.out.println(); // Move to the next line
	        }

	        // Lower part of the diamond
	        for (int i = rows - 1; i >= 1; i--) {
	            // Print leading spaces
	            for (int j = rows; j > i; j--) {
	                System.out.print(" ");
	            }

	            // Print ascending part of the pattern
	            for (int k = 1; k <= i; k++) {
	                System.out.print(k);
	            }

	            // Print descending part of the pattern
	            for (int l = i - 1; l >= 1; l--) {
	                System.out.print(l);
	            }

	            System.out.println(); // Move to the next line
	        }
	    }
	}

