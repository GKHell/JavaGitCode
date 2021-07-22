
import Intro.*;
class Code{
	public static void main(String[] args) {
		
		A  a = new A();
		a.say();
		a.tell("Python");
	}
}
class A implements sourceCode{
	
	public void say()
	{
		System.out.println("Hey there.......");
	} 
	public void tell(String s)
	{
		System.out.println("welcome "+s);
	}
}