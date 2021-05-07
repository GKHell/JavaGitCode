import java.io.*;
class BufferedReaderCode{

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i;
		float f;
		String s1,s2;
		char ch;
		System.out.println("\n----------------------------\n");
		
		System.out.print("Enter Integer Value : ");
		i = Integer.parseInt(br.readLine());

		System.out.print("Enter String Value : ");
		s1 = br.readLine();
		
		System.out.print("Enter float Value : ");
		f = Float.parseFloat(br.readLine());
		
		System.out.print("Enter String Value : ");
		s2 = br.readLine();

		System.out.print("Enter Character Value : ");
		ch = (char)br.read();

		System.out.println("\n;-;;-;-;-;-;-;--;-;-;--;-;-;-;-;--;-;-;-;-;-;-\n");
		System.out.println("Integer  : "+i);
		System.out.println("String 1 : "+s1);
		System.out.println("float    : "+f);
		System.out.println("String 2 : "+s2);
		System.out.println("Char     : "+ch);

	}
}