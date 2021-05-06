import java.util.Scanner;
import java.util.regex.*;
import java.util.*;
public class GetFirstLetter {
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
    System.out.println("Enter the string");
   String n = s.next();
   Pattern p = Pattern.compile("\\b[a-zA-Z]");
   Matcher m1 = p.matcher(n);
   System.out.println("First letter of each word from string \"" + n + "\" : ");
   while (m1.find())
       System.out.print(m1.group());
}
}