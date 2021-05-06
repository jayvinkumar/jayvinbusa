import java.util.*;

public class ArrayCopy {

	public static void main(String[] args) 
	{
		int Size, i;
		Scanner sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		int [] b = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   
		
		for (i = 0; i < Size; i++)
		{
			b[i] = a[i];
		} 
		
		System.out.println("\n Elements in b[] Array after Copying are");
		for (i = 0; i < Size; i++)
		{
			System.out.println(" Element at b["+ i +"] = " + b[i]);
		}
	}
}
