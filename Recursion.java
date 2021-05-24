class Recursion
{
	public static void main(String[] args) {
		
		Data d =new  Data();

		int x = d.show(10);

		System.out.println("a : "+x);
	}
}
class Data{

	int show(int n)
	{
		if(n<0)
			return 'a';
		System.out.println("hello world...\t"+n);
		show(n-3);
		// System.out.println("-------------------------------");
		System.out.println("hello world==="+n);

		return 'A';
	}
}