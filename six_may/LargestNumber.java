import java.util.*;
public class LargestNumber {
	public static int getThirdLargest(int[] a, int total)
	{  
	int temp;  
	for (int i = 0; i < total; i++)   
	{  
	for (int j = i + 1; j < total; j++)   
	{  
	if (a[i] > a[j])   
	{  
	temp = a[i];  
	a[i] = a[j];  
	a[j] = temp;  
	}  
	}  
	}  
	return a[total-3];  
	}  
	public static void main(String args[]){  
		int Size,temp;
Scanner sc=new Scanner(System.in);
		 
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
	System.out.println("Third Largest: "+getThirdLargest(a,Size));  
	  
	}

}
