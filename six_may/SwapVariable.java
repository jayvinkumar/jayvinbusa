import java.io.*;
import java.util.*;
public class SwapVariable {
	 public static void main(String args[]) throws IOException{ 
		 {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter the first string");
				String str1=sc.next(); 
				 System.out.println("Enter the Second string");
				String str2=sc.next(); 
				System.out.println("before swapping\nstr1 = "+str1); 
				System.out.println("str2 = "+str2); 
				str1=str2+str1; 
				str2=str1.replaceAll(str2,""); 
				str1=str1.replaceAll(str2,""); 
				System.out.println("after swapping\nstr1 = "+str1); 
				System.out.println("str2 = "+str2); 
			} 
	 }
}
