import java.util.Scanner;
import java.lang.*;

public class StringRotationTo {
	
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string");
		String s1 = sc.next();
		 System.out.println("Enter the Aother string");
        String s2 = sc.next();
 
       
 
        if(s1.length() != s2.length())
        {
            System.out.println("s2 is not rotated version of s1");
        }
        else
        {
           
 
            String s3 = s1 + s1;
 
           
 
            if(s3.contains(s2))
            {
                System.out.println("s2 is a rotated version of s1");
            }
            else
            {
                System.out.println("s2 is not rotated version of s1");
            }
        }
    }

}
