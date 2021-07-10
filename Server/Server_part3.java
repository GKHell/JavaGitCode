
import java.net.*;
import java.io.*;
import java.util.*;
// server 
class ServerCode{
	public static void main(String[] args)throws Exception {
		
		ServerSocket ss = new ServerSocket(2025); 

		System.out.println("waiting.......");
		Socket client = ss.accept(); // connection done
		System.out.println("connect.......");

		BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

		PrintStream ps = new PrintStream(client.getOutputStream());
		String fileName = br.readLine();

		File file = new File(fileName);

		if(file.exists())
		{
			// code module for sending file
			System.out.println("wait file is loading.....");
			// FileInputStream f = new FileInputStream(fileName);
			BufferedReader fileCode = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));


			String data;
			while((data = fileCode.readLine())!=null)
				ps.println(data);


		}
		else
		{
			System.out.println("File is not available at the movement.");
		}


	}
}