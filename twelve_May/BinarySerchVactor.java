import java.util.*;
public class BinarySerchVactor {
	public static void main(String[] args) {
		
			Vector v = new Vector();
			v.add("j");
			v.add("a");
			v.add("y");
			v.add("v");
			v.add("i");
			Collections.sort(v);
			System.out.println(v);
			int index = Collections.binarySearch(v, "v");
			System.out.println("Element found at : " + index);
		
	}
}
