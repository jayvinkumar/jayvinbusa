class Thread1 extends Thread
{
	public void run ()
	{
		
		{
		System.out.println("Thread 1 is tunning");
	}
	}
}
class Thread2 extends Thread
{
	public void run ()
	{
		
		System.out.println("Thread 2 is tunning");
	
	}
}
class Thread3 extends Thread
{
	public void run ()
	{
	
		{		System.out.println("Thread 3 is tunning");
	}
}
}


public class MultipleThread {
	
	public static void main(String args[])
{
	Thread1 t1=new Thread1();
	Thread2 t2=new Thread2();
	Thread3 t3=new Thread3();
	
Thread to1=new Thread(t1);
Thread to2=new Thread(t2);
Thread to3=new Thread(t3);
to1.start();
to2.start();
to3.start();

}


}
