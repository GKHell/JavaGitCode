
class TypeCast{
	public static void main(String[] args) {

		// // lower -> higher //implicit  or widening

		// int i = 47;
		// float f = i; // implicit

		// System.out.println("int to float : "+f);

		// //////////////////////////////////
		// // higher -> lower  //explicit // narrowing

		// float k = 34.6f;
		// int j = (int)k;
		// System.out.println("float to int : "+j);

		//------------------------------------------------- part 2

		// 1 : generalization : child to super
		B b = new B();
		A a = b;
		a.say1();
		// a.say2(); // gives error

		// 2 : specilization : super to child

		System.out.println("----------------");
		A objA = new B();

		B objB = (B)objA;

		objB.say1();
		objB.say2();

	}
}
class A{

	void say1()
	{
		System.out.println("class A");
	}
}
class B extends A{


	void say2()
	{
		System.out.println("class B");
	}
}