import java.io.*;
class BookCoders
{
	
	public static void main(String[] args)throws IOException {

		Book b1 = new Book();
		b1.setInfo();

		b1.display();
	}
} 

class Book{

	private String name;
	private String author;
	private float price;
	private int edition;
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	void setInfo() throws IOException 
	{
		System.out.print("Enter name : ");
		name = br.readLine();

		System.out.print("Enter Author : ");
		author = br.readLine();

		System.out.print("Enter price : ");
		price  = Float.parseFloat(br.readLine());

		System.out.print("Enter edition : ");
		edition  = Integer.parseInt(br.readLine());
	}
	void display()
	{
		System.out.println("   name : "+name);
		System.out.println(" author : "+author);
		System.out.println("  price : "+price);
		System.out.println("edition : "+edition);

	}
}
