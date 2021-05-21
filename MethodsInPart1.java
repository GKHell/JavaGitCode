/*
accessSpecifier ReturnTYpe FunName(args.....)
{
	//body..
}

*/
class MethodsIn{
	public static void main(String[] args) {
		
		ShowCode sc = new ShowCode();
		sc.printCode("code it at Desk.");	//method 1

		int z = ShowCode.sum(10,30); //method 2
		sc.printCode("Ans "+z); //method 1
	}
}
class ShowCode{

	void printCode(String msg) //method 1 ,instance method which must be called by object
	{ 
		//body
		System.out.println(msg); 
	}

	static int sum(int a,int b)// method 2: static which could be called by object or className
	{
		return a+b;
	}
}