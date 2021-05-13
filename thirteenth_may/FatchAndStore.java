
public class FatchAndStore<T>{
	 private T t;

	   public void store(T t) {
	      this.t = t;
	   }

	   public T fatch() {
	      return t;
	   }

	   public static void main(String[] args) {
		   FatchAndStore<Integer> ifs = new FatchAndStore<Integer>();
		   FatchAndStore<String> sfs = new FatchAndStore<String>();
	    
	      ifs.store(new Integer(10));
	      sfs.store(new String("Hello World"));

	      System.out.println("Integer Value "+ifs.fatch());
	      System.out.println("String Value ," +sfs.fatch());
	   }

}
