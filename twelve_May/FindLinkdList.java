import java.util.LinkedList;
import java.util.Scanner;


public class FindLinkdList {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in linklist");
		int number=sc.nextInt();
		 LinkedList <Integer> st=new  LinkedList <Integer>();
		for (int i=0;i<number;i++)
		{System.out.println("enter "+i+  "  element in link list");
			st.add(sc.nextInt());
		}
		System.out.println("element Element To find");
		int element=sc.nextInt();
		for (int i=0;i<st.size();i++)
		{
			if(st.get(i)==element)
			{
				System.out.println("element in you find "+element+" in linklist is at index "+i);
			}
		}
		
		
		}
}
