

import java.io.*;
import java.net.*;
class URLClass{
	public static void main(String[] args)throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the url : ");
		String urlString = br.readLine();

		URL url = new URL(urlString);


		System.out.println("protocol : "+url.getProtocol());
		System.out.println("    Host : "+url.getHost());
		System.out.println("    file : "+url.getFile());
		System.out.println("    port : "+url.getPort());
		System.out.println("    path : "+url.getPath());
		System.out.println("  extern : "+url.toExternalForm());

		/*

			8 4 2 1
			---------
			1 1 1 1 => 15
		*/
	}
}