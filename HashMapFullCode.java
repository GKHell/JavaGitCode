
import java.util.*;
import java.io.*;
class HashMapFullCode{
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer,String> data = new HashMap<Integer,String>();


		System.out.print("Enter no of Student : ");
		int n = Integer.parseInt(br.readLine());

		for(int i=0;i<n;i++)
		{
			System.out.println("\nData of STudent ",i+1);
			System.out.print("Enter rollno : ");
			int rollno = Integer.parseInt(br.readLine());

			System.out.print("Enter name : ");
			String name = br.readLine();

			// code of HashMap 
			data.put(rollno,name);
		}



		System.out.println("\n\n\n-------------------");
		System.out.println(data)

	}
}