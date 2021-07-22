
import java.util.*;
import java.io.*;
public class StringSortCode {
	public static void main(String[] args) throws Exception{

			int i;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// System.out.println("Hello WOrld...");

			System.out.print("Enter no of Words : ");
			int n = Integer.parseInt(br.readLine());

			String words[] = new String[n];
			System.out.println("Enter those words : ");
			for(i=0;i<n;i++)
			{
				System.out.print("words [ "+i+"] = ");
				words[i] = br.readLine();
			}

			Arrays.sort(words,new Ascending());

			System.out.println("---------------------Code-----------------");
			for(i=0;i<n;i++)
			{
				System.out.println(words[i]);
		
			}

	}
}

class Ascending implements Comparator<String>{

	// i have to must redefine method which belongs to COmparator..	
	public int compare(String i1,String i2)
	{
		return i1.compareTo(i2);
		/*
			i1 == i2 returns 0
			 i1 > i2 returns 1
			 i1 < i2 return -1
		*/
	}
}