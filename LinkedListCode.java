
import java.util.*;
import java.io.*;
class LinkedListCode{
	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		LinkedList<String> list = new LinkedList<String>();

		list.add("python");
		list.add("java");
		list.add("php");
		list.add("C#");
		list.add("python");
		list.add("perl");
		list.add("HTML");

		list.addFirst("ASP.NET");
		list.addLast("Ruby");

		list.removeFirst();
		list.removeLast();

		Iterator i = list.iterator();
		while(i.hasNext())
		{
			System.out.println("data : "+i.next());
		}

		System.out.println("\n---------------------------\n");	

		System.out.print("Enter index to insert : ");
		int n = Integer.parseInt(br.readLine());
		
		System.out.print("Enter data to insert : ");
		list.add(n,br.readLine());


		System.out.print("Enter index number to remove : ");
		list.remove(Integer.parseInt(br.readLine()));

		////////////////////////////////////
		i = list.iterator();
		System.out.println("\n\n");
		int j = 0;
		while(i.hasNext())
		{
			System.out.println("\t\t"+(j++)+" : "+i.next());
		}		

		System.out.print("Enter the index to display : ");
		System.out.println("element : "+list.get(Integer.parseInt(br.readLine())));

		//////////////////////////////
		System.out.println("\n\n");

		System.out.print("Enter index value to update : ");
		n = Integer.parseInt(br.readLine());

		System.out.println("data at index  "+n+" : "+list.get(n));
		System.out.print("Enter new Data to update : ");
		list.set(n,br.readLine());

		System.out.println("\n\n");
		 i = list.iterator();
		 j = 0;
		while(i.hasNext())
		{
			System.out.println("\t"+(j++)+" : "+i.next());
		}	


		System.out.println("Total no of items : "+list.size());
		System.out.println("     python index : "+list.indexOf("python"));
		System.out.println("python last index : "+list.lastIndexOf("python"));


	}
}