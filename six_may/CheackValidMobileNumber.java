import java.util.*;
import java.util.regex.*;
import java.util.regex.PatternSyntaxException;
public class CheackValidMobileNumber {
	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your Phone number: ");
	      String phone = sc.next();
	      
	      String regex = "\\d{10}";
	    
	      boolean result = phone.matches(regex);
	      if(result) {
	         System.out.println("Given phone number is valid");
	      } else {
	         System.out.println("Given phone number is not valid");
	      }
	   }
}