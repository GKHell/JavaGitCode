
import java.io.*;
import java.net.*;
class Code1{
	public static void main(String[] args) throws Exception{
		
		MyServer server = new MyServer();

		Thread t1 = new Thread(server,"pratik");
		Thread t2 = new Thread(server,"kartik");

		t1.start(); //call run method
		t2.start(); //call run method
	}
}
class MyServer implements Runnable{

	static ServerSocket ss;
	static Socket client;
	static int total = 2;
	static int sold = 0;
	public void run()  
	{

		 
		while(true)
		{

			 
		try{
				ss = new ServerSocket(1056);
						System.out.println("waiting....");
						client = ss.accept();
						System.out.println("connected with "+Thread.currentThread().getName());

		
						PrintStream pr = new PrintStream(client.getOutputStream()); // for data sending
		                pr.println("Hello "+Thread.currentThread().getName());

		                BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		                int x = Integer.parseInt(br.readLine());

		                sold = sold+x;
		                if(sold<total)
		                {
		                	pr.println(x+" tickets has been sold "+Thread.currentThread().getName());
		                }
		                else
		                {
		                	pr.println(x+" not able to sale...");
		                }
		         ss.close();
		         client.close();
		         pr.close();
		      }
		      catch(Exception e)
		      {
		      	// System.out.println("Error......");
		      }
		  }
		
	 
	}

}
