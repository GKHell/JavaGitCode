
class ArrayMethods{
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,0};

		Data.sort(a);
		for(int j:a)
		{
			System.out.println(" = > "+j);
		} 
	}
}

class Data{

	static void sort(int x[])
	{
		int n = x.length;
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(x[i]<x[j])
				{
					int t;
					   t = x[i];
					x[i] = x[j];
					x[j] = t;
				}
			}
		}
	}
}