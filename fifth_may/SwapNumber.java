
import java.util.*;
public class SwapNumber {
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter The first Number");
	  int Number1=sc.nextInt();
		 System.out.println("Enter The Second Number");
		 int Number2=sc.nextInt();
	  System.out.println("Before Swapping");
	  System.out.println("Number1:"+Number1+" Number2:"+Number2);
	  Number1=Number1^Number2; 
	  Number2=Number1^Number2;
	  Number1=Number1^Number2;
	  System.out.println("After Swapping");
	  System.out.println("Number1:"+Number1+" Number2:"+Number2);
	  
	 }

}
