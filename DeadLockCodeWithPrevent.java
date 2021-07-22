
import java.io.*;
import java.util.*;
class Code{
	public static void main(String[] args) {
		
		String p1 = "kartik";
		String p2 = "pratik";

		BookMovie jeeneNaiDunga = new BookMovie(p1,p2);
		CancelMovie party = new CancelMovie(p1,p2);

		Thread t1 = new Thread(jeeneNaiDunga);
		Thread t2 = new Thread(party);

		t1.start();
		t2.start();

	}
}

class BookMovie extends Thread{

	//p1 : want to watch movie
	//p2 : want to cancal movie..
	String p1,p2;

	public BookMovie(String p1,String p2)
	{
		this.p1 = p1;
		this.p2 = p2;
	}
	public void run()
	{
		synchronized(p1)
		{
			System.out.println(p1+ " want to watch movie... "+"BookMovie");
			try{
				Thread.sleep(100);
			}
			catch(Exception e)
			{

			}

			synchronized(p2)
			{
				System.out.println(p2+" want to cancel movie..."+"BookMovie");
				try{
					Thread.sleep(100);
				}
				catch(Exception e)
				{

				}
			}
		}
	}
}
class CancelMovie extends Thread{

	String p1,p2;


	public CancelMovie(String p1,String p2)
	{
		this.p1 = p1;
		this.p2 = p2;
	}

	public void run()
	{
		synchronized (p1)
		{
			System.out.println(p1+" want to watch movie...."+"CancelMovie");
			try{
				Thread.sleep(100);
			}
			catch(Exception e)
			{

			}

			synchronized (p2)
			{
				System.out.println(p2+" want to cancel movie..."+"CancelMovie");
				try{
					Thread.sleep(100);
				}
				catch(Exception e)
				{

				}

			}
		}
	}
}