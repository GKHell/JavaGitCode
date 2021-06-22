
import java.util.*;
import java.io.*;
class HashMapFullCode{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer,String> data = new HashMap<Integer,String>();


		data.put(1,"Python");
		data.put(2,"Java");

		System.out.print("Enter no of Student : ");
		int n = Integer.parseInt(br.readLine());

		for(int i=0;i<n;i++)
		{
			System.out.println("\nData of STudent "+(i+1));
			System.out.print("Enter rollno : ");
			int rollno = Integer.parseInt(br.readLine());

			System.out.print("Enter name : ");
			String name = br.readLine();

			// code of HashMap 
			data.put(rollno,name);
		}


		data.put(2,"php");
		Set roll_no = data.keySet(); // getting all keys
		Iterator i = roll_no.iterator();
		System.out.println("\n-----------------------\n");
		while(i.hasNext())
		{
			Object r =i.next();
			System.out.println("rollno : "+r+"\t name : "+data.get(r));
		}

		// System.out.println("\n\n\n-------------------");
		// System.out.println(data);

		for(String name:data.values()) // getting all values...
		{
			System.out.println("\nname  : "+name);
		}


		/////////////////////// 

		System.out.println("data 1 : "+data.isEmpty());
		data.clear();
		System.out.println("data 2 : "+data.isEmpty());

	}

}