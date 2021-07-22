class StringMethods
{
	public static void main(String[] args) {
		
		String s1="HeLLo";
		String s2=" WoRlD";
		String s3,s;

		///1 .concat 
		s3 = s1.concat(s2); // s3 = s1+s2
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

		s  = s1.replace('a','ã');
		System.out.println("replace : "+s);

		s3 = s1+s2;
		System.out.println("s3 : "+s3);
	 	s = s3.substring(4); //way 1
		System.out.println("substring : "+s);

		s = s3.substring(4,7); //way 2
		System.out.println("substring : "+s);

		s = s3.toLowerCase();
		System.out.println("toLowerCase : "+s);

		s = s3.toUpperCase();
		System.out.println("toUpperCase : "+s);
		
		s3 = " 12345 ";
		int len = s3.length();
		System.out.println("length s3: "+len);

		s = s3.trim();

		len = s.length();
		System.out.println("length s: "+len);

		
		s3 = "HelloWorld";
		char arr[]=new char[10]; 
		//          i1,i2   ,i3
			/*
				i1 is starting point string
				i2 is ending poing string 
				i3 is position point for storing data for arr
			*/ 
		s3.getChars(3,7,arr,2);

		for (int j =0;j<10;j++)
		{
			System.out.println(j+" => "+arr[j]);
		}

		s3 = "My Name Is Khan";

		String s4[] = s3.split("a");

		for(String x:s4)
		{
			System.out.println(" - "+x);
		}		

	}
}