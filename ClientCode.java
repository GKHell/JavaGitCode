
import java.io.*;
import java.net.*;
// client 
class ClientCode{
	public static void main(String[] args)throws Exception {
		
		Socket client = new Socket("localhost",2010);

		DataOutputStream sendToServer = new DataOutputStream(client.getOutputStream());

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter data to sent to the server : ");
		String data = input.readLine();

		sendToServer.writeBytes(data);

		client.close();


	}
}