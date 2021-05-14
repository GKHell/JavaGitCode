class StringMethods
{
	public static void main(String[] args) {
		
		String s1="Hello";
		String s2=" World";

		// 1 .concat 
		String s3 = s1.concat(s2); // s3 = s1+s2
		System.out.println("concat 1: "+s3);

		s3 = s3+s1;
		System.out.println("concat 2: "+s3);

		int n = s1.length();
		System.out.println("length : "+n);
		//---------------------------------------
		char ch = s2.charAt(3);
		System.out.println("charAt : "+ch);

		s1 = "Hello";
		int i = s1.compareTo("hello"); // s1 - str
		System.out.println("compareTo : "+i);

		i = s1.compareToIgnoreCase("hello");
		System.out.println("compareToIgnoreCase : "+i);

		boolean f = s1.equals("hello");
		System.out.println("equals : "+f);

		f = s1.equalsIgnoreCase("hello");
		System.out.println("equalsIgnoreCase : "+f);

		//-----------------------------------
		System.out.println("\n\n");
		s1 = "Here we Go AGaiN ,we are doing with code ;) ";
		f = s1.startsWith("Her");
		System.out.println("startsWith : "+f);

		f = s1.endsWith("iN");
		System.out.println("endsWith : "+f);

		i = s1.indexOf("we");
		System.out.println("indexOf : "+i);

		i = s1.lastIndexOf("we");
		System.out.println("lastIndexOf : "+i);

		String s  = s1.replace('a','ã');
		System.out.println("replace : "+s);

		
		}
}