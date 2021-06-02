class ObjectClassMethod{
	public static void main(String[] args) throws Throwable{
	
		Code c1 = new Code();
		Code c2 = c1;


		System.out.println("    equals : "+c1.equals(c2));
		System.out.println(" toString  : "+c1.toString());
		System.out.println(" toString  : "+c2.toString());
		c1.display();
		System.out.println("  getClass : "+c1.getClass());
		System.out.println("  hashCode : "+c1.hashCode());
		System.out.println("  hashCode : "+c2.hashCode());

		// @Deprecated(since="9")
		c1.finalize();
		c2.finalize();
	}
}
class Code{

	public String toString()
	{
		return super.toString()+" HelloW";
	}	
	// @Deprecated(since="9")
	protected void finalize() throws Throwable
	{

		super.finalize();
		System.out.println("Memory has been cleared...");
	}

	void display()
	{
		System.out.println("say : "+this); // calling toString of code class
	}
}