 
 class PolymorphismCode
 {
 		void sum(int a,int b)
 		{
 			System.out.println("Method 1 : "+a+" + "+b+ " = "+(a+b));

 		}

 		void sum(int a,int b,int c)
 		{
 			System.out.println("Method 2 : "+a+" + "+b+ " + "+c+" = "+(a+b+c));

 		}
 	public static void main(String[] args) {
 	
 		PolymorphismCode p = new PolymorphismCode();

 		p.sum(23,40,10);
 		p.sum(30,50);

 		System.out.println("----------------------------------------");

 		B obj = new B();
 		obj.msg("Python");
 	}
 }

 class A{ //super

 	void msg(String s)
 	{
 		System.out.println("Method 1(Class A) :"+s);
 	}
 }
 class B extends A{ // base
 
 	void msg(String s)
 	{
 		super.msg("Java");
 		
 		System.out.println("Method 2(Class B) :"+s);
 	}
 }