class Tables{
	public static void main(String[] args) {
		
		Code c = new Code(14);

	}
}

class Code{
	static int x;
	Code(int x)
	{
		Code.x = x;
		print(10);
	}
	static int print(int n)
	{
		if(n==0)
			return 1;
		print(n-1);
		
		System.out.printf("%2d x %2d = %2d\n",Code.x,n,n*Code.x);

		return 0;
	}
}