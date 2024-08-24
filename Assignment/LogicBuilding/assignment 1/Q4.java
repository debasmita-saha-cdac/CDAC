import java.io.* ;
import java.util.* ;

public class Q4 {

public static void main (String[] args) {

System.out.println ("enter time : ");

Scanner sc = new Scanner (System.in);

int number = sc.nextInt();

// System.out.println ("you entered: ");


if (number>=5 && number<=12)
	{
		System.out.println (" good morning ");
	}
else
{
		System.out.println ("you entered:" + number + " is not morning");
	}



} 
}