import java.io.*;
public class ReadFileBufferreader {
	public static void main(String[] args) {
   
	       try{	
	    	      BufferedReader   br = new BufferedReader(new FileReader("A:\\java\\seven_may\\java.txt"));		

	          
		   System.out.println("Reading the file using buffer reader method:");
		   String contentLine = br.readLine();
		   while (contentLine != null) {
		      System.out.println(contentLine);
		      contentLine = br.readLine();
		   }
	       }
		   catch (IOException ioe) 
	       {
		   ioe.printStackTrace();
	       } 
	}
	
}