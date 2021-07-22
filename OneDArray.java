
import java.util.*; //for scanner
class OneDArray
{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		n = sc.nextInt();

		int a[] = new int[n];

		System.out.println("enter the array : \n");
		for(int i=0;i<n;i++)
		{
			System.out.print(" a[ "+ i+" ] = ");
			a[i] = sc.nextInt();
		}
		///////////////
		System.out.println("##########@@@@@@@@@############@#");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" a[ "+ i+" ] = "+a[i]);
		}
	}
} 