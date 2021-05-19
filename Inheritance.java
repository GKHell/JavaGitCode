class Inheritance{
	public static void main(String[] args) {
		
		B b = new B();
		b.show();
	}
}
class A{

	void show()
	{
		System.out.println("We are in class A");
	}
}
class B extends A{
	void show()
	{
		System.out.println("We are in class B");
			super.show();
		
	}
}