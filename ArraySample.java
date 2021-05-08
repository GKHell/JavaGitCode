// 
class ArrayCode{
	public static void main(String[] args) {
	
		float a[] = {12,4,4.34f,55,6.4f,44.73f,5,1,3,4,10.2f};

		int i;
		for(i=0;i<11;i++) //method manual size
		{
			System.out.println("m1 => "+a[i]);
		}		
		//
		System.out.println("\n\n----------------------\n");
		for(i=0;i<a.length;i++) //method with array.length
		{
			System.out.println("m2 => "+a[i]);
		}
		//
		System.out.println("\n\n----------------------\n");
		for(float x: a) //method with for-each loop
		{
			System.out.println("m3 => "+x);
		}

	}
}