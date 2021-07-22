import java.util.*;
class Code{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n,i,j,k,c1=0;

		System.out.print("Enter the rows & column : ");
		n = sc.nextInt();

		int a[][] = new int[n][n]; // nxm
		int b[][] = new int[n][n];
		int c[][] = new int[n][n];
		System.out.println("Enter the matrix : ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j] = sc.nextInt();
				// a[i][j] = 2;
			}
		}

		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				b[i][j] = sc.nextInt();
				//b[i][j] = 1;
			}
		}
		////
		int mul=0;
		char ch;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
					mul =0;
					for(k=0;k<n;k++)
					{
						mul = mul + a[i][j]*b[k][j];
					}
					c[i][j] = mul;	
					System.out.print(" "+c[i][j]);
		
			}
			System.out.println();
		}
		// /////
		// System.out.println("\n-------------------------\n\n");

		// for(i=0;i<n;i++)
		// {
		// 	for(j=0;j<n;j++)
		// 	{
		// 			System.out.print("\t "+a[i][j]);		
		// 	}
		// 	System.out.println();
		// }

		// System.out.println("\n-------------------------\n\n");

		// for(i=0;i<n;i++)
		// {
		// 	for(j=0;j<n;j++)
		// 	{
		// 			System.out.print("\t "+b[i][j]);		
		// 	}
		// 	System.out.println();
		// }
		// System.out.println("\n-------------------------\n\n");

		// for(i=0;i<n;i++)
		// {
		// 	for(j=0;j<n;j++)
		// 	{
		// 			System.out.print("\t "+c[i][j]);		
		// 	}
		// 	System.out.println();
		// }	
	}
}