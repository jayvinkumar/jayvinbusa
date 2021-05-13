import java.util.LinkedList;
import java.util.Scanner;


public class RemoveDuplicateFromLinklist {
	public static void main(String args[])

	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of element in linklist");
	int number=sc.nextInt();
	 LinkedList <Integer> st=new  LinkedList <Integer>();
	for (int i=0;i<number;i++)
	{System.out.println("enter "+i+  "  element in link list");
		st.add(sc.nextInt());
	}
	System.out.println("element in linklist is befor Removing duplicate Element "+st);
	
	for (int i=0;i<st.size();i++)
	{
		for (int j=0;j<st.size();j++)
		{
			if(i==j)
			{
				continue;
			}
		if(st.get(i)==st.get(j))
			{
				
				st.remove(j);
			
			
			}
		}
	}
	
	System.out.println("element in linklist is after removing duplicate"+st);
	}
	
}
