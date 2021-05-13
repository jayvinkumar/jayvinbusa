
 import java.util.*;
	 public class GenericToPrintArray {
	 
		public static <T> void showData(T[] arr){
	 	    for(T t: arr){
	 	       System.out.print(t+" ");
	 	    }
	 	 System.out.println( "You passed Type value"+arr.getClass().getName());
	 	}
	 	public static <T> void FatchData(){
	 		int arr[];
	 		Scanner sc=new Scanner(System.in);
	 		System.out.println( "Enter Any 5 value");
	 	   for(int i=0;i<=5;i++)
	 	   {
	 		   arr[i]=sc.nextInt();
	 	   }
	 	  showData((T)arr);
	 	}
	 public static void main(String []arg)
	 {
	 	
	 
		
	 	
	 }
	 }
