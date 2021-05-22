
class DataObject{
	public static void main(String[] args) {
		
		Data d = new Data();
		d.a = 5;
		d.b = 6;
		System.out.println("p1 : a = "+d.a+" , b = "+d.b);
		d.swap();
		System.out.println("p3 : a = "+d.a+" , b = "+d.b);
	}
}
class Data{
	int a,b;
	void swap()
	{
		//a =5,b=6
		this.a = this.a+this.b; // a=11
		this.b = this.a-this.b; // b = 5
		this.a = this.a-this.b; // a = 6
		System.out.println("p2 : a = "+this.a+" , b = "+this.b);
	}
}