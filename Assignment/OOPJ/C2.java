package helloPack;

public class C2 {

	public static void main(String[] args) {
		
		   
		        int rows = 5; // Number of rows for the pyramid

		        for (int i = rows; i >= 1; i--) {
		            // Print leading spaces
		            for (int j = i; j < rows; j++) {
		                System.out.print(" ");
		            }

		            // Print stars and spaces in between
		            for (int k = 1; k <= (2 * i - 1); k++) {
		                if (k == 1 || k == (2 * i - 1) || i == rows) {
		                    System.out.print("*"); // Print star for borders
		                } else {
		                    System.out.print(" "); // Print space for hollow part
		                }
		            }
		            System.out.println(); // Move to the next line
		        }
		    }
		}


	
