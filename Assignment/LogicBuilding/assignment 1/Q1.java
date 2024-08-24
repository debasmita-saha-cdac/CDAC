import java.io.* ;
import java.util.* ;

public class Q1 {

public static void main (String[] args) {

System.out.println ("enter a number to check +ve or -ve : ");

Scanner sc = new Scanner (System.in);

int number = sc.nextInt();

System.out.println ("you entered: " + number);


if (number> 0)
	{
		System.out.println ("you entered:" + number + " it is +ve number ");
	}
else
{
		System.out.println ("you entered:" + number + " it is -ve number ");
	}



} 
}