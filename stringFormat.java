class A{
	public static void main(String[] args) {
		
		int n = 34;
		System.out.printf(" decimal : %d in  hexa : %X\n",n,n); //base 16
		System.out.printf(" decimal : %d in octal : %o\n",n,n); //base 8\
		System.out.printf(" %%e : %e \n",1235e4);
		System.out.printf(" %%n : me%nCode\n");
		System.out.printf(" %%b : %B",false);

	}
}
/*	  
42(octal)
 	64 8 1                 //base 8
 	   4 2
	=> 8*4 => 32
	=> 1*2 => 2
	-----------
			 34(decimal)

====================
22(hexa)
	256 16 1          //  base 16
		 2 2
	=> 16*2 => 32
	=> 1*2 =>  2
	-------------
				34(decimal)
*/