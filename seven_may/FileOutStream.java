import java.io.*;
import java.util.*;
public class FileOutStream {
	 public static void main(String[] args) {
	      FileOutputStream fos = null;
	      File file;
	      System.out.println("Enter string to write in file");
	      Scanner sc=new Scanner(System.in);
	      String mycontent = sc.next();
	      try {
	          
		  file = new File("A:\\java\\seven_may\\java.txt");
		  fos = new FileOutputStream(file);

	          
		  if (!file.exists()) {
		     file.createNewFile();
		  }

		  
		  byte[] bytesArray = mycontent.getBytes();

		  fos.write(bytesArray);
		  fos.flush();
		  System.out.println("File Written Successfully");
	       } 
	       catch (IOException ioe) {
		  ioe.printStackTrace();
	       } 
	       finally {
		  try {
		     if (fos != null) 
		     {
			 fos.close();
		     }
	          } 
		  catch (IOException ioe) {
		     System.out.println("Error in closing the Stream");
		  }
	       }
	   }

}
