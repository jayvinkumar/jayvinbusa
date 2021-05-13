import java.util.*;
public class FindMinMaxList {

	public static void main(String[] args) {
		List <Integer> l1 = new ArrayList <Integer> ();
		l1.add(1);
		l1.add(5);
		l1.add(50);
		l1.add(7);
		l1.add(4);
		l1.add(9);
		l1.add(0);
		Collections.sort(l1);
		int min = l1.get(0);
		int max = l1.get(l1.size()-1);
		System.out.print("ArrayList Is: "+l1);
		System.out.print("\nMaximum Number Is: "+max);
		System.out.print("\nMinimum Number Is: "+min);
	}


}
