class finalWithPoly
{
	public static void main(String[] args) {
		B b = new B();
		b.say();
	}
}
class A{

	final public void say()
	{
		System.out.println("We are in class A..");
	}
}
class B extends A{

	public void say(){ //trying to redefine the say

		System.out.println("We are in class B..");

	}
}