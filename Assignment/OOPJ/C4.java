package helloPack;

public class C4 {

	    public static void main(String[] args) {
	        int rows = 5; // Number of rows for the triangle

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                // Print numbers at the borders or on the last row
	                if (j == 1 || j == i || i == rows) {
	                    System.out.print(j);
	                } else {
	                    System.out.print(" "); // Print space for hollow part
	                }
	            }
	            System.out.println(); // Move to the next line
	        }
	    }
	}


