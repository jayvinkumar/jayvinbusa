import java.util.*;
public class FactorialNumber {
public static void main(String args[])
{
	double fact=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The number to find factoriral");
	double number=sc.nextInt();
	fact=number;
	
	for(double i=number-1; i>=1; i--)
	{
		fact=fact*i;
	
	}
	System.out.println("Factorial of number" +number+ "! is a " +fact);
}
}
