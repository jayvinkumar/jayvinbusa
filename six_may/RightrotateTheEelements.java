import java.util.*;
public class RightrotateTheEelements {
	public static void main(String[] args) 
	{    
		Scanner sc=new Scanner(System.in);
		
		int Size;

	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (int i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   
		
		System.out.print(" Please Enter Number of rotation : ");
	int n = sc.nextInt();    
	System.out.println("Original array: ");    
	for (int j = 0; j < a.length; j++) 
	{     
	System.out.print(a[j] + " ");     
	}      
	for(int k = 0; k < n; k++)
	{    
	int j, last;    
	last = a[a.length-1];    
	for(j = a.length-1; j > 0; j--)
	{    
	a[j] = a[j-1];    
	}    
	a[0] = last;    
	}    
	System.out.println();    
	System.out.println("Array after right rotation: ");    
	for(int i = 0; i< a.length; i++)
	{    
	System.out.print(a[i] + " ");    
	}    
	}    
	}   



