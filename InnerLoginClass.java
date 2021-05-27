
class InnerLoginClass
{
	public static void main(String[] args) {
		
		Person p = new Person("RameshCoder");
		p.login("GkHell","123");
	}
}
class Person{

	String name;

	public  Person(String name)
	{
		this.name = name;
	}
	void login(String userName,String password)
	{

		LogIn l = new LogIn();
		boolean f = l.validLogin(userName,password);

		if(f)
		{
			System.out.println("LogIN DONE");
		}
		else
		{
			System.out.println("LogIN Fails...");
		}
	}

	class LogIn
	{
		String user = "GkHell";
		String pass = "123";

		boolean validLogin(String userName,String password)
		{
				return this.user.equals(userName) && this.pass.equals(password);
		}
	}

}