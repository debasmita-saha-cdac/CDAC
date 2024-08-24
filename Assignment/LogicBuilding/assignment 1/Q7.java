import java.io.* ;
import java.util.* ;

public class Q7 {

public static void main (String[] args) {

Scanner sc1 = new Scanner (System.in);
Scanner sc2 = new Scanner (System.in);
Scanner sc3 = new Scanner (System.in);

System.out.println ("enter n1: ");
int n1 = sc1.nextInt();

System.out.println ("enter n2 : ");
int n2 = sc2.nextInt();

System.out.println ("enter n3 : ");
int n3 = sc3.nextInt();

//ternarry


int number = (n1>n2)? n1 : (n2>n3) ? n2 : n3 ;

System.out.println ("The largest number is = " + number);


} 
}