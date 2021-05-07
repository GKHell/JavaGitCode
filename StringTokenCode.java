import java.io.*;
import java.util.*;
class StringTokenCode {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String data;

		System.out.print("Enter data(name,age,subject,Code) : ");
		data = br.readLine();

		System.out.println("data : "+data);

		StringTokenizer str = new StringTokenizer(data);
		String s1 = str.nextToken();
		String s2 = str.nextToken();
		String s3 = str.nextToken();
		String s4 = str.nextToken();

		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		System.out.println("s4 : "+s4);


	}
}