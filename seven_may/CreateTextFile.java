import java.io.File;  
import java.io.IOException;  
public class CreateTextFile {
	
	public static void main(String[] args)   
	{     
	File file = new File("A:\\java\\seven_may\\java.txt"); 
	boolean result;  
	try   
	{  
	result = file.createNewFile();  
	if(result)      
	{  
	System.out.println("file created "+file.getCanonicalPath());
	}  
	else  
	{  
	System.out.println("File already exist at location: "+file.getCanonicalPath());  
	}  
	}   
	catch (IOException e)   
	{  
	e.printStackTrace();    
	}         
}
}
