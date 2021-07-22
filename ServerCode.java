
import java.net.*;
import java.io.*;
// server  .
class ServerCode{
	public static void main(String[] args) throws Exception {
		
		ServerSocket ss = new ServerSocket(2010);

		System.out.println("waiting........");
		Socket client = ss.accept(); // to connect the client,accept when client program runs
		System.out.println("Connected........");
		//to get data from client
		BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

		String client_msg = br.readLine(); // to get the line from client
		System.out.println("client says... : "+client_msg);
		//	send to client
		
		//
		ss.close();
		client.close();

	}
}