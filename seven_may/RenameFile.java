import java.io.*;
public class RenameFile {
	 public static void main(String[] args)
	    {	
	        
		File oldfile =new File("A:\\java\\seven_may\\java.txt");
	
		File newfile =new File("A:\\java\\seven_may\\java1.txt");
		
	        boolean flag = oldfile.renameTo(newfile);
		if(flag){
		   System.out.println("File renamed successfully");
		}else{
		   System.out.println("Rename operation failed");
		 }
	    }
}
