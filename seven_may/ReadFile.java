import java.io.*;
public class ReadFile {
	 public static void main(String args[]){    
		  try{    
		    FileInputStream fin=new FileInputStream("A:\\java\\seven_may\\java.txt");    
		    BufferedInputStream bin=new BufferedInputStream(fin);    
		    int i;    
		    while((i=bin.read())!=-1){    
		     System.out.print((char)i);    
		    }    
		    bin.close();    
		    fin.close();    
		  }catch(Exception e){System.out.println(e);}    
		 }    
}
