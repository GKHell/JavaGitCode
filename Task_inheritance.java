import java.util.*;
import java.text.*;
class Task_inheritance
{
	public static void main(String[] args) {
		Student s = new Student(); // run all constructors
		s.printDisplayAll(); //print all data of class Author ,Book,Student
	}
}
class Author{

			String name;
			Date releaseDate;
		   float price;

		   		public Author()
		   		{
		   			System.out.println("class Author"); //to check prority 
		   			name  = "MsCods";
		   			releaseDate = new Date(); // create a object of Date which takes current DATE time 
		   			price = 999.35f;
		   		}
}
class Book extends Author{

	String Bname;
	String Btitle;
	String Edition;

		public Book()
		{
   			System.out.println("class Book"); //to check prority 

			Bname = "GeiuY";
			Btitle = "i1377";
			Edition ="10th";
		}

}
class Student extends Book{

	String Sname;
	int std;

		public Student() //to check prority 
		{
   			System.out.println("class Student");
			Sname = "RIo";
			std = 12;
		}

		void printDisplayAll() //display all data of all classes...
		{

			System.out.println("    Student Name : "+Sname);
			System.out.println("     Student std : "+std);
			System.out.println("      Book Bname : "+Bname);
			System.out.println("          Btitle : "+Btitle);
			System.out.println("         Edition : "+Edition);
			System.out.println("     Author Name : "+name);
			System.out.println(" BookreleaseDate : "+releaseDate.toString());
			System.out.println("          price  : "+price);


		}
}