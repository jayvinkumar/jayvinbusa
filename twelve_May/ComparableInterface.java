import java.util.*;
public class ComparableInterface {
	public static void main(String[] args) 
	{
	   Emp em1 = new Emp("vin", 20, 15);
	   Emp em2 = new Emp("loc", 15, 16);
	   Emp em3 = new Emp("bal", 25, 15);
	   
	   ArrayList<Emp> al = new ArrayList<Emp>();
	  
	   al.add(em1);
	   al.add(em2);
	   al.add(em3);
	 
	  System.out.println("Displaying Emp's name sorted by rollnos:");
	  Collections.sort(al); 
	  for(Emp em:al){  
	       System.out.println(em.name+" "+em.rollno+" "+em.age);  
	   }     
	  }
}
