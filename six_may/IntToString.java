import java.util.*;
public class IntToString {
public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number to convert intger to string");
	int number=sc.nextInt();
	sc.close();
	String s=String.valueOf(number);
	System.out.println("new string value is "+s);
}
}
