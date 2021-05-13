import java.io.*;
class Employee implements Serializable {
	 
	private static final long serialVersionUID = 1L;
	public String name="emp";
	   public String address="rajkot";
	   public int eid=5;
	  
	}
public class EmpSerialize {

	
	public static void main(String arg[])
	{
		Employee emp=new Employee();
		File file = new File("A:\\java\\thirteenth_may\\java.txt"); 
		 try {
			FileOutputStream fos =new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(emp);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 
	}
}
