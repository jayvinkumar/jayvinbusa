import java.util.*;
public class CopyVactor {
	public static void main(String[] args) {
		Vector <String> main = new Vector <String> ();
		main.add("ja");
		main.add("y");
		main.add("vin");
		main.add("busa");
		Object copied = main.clone();
		System.out.print("Main Vector: "+main);
		System.out.print("\nCopied Vector: "+copied);
	}

}
