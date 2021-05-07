import java.io.*;
public class DeleteFile {
	public static void main(String[] args)
	   {	
	      try{
	       
	    	 File file = new File("A:\\java\\seven_may\\java.txt");
	         
	    	 if(file.delete()){
	    	    System.out.println(file.getName() + " is deleted!");
	         }else{
	    	    System.out.println("Delete failed: File didn't delete");
	    	  }
	       }catch(Exception e){
	           System.out.println("Exception occurred");
	    	   e.printStackTrace();
	    	}
	    }
}
