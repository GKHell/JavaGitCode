
import java.util.*;
class HashSetCode{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		HashSet<String> languages = new HashSet<String>();

		// languages.add("python 1");
		// languages.add("python 2");
		// languages.add("python 3");
		// languages.add("python 4");
		// languages.add("python 5");
		// languages.add("python 5");
		// languages.add("python 6");

		System.out.print("Enter the size : ");
		int n = sc.nextInt();

		sc.nextLine();	
		// languages.remove("python 3");
		String s;
		for(int j=0;j<n;j++)
		{
			System.out.print("Enter language : ");
			s = sc.nextLine();
			languages.add(s);
		}
		Iterator i = languages.iterator();

		while(i.hasNext())
		{
			System.out.println("languages : "+i.next());
		}

	}
}