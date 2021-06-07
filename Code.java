
package pattern;
public class Code
{

	public void printStar(int n)
	{
		for(int i =0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("\u001B[31m"+" \u2764 ");
			}
			System.out.println();
		}
	}
}