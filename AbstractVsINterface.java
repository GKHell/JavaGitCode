
class AbstractVsINterface{
	public static void main(String[] args) {
		
		C c = new C();
		c.showA();
		c.showB();
	}
}

abstract class A{

	int i = 19;
	abstract void showA();
}
interface B{ 
	int j = 10; //defaultty final 
	void showB(); //defaultly public and abstract

}

class C extends A  implements B{

	void showA()
	{
		i=30;
		System.out.println("class A . i "+i);
	}
	public void showB()
	{
		 // j = 30;	
		 System.out.println("class B . j "+j);
	}	

}