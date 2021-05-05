import java.util.*;
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reverse");
		int num=sc.nextInt();
		int r_num=0;
		while(num>0)
		{
		r_num=(r_num*10)+(num%10);
		num=num/10;
		}
		System.out.println(r_num);
		}
}
