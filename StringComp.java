import java.util.*;
// equals vs ==
class StringComp{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter s1 : ");
		String s1 = sc.nextLine();
	
		System.out.print("Enter s2 : ");
		String s2 = sc.nextLine();

	
		if(s1==s2)
		{
			System.out.println("phase 1"+s1+" == "+s2+" = "+true);
		}

		// s1 = "Hello";
		// s2 = "Hello";
		
		if(s1==s2)
		{
			System.out.println("phase 2"+s1+" == "+s2+" = "+true);
		}	
		//////////////////////

		s1 = "Python";
		s2 = " Hello";
		s1 = s1+s2;	

		System.out.println("s1 : "+s1);
		
	}
}