
class Polymorphism
{
	public static void main(String[] args) {
		
		A obj = new A();
		obj.sum(10,30,30);
		obj.sum(10,30);
	}
}

class A{
	void sum(int a,int b)
	{
		System.out.println(a+" + "+b+" = "+(a+b));
	}

	void sum(int a,int b,int c)
	{
		System.out.println(a+" + "+b+" + "+c+" = "+(a+b+c));
	}
}