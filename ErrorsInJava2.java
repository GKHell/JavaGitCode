
/**
 * 1 : compile time error | syntax error | typing error. | javac
 * 2 : runtime time error | logical error| Exception     | java
 * */
/*
	multiple catch...
*/
import java.util.*;
class ErrorsInJava{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[] = {5,1,0,3,4,5};
		int ans = 0,n;
		double div = 0;
		for(int i:a)
			{
				ans = ans+i;
			}
				System.out.print("Enter the index value : ");
				n = sc.nextInt(); 

				try{
					int x = a[n]; // ArrayIndexOutOfBoundsException only if n>=6
					div = ans/x; // ArithmeticException only if x == 0
				}
				catch(ArithmeticException e)
				{
					System.out.println("\n\tError due to "+e);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("\n\tError due to "+e);
				}
			
			System.out.println("div : "+div);

			System.out.println("Happy Codding....");
	}
}