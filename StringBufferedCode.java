class StringBufferedCode{
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("12345");


		s.append("67890"); //attached at last
		s.insert(3,"_"); //on position

		System.out.println("s : "+s);
		s.delete(3,5);
		System.out.println("delete  : "+s);

		s.reverse();
		s.reverse();
		System.out.println("reverse : "+s);

		// Integer n = 999999999;
		String s1 = s.toString();
		System.out.println("toString : "+s1);

		int l = s.length();
		System.out.println("length : "+l);

		 
		s = new StringBuffer("Hello Boss ,here i am for the new Boss.");
		l = s.indexOf("Boss");
		System.out.println("indexOf : "+l);

		l = s.lastIndexOf("Boss");
		System.out.println("LastIndexOf : "+l);

		s.replace(6,11,"Dude123");
		System.out.println("replace: "+s);

		s = new StringBuffer("1234567890");
		s1 = s.substring(5,7);
		System.out.println("subString : "+s1);


		StringBuilder name = new StringBuilder("Deced"); 
		// String name = new String("TENET1");

		String temp1 = name.toString();

		String temp2 = name.reverse().toString(); 
		if (temp1.equalsIgnoreCase(temp2))
		{
			System.out.println("Done...");
		}
		else
		{
			System.out.println("Fails...");

		}

	}
}