
class Code{
	public static void main(String[] args) {
		
		//  // numbers --------------------------------
		// 

		// Integer i = 127;
		// Byte b = i.byteValue();
		// Long l = i.longValue();

		// System.out.println("data : "+b);
		// System.out.println("data : "+l);

		// // character ---------------------------
		 
		// Character ch = 'a';
		// Character ch1 = 'a';
		// Character ch2 = 'b';

		// System.out.println(ch1+" == "+ch2+" : "+(ch1==ch2));
		// System.out.println(ch1+" != "+ch2+" : "+(ch1!=ch2));

		// String s = ch.toString();
		// s = ""+ch;
		// System.out.println("String : "+ch);

		// char ch3 = Character.valueOf('A'); // unboxing 
		// ch = '\t';
		// System.out.println(" Character.isDigit() : "+Character.isDigit(ch));
		// System.out.println("Character.isLetter() : "+Character.isLetter(ch));

		// // Byte ------------------------------
		// Byte b1 = Byte.parseByte("12");
		// Byte b2 = Byte.parseByte("12");


		// System.out.println("compareTo : "+b1.compareTo(b2));
		// System.out.println("       == : "+(b1==b2));

		// String s = ""+b1;
		// System.out.println("   String : "+s);

		// Byte b = Byte.valueOf((byte)12);

		// // Integer  : --------------------------
		
		Integer i = 17;

		System.out.println("   toHexString: "+Integer.toHexString(i));	
		System.out.println("toBinaryString: "+Integer.toBinaryString(i));
		System.out.println("toOcatalString: "+Integer.toOctalString(i));	

		//octal to int
	 // 64 8 1
		// 2 1
	 //   ---- 
	 //   16 1= 17

	}
}