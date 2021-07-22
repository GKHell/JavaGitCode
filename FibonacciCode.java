import java.util.*;
class Fibonacci{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number : ");
		int n = sc.nextInt();

		int a=-1,b=1;

		while(n>0)
		{
			int c = a+b;
			System.out.println("\t "+c);

			a = b;
			b = c;
			n--;
		}
		/*
			 n(5)            a           b             c(a+b)
			 --------------------------------------------------
			  5				 -1          1              0
			  4               1			 0				1
			  3 			  0          1              1
			  2               1          1              2
			  1               1          2      		3
			 -------------------------------------------------
			  0       
			

		*/

	}
}