import java.util.*;
import java.util.Date;
public class Age {

	public static int getAge(Date dateOfBirth) {
	    Calendar today = Calendar.getInstance();
	    Calendar birthDate = Calendar.getInstance();
	    birthDate.setTime(dateOfBirth);
	    if (birthDate.after(today)) {
	        throw new IllegalArgumentException("You don't exist yet");
	    }
	    int todayYear = today.get(Calendar.YEAR);
	    int birthDateYear = birthDate.get(Calendar.YEAR);
	    int todayDayOfYear = today.get(Calendar.DAY_OF_YEAR);
	    int birthDateDayOfYear = birthDate.get(Calendar.DAY_OF_YEAR);
	    int todayMonth = today.get(Calendar.MONTH);
	    int birthDateMonth = birthDate.get(Calendar.MONTH);
	    int todayDayOfMonth = today.get(Calendar.DAY_OF_MONTH);
	    int birthDateDayOfMonth = birthDate.get(Calendar.DAY_OF_MONTH);
	    int age = todayYear - birthDateYear;

	   
	    if ((birthDateDayOfYear - todayDayOfYear > 3) || (birthDateMonth > todayMonth)){
	        age--;
	    
	    
	    } else if ((birthDateMonth == todayMonth) && (birthDateDayOfMonth > todayDayOfMonth)){
	        age--;
	    }
	    return age;
	}
	public static void main(String args[]){
	    Calendar birthday = Calendar.getInstance();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter birth day");
	   int day=sc.nextInt();
	    System.out.println("enter birth month");
		   int month=sc.nextInt();
	    System.out.println("enter birth year");
		   int year=sc.nextInt();
	    birthday.set(year, month, day);
	    System.out.println("age: " + getAge(birthday.getTime()));  
	}
}
