

import java.io.*;
class Code{
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MyThread obj = new MyThread();

		Thread t = new Thread(obj);
		t.start();

		// System.in.read(); //

		String data = br.readLine();
		obj.flag = false;

		System.out.println("You just type  : "+data);

	}
}

class MyThread extends Thread{

	int i=0;
	boolean flag = true;
	public void run()
	{

		while(true)
		{		
			System.out.println("say hiiiiiii. "+(++i));

			if(!flag)
				{
					return;
				}
		}
	}
}