import java.util.*;
class ScannerCode
{
	public static void main(String[] args) {
		int i;
		float f;
		String s1,s2;
		char ch;
		System.out.println("\n-------------------------------------\n");

		Scanner sc = new Scanner(System.in);

		System.out.print("ENter an interger value : ");
		i = sc.nextInt();

		System.out.print("ENter an String value : ");
		s1 = sc.nextLine();
		
		System.out.print("ENter an float value : ");
		f = sc.nextFloat();
		
		System.out.print("ENter an String value : ");
		s2 = sc.nextLine();
		
		System.out.print("ENter an Character value : ");
		ch = sc.next().charAt(0);
		
		System.out.println("\n;-;;-;-;-;-;-;--;-;-;--;-;-;-;-;--;-;-;-;-;-;-\n");
		System.out.println("Integer  : "+i);
		System.out.println("String 1 : "+s1);
		System.out.println("float    : "+f);
		System.out.println("String 2 : "+s2);
		System.out.println("Char     : "+ch);


	}
}