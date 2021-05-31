
class typeCast{
	public static void main(String[] args) {
		
		//lower data - > higer data.. coercion
		char ch = 'a';
		int i = ch; // char to int
		System.out.println("i : "+i);


		//higher data -> lower data .. conversion
		float j = 7.7f;
		int x = (int)j;
		System.out.println("x : "+x);


	}	
}