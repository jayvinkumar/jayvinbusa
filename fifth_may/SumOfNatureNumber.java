import java.util.*;
public class SumOfNatureNumber {
	
	public void sumloop()
	{
		int num, i, sum = 0;  
		
		Scanner sc = new Scanner(System.in);  
		System.out.print("Sum from: ");  
		
		i = sc.nextInt();  
		System.out.print("Sum up to: ");  
	
		num = sc.nextInt();  
		while(i <= num)  
		{  
		
		sum = sum + i;  
		
		i++;  
		}  
		
		System.out.println("Sum of Natural Numbers = " + sum);  
	}
	public void sumnoloop()
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to sum");
		sum=sc.nextInt();
		System.out.println("The sum of first "+sum+"  number is a " +(sum * (sum + 1) / 2));
		
	}
public static void main(String args[])
{
	SumOfNatureNumber so=new SumOfNatureNumber();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1: for find sum of nature number using loop");
	System.out.println("Enter 2: for find sum of nature number without using loop");
	int i=sc.nextInt();
	switch(i)
	{
	case 1:
		so.sumloop();
		
	break;
	case 2:
		so.sumnoloop();
	break;
	}
}
}
