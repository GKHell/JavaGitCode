
class AbstactCode{
	public static void main(String[] args) {
		

		Run r = new Run();
			r.say("Python");
			r.tell();
		}
}
abstract class Code{

	abstract void say(String x); // abstract method

	 void tell() //concrete method 
	{
			System.out.println("I am Code.....");
	}
}
class Run extends Code{

	void say(String name)
	{
		System.out.println("hello  ...."+name);
	}
	void tell()
	{
			System.out.println("I am Run.....");

	}
}