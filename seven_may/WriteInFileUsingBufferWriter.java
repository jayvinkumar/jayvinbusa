import java.io.*;
import java.util.Scanner;
public class WriteInFileUsingBufferWriter {
	public static void main(String[] args) {
	      BufferedWriter bw = null;
	      System.out.println("Enter string to write in file");
	      Scanner sc=new Scanner(System.in);
	      try {
	    	  
	    	  
		 String mycontent = sc.next();
	       
		 File file = new File("A:\\java\\seven_may\\java.txt");

		 
		  if (!file.exists()) {
		     file.createNewFile();
		  }

		  FileWriter fw = new FileWriter(file);
		  bw = new BufferedWriter(fw);
		  bw.write(mycontent);
	          System.out.println("File written Successfully");

	      } catch (IOException ioe) {
		   ioe.printStackTrace();
		}
		finally
		{ 
		   try{
		      if(bw!=null)
			 bw.close();
		   }catch(Exception ex){
		       System.out.println("Error in closing the BufferedWriter"+ex);
		    }
		}
	   }
}
