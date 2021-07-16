
import java.net.*;
import java.io.*;

class Code2{

	public static void main(String[] args)throws Exception {
	
		Socket me = new Socket("localhost",1056);	//connection done..

		BufferedReader br = new BufferedReader(new InputStreamReader(me.getInputStream()));
		String msg = br.readLine();

		System.out.println("server says ... "+msg);

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no of tickets : ");
		int n = Integer.parseInt(input.readLine());

		PrintStream ps = new PrintStream(me.getOutputStream());
		ps.println(n);

		msg = br.readLine();

		System.out.println("msg : "+msg);

	}
}
