import java.lang.*;
import java.util.*;
import java.io.*;

class LengthMatchException extends Exception
{
    public LengthMatchException(String s)
    {
       
        super(s);
    }
}
public class LengthException {

	
void lengthcheack(int length,String s) throws LengthMatchException
{
	if(s.length()!=length)
	{
		throw new LengthMatchException("string length not same as given length");
	}
}
public static void main(String args[])
{
	LengthException ln=new LengthException();
	Scanner sc=new Scanner(System.in);
	int length=sc.nextInt();
	String str=sc.next();
	 try
     {
        ln.lengthcheack(length,str);
     }
     catch (LengthMatchException ex)
     {
         System.out.println("Caught the exception");
         System.out.println(ex.getMessage());
     }
}
}
