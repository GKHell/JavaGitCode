
class CloneTheObject{
	public static void main(String[] args)throws CloneNotSupportedException {
		
		Code c1 = new Code();
		
		Code c2 = (Code)c1.clone();

		c1.i = 30;
		
		System.out.println("c1 : "+c1.i);

		System.out.println("c2 : "+c2.i);

	}
}
class Code implements Cloneable{
	int i = 100;

	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}