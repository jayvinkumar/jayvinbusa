import java.util.*;
public class MaximumElement {
	public static <T extends Comparable<T>> T maximalelement (List<T> list, int from, int to) {
        T max = list.get(from);
        for (int i = from + 1; i < to; i++) {
            T el = list.get(i);
            if (el.compareTo(max) > 0) {
                max = el;
            }
        }
        return max;
    }
	
	public static void main(String[] args) {
		ArrayList <Integer> al = new ArrayList <Integer> ();
		al.add(50);
		al.add(100);
		al.add(30);
		al.add(11);
		al.add(58);
		System.out.print("Maximal Element :"+maximalelement(al,0,3));
	}

}
