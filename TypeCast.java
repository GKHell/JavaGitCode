
class TypeCast{
	public static void main(String[] args) {

		// lower -> higher //implicit  or widening

		int i = 47;
		float f = i; // implicit

		System.out.println("int to float : "+f);

		//////////////////////////////////
		// higher -> lower  //explicit // narrowing

		float k = 34.6f;
		int j = (int)k;
		System.out.println("float to int : "+j);
			
	}
}