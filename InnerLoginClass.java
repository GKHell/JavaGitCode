import java.util.*;
class InnerLoginClass
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Real Name : ");
		String name = sc.nextLine();
		
		Person p = new Person(name);
		p.register();
		p.login();
	}
}
class Person{

	String name;
	LogIn l;
	Scanner sc; 
	public  Person(String name)
	{
		this.name = name;
		sc = new Scanner(System.in);
		l = new LogIn(); //creating a new object of class "login"
	}
	void register()
	{
		System.out.print("Enter the username for "+this.name+" : ");
		l.user = sc.nextLine();

		System.out.print("Enter the password for "+this.name+" : ");
		l.pass = sc.nextLine();
	}

	void login() //method
	{


		System.out.print("\n\nEnter userName : ");
		String uname = sc.nextLine();

		System.out.print("Enter userPass : ");
		String upass = sc.nextLine();

	
		boolean f = l.validLogin(uname,upass); //jump to 39

		if(f)
		{
			System.out.println("LogIN DONE");
		}
		else
		{
			System.out.println("LogIN Fails...");
		}
	}

	class LogIn //inner class
	{
		String user;
		String pass;

		boolean validLogin(String userName,String password) //validlogin
		{
				return this.user.equals(userName) && this.pass.equals(password); //return to 22 line number
		}
	}

}