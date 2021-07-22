
class Factorial
{
	public static void main(String[] args) {
		
		int x = Data.fact(5);
		System.out.println("fact : "+x);
	}
}
class Data{
	static int fact(int n)
	{

		if(n==1)
		{
			return 1;
		}

		int ans = n*fact(n-1);
		System.out.println(n+" => "+ans);
		return ans;
	}
}
/*
5x4x3x2x1
5x4!
*/