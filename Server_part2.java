

import java.net.*;
import java.io.*;
class ServerCode{
	public static void main(String[] args)throws Exception {
		
			ServerSocket ss = new ServerSocket(1022);

			System.out.println("waiting .....");
			Socket client = ss.accept();
			System.out.println("Connection Done...");
			BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));//keyboard input

			// get data from client
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

			//send data to client
			PrintStream send_to_client = new PrintStream(client.getOutputStream());

			String server_msg;

			//////////////////////////////////////////////

			
			System.out.print("Enter Server  msg : ");
			server_msg = input.readLine();

			send_to_client.println(server_msg); //server -> client
			String msg_from_client = br.readLine(); // server <- client

			System.out.println("       client : "+msg_from_client);

			/////////////////////////////////////


	}
}