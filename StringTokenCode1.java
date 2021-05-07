import java.io.*;
import java.util.*;
class StringTokenCode {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String data;

		System.out.print("Enter data(name,age,subject,Code) : ");
		data = br.readLine();

		System.out.println("data : "+data);

		StringTokenizer str = new StringTokenizer(data,"+");
		
		while(str.hasMoreTokens())
		{
			String s = str.nextToken();
			System.out.println(" => "+s);
		}
	}
}