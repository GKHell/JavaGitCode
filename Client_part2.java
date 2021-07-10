import java.io.*;
import java.net.*;
class ClientCode{
	public static void main(String[] args)throws Exception {
		
		Socket client = new Socket("localhost",2024);
		BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));//keyboard input


		BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());

		String  client_msg;
		//////////////////////////////////
		while(true)
		{
			String msg_from_server = br.readLine(); //client <- server

			System.out.println("        Server : "+msg_from_server);

			System.out.print("Enter client msg : ");
			client_msg = input.readLine();
			dos.writeBytes(client_msg+"\n"); // client -> server

			if(client_msg.equals("exit"))
			{
				break;
			}
		}
		//////////////


	}
}