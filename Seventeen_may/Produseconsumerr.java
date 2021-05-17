
class A
{
	int i; 
	boolean valueset=false;
public void put(int i)
{ 
	while(valueset)
{
	try{wait();}catch(Exception E){}
	notify();
}	
this.i=i;
	System.out.println("put:"+i);
}
public void get(){
while(!valueset)
{
	try{wait();}catch(Exception E){}
	notify();
}
System.out.println("get:"+i);
}


}
class Producer implements Runnable
{
	A a;
	Producer(A a)
	{
		this.a=a;
		Thread t1=new Thread(this."Producer");
		t1.start();
		
	}
	public void run()
	{ int i=0;
		while(true)
		{
			a.put(i);
			i++;
			try{Thread.sleep(1);}catch(Exception E){}
		}
		
	}
}
class Cunsumer implements Runnable
{
	A a;
	Cunsumer(A a)
	{
		this.a=a;
		Thread t1=new Thread(this."Cunsumer");
	}
	public void run()
	{ 
	while(true)
		{
			a.get();
			
			try{Thread.sleep(1);}catch(Exception E){}
		}
		
	}
}
public class Produseconsumerr {
	public static void main(String arg[]) throws Exception
	{
	A a=new A();
	Producer p=new Producer(a);
	Cunsumer c=new Cunsumer(a);
	
	
	}
}
