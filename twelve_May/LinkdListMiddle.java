import java.util.LinkedList;
import java.util.Scanner;


public class LinkdListMiddle {
	public static void main(String args[])

	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of element in linklist");
	int number=sc.nextInt();
	 LinkedList <Integer> st=new  LinkedList <Integer>();
	for (int i=1;i<=number;i++)
	{System.out.println("enter "+i+  "  element in link list");
		st.add(sc.nextInt());
	}
	System.out.println("element in linklist is befor Add Element in middle last node"+st);
	int i=number/2;
	System.out.println("Enter element which you want to add midle");
	int j=sc.nextInt();
	  st.add(i, j);

	System.out.println("element in linklist is after removing last node"+st);
	}
	
}
