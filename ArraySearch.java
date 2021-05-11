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
		int data;
		System.out.print("Enter the data : ");
		data = sc.nextInt();
		boolean f = false;
		for(i=0;i<n;i++)
		{
			if(a[i]==data)
			{
				f = true;
				System.out.println("data "+data+" found at "+i+" index .");
				break;
			}

		}

		if(!f)
		{
			System.out.println("data not found....");
		}

	}
}