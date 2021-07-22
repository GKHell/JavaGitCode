

import java.io.*;
import java.util.*;
class Code{
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Movie ironMan = new Movie(5);

		System.out.print("Enter no of Customers : ");
		int n = Integer.parseInt(br.readLine());

		Thread t[] = new Thread[n];
		int i;
		for(i=0;i<n;i++)
		{
			t[i] = new Thread(ironMan);

			System.out.print("Enter name of person : ");
			t[i].setName(br.readLine());

		} 
		for(i=0;i<n;i++)
		{
			t[i].start();
		}
	}
}
class Movie extends Thread{

	int total;
	int sold = 0;
	int no_of_tickets_needs;
	Scanner sc = new Scanner(System.in);

	public Movie(int n)
	{
		this.total = n;
	}
	public void run()
	{

		synchronized(this)
		{
			if(sold<total)
			{

				System.out.print("\nHello "+Thread.currentThread().getName()+", how many tickets you want : ");
				no_of_tickets_needs = sc.nextInt();
							
					if(no_of_tickets_needs <=2)
					{

						System.out.println("ticket "+no_of_tickets_needs+" is sold to "+Thread.currentThread().getName());
						sold+=no_of_tickets_needs;
					}
					else
					{
						System.out.println(no_of_tickets_needs+" tickets  not allowed for a single customer.");
					}
					try{
						Thread.sleep(10);
					}
					catch(Exception e)
					{

					}
			}
			else
			{
				System.out.println("                 sorry, No more tickets !!! "+Thread.currentThread().getName());
			}
		}
	}
}