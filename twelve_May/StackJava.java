import java.util.*;
public class StackJava {
public static void main(String args[])

{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of element in stack");
int number=sc.nextInt();
Stack <Integer> st=new Stack <Integer>();
for (int i=0;i<=number;i++)
{
	st.push(i);
}
System.out.println("element in stack is "+st);
}
}
