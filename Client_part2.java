
import java.io.*;
import java.net.*;
class ClientCode{
	public static void main(String[] args)throws Exception {
		
		Socket client = new Socket("localhost",1022);
		BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));//keyboard input


		BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());

		String  client_msg;
		//////////////////////////////////
		
		String msg_from_server = br.readLine(); //client <- server

		System.out.println("        Server : "+msg_from_server);

		System.out.print("Enter client msg : ");
		client_msg = input.readLine();
		dos.writeBytes(client_msg); // client -> server
		
		//////////////


	}
}