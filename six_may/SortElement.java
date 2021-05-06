import java.util.Scanner;


public class SortElement {
public void desending()
{
	Scanner sc=new Scanner(System.in);
	
	int Size,temp;

 
	System.out.print(" Please Enter Number of elements in an array : ");
	Size = sc.nextInt();	
	
	int [] a = new int[Size];
	
	
	System.out.print(" Please Enter " + Size + " elements of an Array  : ");
	for (int i = 0; i < Size; i++)
	{
		a[i] = sc.nextInt();
	}   
	
	
System.out.println("Original array: ");    
for (int j = 0; j < a.length; j++) 
{     
System.out.print(a[j] + " ");     
}
for (int i = 0; i < a.length; i++) 
{     
for (int j = i+1; j < a.length; j++) 
{     
if(a[i] < a[j]) 
{    
temp = a[i];    
a[i] = a[j];    
a[j] = temp;    
}     
}     
}    
System.out.println();    
System.out.println("Elements of array sorted in descending order: ");    
for (int i = 0; i < a.length; i++) 
{     
System.out.print(a[i] + " ");    
}    
}



public static void main(String args[])
{
	SortElement st=new SortElement();	
	
	
		st.desending();
		
	
	
	
}
}
