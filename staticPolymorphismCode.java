
class staticPoly{
	public static void main(String[] args) {
		
		if(Code.compare(1,2,0,0))
		{
			System.out.println("Fine..");
		}
		else
		{
			System.out.println("wine,,,");
		}
	}
}
class Code{

	static boolean compare(Object a,Object b,Object c)
	{
		return a==b && b==c;
	} 

	static boolean compare(Object a,Object b)
	{
		return a==b;
	} 
}