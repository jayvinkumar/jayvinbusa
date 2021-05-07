import java.util.*;
import java.io.*;
public class ReadOnly {
	  public static void main(String[] args) throws IOException
	    {	
	    	File myfile = new File("A:\\java\\seven_may\\java.txt");
	    	
	    	boolean flag = myfile.setReadOnly();	
	    	if (flag==true)
	    	{
	    	   System.out.println("File successfully converted to Read only mode!!");
	    	}
	    	else
	    	{
	    	   System.out.println("Unsuccessful Operation!!");
	    	}
	    }
}
