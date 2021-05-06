import java.util.*;
public class RoundOff {
	public static void main(String args[])
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to round up");
double number=sc.nextDouble();
sc.close();
int newnumber=(int)Math.round(number);
String s=String.valueOf(newnumber);
System.out.println("The number you enter "+number+"  is round of and converted to string and new string is  "+s);

	}
	}
