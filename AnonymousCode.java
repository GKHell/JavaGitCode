class AnonymousCode
{
	public static void main(String[] args) {
		
		Code c = new Code();
		c.obj.show();
		c.obj.say("Codes");

	}
}
interface Hell{
	public void say(String Name);
	public void show();
}
class Code {

	Hell obj = new Hell(){
		public void show()
		{
			System.out.println("Hello THERE....");
		}
		public void say(String Name)
		{
			System.out.println("Hello "+Name);
		}
	};

	// obj.show();
}