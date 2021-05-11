import java.util.*;
class Code{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n,m,i,j,c=0;

		System.out.print("Enter the rows : ");
		n = sc.nextInt();

		System.out.print("Enter the columns : ");
		m = sc.nextInt();

		int a[][] = new int[n][m]; // nxm
		System.out.println("Enter the matrix : ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				// a[i][j] = sc.nextInt();
				a[i][j] = ++c;
			}
		}
		System.out.println("\n-------------------------\n\n");

		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
					System.out.print("\t "+a[i][j]);		
			}
			System.out.println();
		}
			
	}
}