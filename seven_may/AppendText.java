import java.io.*;
import java.util.*;
public class AppendText {
public void appendfilewriter(String co)
{
	 try{
	    	String content = co;
	      
	    	File file =new File("A:\\java\\seven_may\\java.txt");

	    	
	    	if(!file.exists()){
	    	   file.createNewFile();
	    	}

	    	
	    	FileWriter fw = new FileWriter(file,true);
	    	
	    	BufferedWriter bw = new BufferedWriter(fw);
	    	bw.write(content);
	    	
	    	bw.close();

		System.out.println("Data successfully appended at the end of file");

	      }catch(IOException ioe){
	         System.out.println("Exception occurred:");
	    	 ioe.printStackTrace();
	       }
}
public void appendprintwriter(String co)
{
	 try{
         File file =new File("A:\\java\\seven_may\\java.txt");
   	  if(!file.exists()){
   	 	file.createNewFile();
   	  }
   	  FileWriter fw = new FileWriter(file,true);
   	  BufferedWriter bw = new BufferedWriter(fw);
   	  PrintWriter pw = new PrintWriter(bw);
         
   	  pw.println("");
        
   	  pw.println("This is first line");
   	  pw.println("This is the second line");
   	  pw.println("This is third line "+co);
   	  pw.close();

	  System.out.println("Data successfully appended at the end of file");

      }catch(IOException ioe){
   	   System.out.println("Exception occurred:");
   	   ioe.printStackTrace();
     }
}
public static void main(String args[])

{
	AppendText ap=new AppendText();
System.out.println("Enter a string to append");
Scanner sc=new Scanner(System.in);
String s=sc.next();
System.out.println("Enter 1 for append using file input stream"+"\n"+"Enter 2 To append using print");
int i=sc.nextInt();
switch(i)
{
case 1:
	ap.appendfilewriter(s);
	break;
case 2:
	ap.appendprintwriter(s);
	break;
}
}
}
