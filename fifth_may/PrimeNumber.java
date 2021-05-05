import java.util.*;
public class PrimeNumber {
	public static void main(String args[])
	{
		int temp;
		boolean isPrime=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to cheak prime or not");
		int number=sc.nextInt();
		if(number==0 || number==1)
		{
			isPrime=false;
		}
		for(int i=2;i<=number/2;i++)
		{
			temp=number%i;
			if(temp==0)
			{
				isPrime=false;
			}
			
		}
		if(isPrime)
		{
			System.out.println("number is prime");
		}
		else
		{System.out.println("number is not prime");
			
		}
	}

}
