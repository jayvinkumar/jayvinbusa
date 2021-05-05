import java.util.*;
public class Calculator {
	public static void main(String args[])
    {
	int num1,num2;
        double output=0;

        Scanner sc=new Scanner(System.in);
	System.out.println("Enter a 1: for addition "+"\n"+"2: for substraction" + "\n"+"3 : for multification" + "\n"+"4: for devision");
	int operator=sc.nextInt();
	
	System.out.println("Enter first number");
	num1=sc.nextInt();
	System.out.println("Enter second number");
      num2=sc.nextInt();
        switch(operator)
	{
		case 1:
			output=num1+num2;
			break;
		case 2:
			output=num1-num2;
			break;
		case 3:
			output=num1*num2;
			break;
		case 4:
			output=num1/num2;
			break;
		case '%':
			output=num1%num2;
			break;
		default :
			System.out.println("invalid operation");
			break;
	}
	System.out.println("The Output Is:"+output);
   }
}
