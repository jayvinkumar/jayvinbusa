import java.util.*;
public class ListToVector {
	public static void main(String[] args) {
		ArrayList <Integer> a1 = new ArrayList <Integer> ();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		Vector<Integer> vector = new Vector<Integer>(a1);
		System.out.println(" Coverted Vector From List: " + vector);
	}

}
