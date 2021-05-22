
class ThisKeyword{
	public static void main(String[] args) {
	
		Data d1 = new Data();
		Data d2 = new Data();
		System.out.println("d1 : "+d1);
		System.out.println("d2 : "+d2);	

		d1.display1(100); // for the variable
		d2.display2(d2); // for the object

	}
}
class Data{
	int x;		
		void display1(int x)
		{
			this.x = x;
			x=19;
			System.out.println("this : "+this+"\t value of x : "+this.x);
		}
		void display2(Data obj)
		{
			System.out.println("this : "+this+"\t obj : "+obj);
		}

}