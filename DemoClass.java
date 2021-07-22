class DemoClass{

	public static void main(String[] args) {
		
		// msg("java");
		A obj = new A();
		obj.msg("Java");
		obj.msg("Python");
		// System.out.println("name of language : "+obj.name);
	}
}

class A{

	private String name; //variable
	void msg(String n) //method
	{
		name = n;
		System.out.println("welcome "+name);
	}
}