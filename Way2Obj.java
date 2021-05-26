
class Way2Obj{
	public static void main(String[] args)throws CloneNotSupportedException,ClassNotFoundException,InstantiationException,IllegalAccessException {
	
		Class c1 = Class.forName("Code");
		Code c2 = (Code)c1.newInstance();

		Code c =new Code();
		Code c3 = (Code)c.copy();
	}
}
class Code implements Cloneable{

	public Object copy() throws CloneNotSupportedException
	{
		return (Code)super.clone();
	}
}