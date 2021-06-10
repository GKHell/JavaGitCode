
// package clr;
class Color{
	
	public static void printRed(String str)
	{
		System.out.print("\u001B[31m"+str+"\u001B[0m");
	} 
	public static void main(String[] args) {

		Color.printRed("Hello You..");
	}
}