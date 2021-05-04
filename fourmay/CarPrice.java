import java.util.*;

public class CarPrice {
	int carprice;
	int resellprice;
	String name;
	String model;
	
	CarPrice(int cp,String n,String m)
	{
		carprice=cp;
		name=n;
		model=m;
		
	}
	public void calculate(int buyyear,int sellyear)
	{
		int newcarprice=this.carprice;
		
		if(buyyear > sellyear)
			System.out.println("enter a valid year");
		
		else
			for(int i=0; i<=(sellyear-buyyear); i++)
			
			{
				
				
				newcarprice=newcarprice-(10*newcarprice)/100;
				if(newcarprice<=((this.carprice*20)/100))
				{
					System.out.println("price is lessthen 20% not able to sell");
					System.exit(0); 
				}
				
				
			}
		System.out.println("car price name "+this.name);
		System.out.println("car model"+this.model);
		System.out.println("car purchesd price"+this.carprice);
		
			System.out.println("car price in year  "+sellyear+ "is a " +newcarprice);
	}
	
	public static void main(String []args)
	{
	System.out.println("enter the car price");
	Scanner sc=new Scanner(System.in);
	int cp=sc.nextInt();
	System.out.println("enter the car name");
	String name=sc.next();
	System.out.println("enter the car model");
	String model=sc.next();
	CarPrice c=new CarPrice(cp,name,model);
	System.out.println("enter the year of buying");
	
	int buyyear=sc.nextInt();
System.out.println("enter the year of selling");
	
	int sellyear=sc.nextInt();
	
	c.calculate(buyyear, sellyear);
}}