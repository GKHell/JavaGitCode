
import java.util.*;
class HashMapCode{
	public static void main(String[] args) {
		
		HashMap<String,String> list = new HashMap<String,String>();

		list.put("name","Gk");
		list.put("A","python");
		list.put("code","G342K");
		list.put("me","123");


		System.out.print("data : \n"+list);


		System.out.print("\n\nvalue : "+list.get("code"));
		System.out.print("\nvalue : "+list.get("A"));

	}
}