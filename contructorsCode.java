/*
	1 . default
	2 . parameterized
*/

class Contructors{
	public static void main(String[] args) {
		

		Data d1 = new Data();
		d1.so();
		d1.so();
		d1.so();
		d1.so();
		d1.so();
		

		Data d2 = new Data("coder");
		Data d3 = new Data("sattu","Supari");

	}
}

class Data{

	String name;
	Data()
	{
		// name = "Hell";
		System.out.println("m1 : "+name);
	}
	Data(String s)
	{
		name = s;
		System.out.println("m2 : "+name);
		
	}

	Data(String f,String l)
	{
		name = f+" "+l;
		System.out.println("m3 :  "+name);
		
	}
	void so()
	{
		System.out.println("-----------------------------");

	}
}