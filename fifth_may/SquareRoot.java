import java.util.*;
public class SquareRoot {
	public static void main(String[] args) {
	      
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter Number: ");         
        double number = sc.nextDouble();
 
	double result;
 
	double squareRoot = number / 2;
 
	do {
		result = squareRoot;
		squareRoot = (result + (number / result)) / 2;
	} while ((result - squareRoot) != 0);
 
	System.out.println("Reult:"+squareRoot);
    }   

}
