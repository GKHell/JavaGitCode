import java.util.*;
class ArraySearch{
	public static void main(String[] args) {
		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		n = sc.nextInt();

		int a[] = new int[n];
		System.out.print("Enter the array : \n");
		
		for(i=0;i<n;i++)
		{
			System.out.print(" a [ "+i+" ] = ");
			a[i] = sc.nextInt();
		}
		 
		int neg=0,pos=0,zero=0;

		for(i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				neg++;
			}
			if(a[i]>0)
			{
				pos++;
			}
			if(a[i]==0)
			{
				zero++;
			}
		}

		System.out.println("  neg : "+neg);
		System.out.println("  pos : "+pos);
		System.out.println(" zero : "+zero);

		 
	}
}