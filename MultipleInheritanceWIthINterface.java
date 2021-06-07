class MultipleInheritanceWIthINterface{

	public static void main(String[] args) {

		Code c = new Code();
		c.say();
		c.tell();
	}
}
interface A{

	void say();
}
interface B{

	void tell();
}
class Code implements A,B{

	public void say()
	{
			System.out.println("hello me");
	}
	public void tell()
	{
			System.out.println("hello you...");

	}
}

