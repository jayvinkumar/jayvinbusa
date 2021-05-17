
class Printnumber implements Runnable
{
	public void run()
	{
		System.out.println("The number from class which implement runable is");
		for (int i=0; i<10; i++)
		{
			
			System.out.println(i);
			System.out.println("runing thread is"+Thread.currentThread().getName());
		}
	}
}
public class RunnableInterface {
	 public static void main(String[] args) {
	Printnumber pn=new Printnumber();
	 
      Thread t1= new Thread(pn);  
      t1.start();  
	 }
}
