
class finalKeyword{
	public static void main(String[] args) {
		
		B b = new B();

		System.out.println("s1 value of i : "+b.i);

		// b.i = 4000; // gives error

		System.out.println("s2 value of i : "+b.i);

		// b.i = 300; //gives error

		System.out.println("s3 value of i : "+b.i);

	}

}
final class A{

	final void say()
	{
		System.out.println("Hello World....");
	}
}
class B { // 'extends A' will  give you  an error

	final static int i=150;
}