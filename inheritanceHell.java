import java.util.*;
class inheritanceHell
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();

		System.out.print("Enter name : ");
		String a = sc.nextLine();

		System.out.print("Enter subject : ");
		String b = sc.nextLine();

		System.out.print("Enter marks : ");
		float c= sc.nextFloat();

		s.setData(a,b,c);
		s.printData();

	}
}
class Data{

	String name;
	String subject;
	float marks;
}
class Student extends Data{

	void setData(String name,String subject ,float marks)
	{
		super.name = name;
		super.subject = subject;
		super.marks = marks;
	}
	void printData()
	{
		System.out.println("   name : "+super.name);
		System.out.println("subject : "+super.subject);
		System.out.println("  marks : "+super.marks);

	}
}