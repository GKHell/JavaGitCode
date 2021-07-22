

class Code{
	public static void main(String[] args) {
		
		Movie ironMan = new Movie();

		Thread p1 = new Thread(ironMan);
		Thread p2 = new Thread(ironMan);
		Thread p3 = new Thread(ironMan);
		Thread p4 = new Thread(ironMan);
		Thread p5 = new Thread(ironMan);

		p1.setName("Brijesh");
		p2.setName("Patric");
		p3.setName("Kartik");
		p4.setName("Raju");
		p5.setName("Aakash sir");

		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
	}
}
class Movie extends Thread{

	int total = 3;
	int sold = 0;

	public void run()
	{

		if(sold<total)
		{
				System.out.println(sold+" ticket 1 is sold to "+Thread.currentThread().getName());
				sold++;
		}
		else
		{
			System.out.println("sorry No more tickets !!! "+Thread.currentThread().getName());
		}
	}
}