class ReturnValue{
	
	int returnCode(int value){


		return value*100;
		// return value-10; //it will gives you error.
	}
	public static void main(String[] args) {
		
		System.out.println("HellOfcode");

		ReturnValue rv = new ReturnValue(); //creating object of ReturnValue
		
		int x = rv.returnCode(10); //call
		System.out.println("value in x : "+x);

		System.out.println("line 1");
			rv.returnCode(1);
			System.exit(0); //exit from program
		System.out.println("line 2");
	}
}