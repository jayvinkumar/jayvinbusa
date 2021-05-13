import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;
public class RemoveLastLinkdlist {
	
	
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
		System.out.println("element in linklist is befor removing last node"+st);
		st.removeLast();

		System.out.println("element in linklist is after removing last node"+st);
		}
		
		}

