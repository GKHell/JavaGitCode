
import java.util.*;
import java.io.*;
class StackCode{
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<String> list = new Stack<String>();
		int n = 0;
		do{

			System.out.println("\n-------------------");

			System.out.println("\u001B[31m   press 1 for PUSH (1): ");
			System.out.println("    press 2 for POP (2): ");
			System.out.println("   press 3 for peek (3): ");
			System.out.println(" press 4 for search (4): ");
			System.out.println("  press 5 for empty (5): ");
			System.out.println("press 6 for display (6): ");
			System.out.println("   press 7 for exit (7): \u001B[0m");
			System.out.print("      Enter the choice : ");
			n = Integer.parseInt(br.readLine());
			switch(n)
			{
				case 1:
						System.out.print("Enter data : ");
						list.push(br.readLine());
					break;
				case 2:
						System.out.println("Element popped :"+list.pop());
						break;
				case 3:
						System.out.println("  last element : "+list.peek());
						break;
				case 4:
						System.out.print("Enter the data which you want : ");
						String data = br.readLine();
						System.out.println("Search "+data+" in list status : "+list.search(data));
						break;
				case 5 :
						System.out.println("Empty status : "+list.empty());
						break;
				case 6 : 
						Iterator me = list.iterator();
						while(me.hasNext())
						{
							System.out.println("--------> "+me.next());
						}
						break;
				case 7:
						System.out.println("Exit.....");
						System.exit(13);
						break;
				default : 
						System.out.println("Invalid choice........");


			}

		}while(n<=7);	
	}
}