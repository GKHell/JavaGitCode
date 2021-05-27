// Task : create register and  login method in innerclass
class ObjectRefernceINOtherClass{
	public static void main(String[] args) {
		A a = new A(new B());
		a.display();
	}
}
class A{
	B obj;
	public A(B object)
	{
		this.obj = object;
	}
	void display()
	{
		System.out.println("data : "+obj.data);
	}
}
class B
{
	int data = 130;
}