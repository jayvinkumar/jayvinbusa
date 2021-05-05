import java.lang.*;
import java.util.*;
public class RandomNumber {
	public static void main(String args[])
	{
	System.out.println("Enter the Number Of random number you want to genrate");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	for(int i=0;i<=number;i++)
	{
		System.out.println(+i+"th random number is "+Math.random());
	}
}
}
