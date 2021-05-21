class MethodsInPart2ft_Static{

	static{
		System.out.println("i am the fastest man alive bcz i'm in static block.");
	}
	public static void main(String[] args) {
		//to call : ClassName.methodName(args..)
		ShowCode.say(); //method 1
		ShowCode.name = "RohitMehra123";
		ShowCode.say(ShowCode.name); //method 2

		System.out.println("phase hello");
	}
}
class ShowCode{
	static String name;

	static public void say() //method 1
	{

		System.out.println("hello There....");
	}
	static public void say(String name) //method 2
	{

		System.out.println("hello "+name);
	}
}
