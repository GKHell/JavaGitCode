
import java.io.*;
import java.net.*;
class IpCode{
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter website : ");
		String webSite = br.readLine();

		InetAddress ip = InetAddress.getByName(webSite); // to get ip by 'website'
		System.out.println(" ip : "+ip);
	}
}