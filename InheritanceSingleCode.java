
class InheritanceSingleCode
{
	public static void main(String[] args) {

		B b = new B();
		b.display();
	}
}
// A->B
class A{

	protected void display()
	{
		System.out.println("m1 Hello World...."+this);
	}
}
class B extends A{

	protected void display()
	{
		super.display();
		System.out.println("m2 Hello World...."+this);
	}
}