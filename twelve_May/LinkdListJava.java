import java.util.*;
public class LinkdListJava {
	public static void main(String args[])

	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements in linklist");
	int number=sc.nextInt();
	 LinkedList <Integer> st=new  LinkedList <Integer>();
	for (int i=0;i<=number;i++)
	{System.out.println("enter "+i+  "  element in link list");
		st.add(sc.nextInt());
	}
	System.out.println("element in linklist is "+st);
	}
	}

