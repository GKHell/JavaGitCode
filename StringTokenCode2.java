
import java.util.*;
class StringTokenCode2{
	public static void main(String[] args) {
		
		String s = "I hate programming bcz its just illusion of eyes.";

		// s = "12345x678x90";
		StringTokenizer data = new StringTokenizer(s,"just");

		while(data.hasMoreTokens())
		{
			System.out.print(data.nextToken());
		} 
	}
}