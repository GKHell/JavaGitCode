
import java.io.*;
import java.util.*;
import java.net.*;

class ClientCode{
	public static void main(String[] args)throws Exception {
		
		Socket client = new Socket("localhost",2025);

		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

		System.out.print("Enter file name : ");
		String fileName = input.readLine();
		dos.writeBytes(fileName+"\n");

		PrintStream ps = new PrintStream(new FileOutputStream("NewDownload"+fileName));

		String data;
		
		while((data= br.readLine())!=null)
		{
			System.out.println(data);
			ps.println(data);

		}



	}
}