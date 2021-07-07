
import java.net.*;
import java.io.*;
class FindMyIp{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter website : ");
		String web = br.readLine();

		InetAddress ip = InetAddress.getByName(web);

		System.out.println("web "+web+"\t ip "+ip);
	}
}