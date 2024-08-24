import java.io.* ;
import java.util.* ;

public class Q3 {

public static void main (String[] args) {

System.out.println ("enter a number to check even or odd : ");

Scanner sc = new Scanner (System.in);

int number = sc.nextInt();

System.out.println ("you entered: " + number);


if (number%2 == 0)
	{
		System.out.println ("you entered:" + number + " it is even number ");
	}
else
{
		System.out.println ("you entered:" + number + " it is odd number ");
	}



} 
}