import java.util.*;
public class ReverseStringStack {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your string to revers");
	Stack <Character> st=new Stack<Character>();
	String s=sc.next();
	sc.close();
	boolean re=st.empty();
System.out.println("Stack is empty?"+re);
	for(int i=0;i<s.length();i++)
	{
		st.push(s.charAt(i));
	}
	System.out.println("Reverse String is");
	while(!st.empty())
	{
		System.out.print(st.pop());
	}
	System.out.println("\n Stack is empty?"+re);
}


}

