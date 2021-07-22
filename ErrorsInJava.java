
/**
 * 1 : compile time error | syntax error | typing error. | javac
 * 2 : runtime time error | logical error| Exception     | java
 * */
import java.util.*;
class ErrorsInJava{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[] = {1,2,3,4,5};
		int ans = 0,n;
		double div = 0;
		for(int i:a)
			{
				ans = ans+i;
			}

				System.out.print("Enter the number : ");
				n = sc.nextInt(); 

				try{
					div = ans/n;
				}
				catch(ArithmeticException e)
				{
					System.out.println("Error due to "+e);
				}
			
			System.out.println("div : "+div);

			System.out.println("Happy Codding....");
	}
}