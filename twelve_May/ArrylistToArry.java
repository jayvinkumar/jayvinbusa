import java.util.s*;
public class ArrylistToArry {

	public static void main(String[] args) {
		ArrayList <Integer> a1 = new ArrayList <Integer> ();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		Object arr[] = a1.toArray();
		System.out.print("Converted Array From ArrayList: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		List<Object> a2 = Arrays.asList(arr);
		System.out.print("\nConverted ArrayList From Array: "+a2);
	}

}
