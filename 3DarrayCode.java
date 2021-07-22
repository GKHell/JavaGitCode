import java.util.*;
class A{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of Table : ");
		int t = sc.nextInt();

		System.out.print("Enter the no of rows : ");
		int r = sc.nextInt();

		System.out.print("Enter the no of columns : ");
		int c = sc.nextInt();

		int a[][][] = new int[t][r][c];
		int i,j,k,counter=10;
		for(i=0;i<t;i++)
		{
			for(j=0;j<r;j++)
			{
				for(k=0;k<c;k++)
				{
					a[i][j][k] = ++counter;
				}
			}
		}
		System.out.println("\n-----------------------------\n");
		for(i=0;i<t;i++)
		{
			for(j=0;j<r;j++)
			{
				for(k=0;k<c;k++)
				{
					System.out.print(" "+a[i][j][k]);
				}
				System.out.println();
			}
			System.out.println("::::::::");	
		}

		System.out.println("data : "+a[0][2][1]);
	}
}



