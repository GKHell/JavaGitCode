
import java.io.*;
import java.util.*;
class HS{

		static HashSet<String> list = new HashSet<String>();


	static void showList()
				{
					Iterator i = list.iterator();
					System.out.println("\n----------------\n");
					while(i.hasNext())
						{
							System.out.println("langaues : "+i.next());
						}	
				};

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// list.add("Python 1");
		// list.add("Python 2");
		// list.add("Python 3");
		// list.add("Python 4");
		// list.add("Python 5");
		// list.add("Python 5");
		// list.add("Python 6");
		System.out.print("Enter the size : ");
		int n = Integer.parseInt(br.readLine());

		System.out.println("\nEnter the data : ");
 
		for(int j=0;j<n;j++)
		{
			System.out.print("Enter name : ");
			HS.list.add(br.readLine());
		}

		///////////////////////////
				HS.showList();

		///////

		System.out.print("Enter data to remove : ");
		String s = br.readLine();

		HS.list.remove(s);
		System.out.println("\nafter removing  :");
		HS.showList();


		System.out.print("Enter the element which want to search : ");
		s = br.readLine();
		System.out.println("status : "+HS.list.contains(s));

		System.out.println("status 1 : "+HS.list.isEmpty());
		HS.list.clear();
		System.out.println("status 2 : "+HS.list.isEmpty());

	}
}

