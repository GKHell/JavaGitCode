
import java.util.*;
class StringTokenCode2{
	public static void main(String[] args) {
		
		String s = "I hate programming bcz its just illusion of eyes.";

		// s = "12345x678x90";
		StringTokenizer data = new StringTokenizer(s,"j");

		System.out.println("no  tokens : "+data.countTokens());
		while(data.hasMoreTokens())
		{
			System.out.println("=> "+data.nextToken());
		} 
	}
}