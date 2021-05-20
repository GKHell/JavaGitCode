
/*
private : access in same class
protected : access in same class or child class and same directory
public : anywhere in package or program
default : access in same package not outside that.

*/
class AccessS{
	 
	public static void main(String[] args) {
		
		 Data myData = new Data();
		 myData.setInfo();
		 myData.display(); 
	}
}
class Data{

	 String name;
	private String acId;
	private float amount;

	protected void setInfo()
	{
		name = "Gk";
		acId = "A0944";
		amount = 3409.5f;
		System.out.println("**************************");
	}
	void display()
	{
		System.out.println("name : "+name);
		System.out.println("acId : "+acId);
		System.out.println("amount : "+amount);
		 
			
	}
}

 