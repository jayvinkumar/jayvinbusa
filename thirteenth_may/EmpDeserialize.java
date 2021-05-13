i
import java.io.*;
class Employee implements Serializable {
	 
	private static final long serialVersionUID = 1L;
	public String name;
	   public String address;
	   public int eid;
	  
	}
public class EmpDeserialize {
	public static void main(String[] args) {
		try
		{   
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("A:\\java\\thirteenth_may\\java.txt"));  
		  Employee  e=(Employee)in.readObject();  
		  System.out.println(e.eid+" "+e.name+" "+e.address);    
		  in.close();  
		  }catch(Exception e){
			  System.out.println(e);
			  }  

	}
}
