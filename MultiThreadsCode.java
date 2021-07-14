
import java.io.*;
class Code{
	public static void main(String[] args) {
		
		MyThread  obj1 = new MyThread("T1");
		Thread t1 = new Thread(obj1);

		MyThread  obj2 = new MyThread("             T2");
		Thread t2 = new Thread(obj2);

		t1.start(); //used to execute run method..
		t2.start();
	}
}
class MyThread extends Thread{

	String name;
	public MyThread(String name)
	{
			this.name = name;
	}
	public void run()
	{

		for(int i=1;i<=10;i++)
		{
			System.out.println(name);

			try{
				Thread.sleep(100);
			}
			catch(Exception e)
			{

			}
		}
	}
}