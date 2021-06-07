
package pattern;
public class Code
{

	public void printStar(int n)
	{
		for(int i =0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(i%2==0)
					System.out.print("\u001B[31m"+" \u2764 ");
				else
					System.out.print("\u001B[34m"+" \u2764 ");

			}
			System.out.println();
		}
	}
}