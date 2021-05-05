	import java.util.*;
public class SunyNumber {
	


	
	static boolean isPerfectSquare(double x)
	{

		double sr = Math.sqrt(x);

		
		return((sr - Math.floor(sr)) == 0);
	}

	static void checkSunnyNumber(int N)
	{

		if (isPerfectSquare(N + 1))
		{
			System.out.println("Yes Number Is Sunny");
		}

		
		else
		{
			System.out.println("No Number Not Sunny");
		}
	}

	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to cheak");
		int N = sc.nextInt();

		checkSunnyNumber(N);
	}
	}




