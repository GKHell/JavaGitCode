
import java.util.*;
class StackCode{
	public static void main(String[] args) {
		
		Stack<String> list = new Stack<String>();

		list.push("Python 1");
		list.push("Python 2");
		list.push("Python 3");
		list.push("Python 4");
		list.push("Python 5");
		list.push("Python 6");

		// System.out.println("stack : \n"+list);
		
		for(String i : list)
			System.out.println("data : "+i);
		System.out.println("\n----------------------");
		
		list.pop(); // 6 has been deleted
		
		for(String i : list)
			System.out.println("data : "+i);

		System.out.println("last element  : "+list.peek());
		System.out.println("        empty : "+list.empty());
		System.out.println("       Search : "+list.search("Python 3"));

	}
}