
import java.io.*; // BufferedReader
import java.util.*; // Scanner
class ObjectArrayCode{
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of Student : ");
		int n = sc.nextInt();

		Student s[] = new Student[n];

		for(int i=0;i<n;i++)
		{
			s[i] = new Student();
			s[i].getData();
		}
		
		//////////////
		System.out.println("\n-----------------------\n");
		// for(int i=0;i<n;i++)
		// {
		// 		s[i].showData();
		// }
			for(Student me:s)
			{
				me.showData();
			}
		}
}
class Student{

	String name;
	int rollno;
	String subject;
	float marks;
	BufferedReader  br;
	Student() throws IOException
	{
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	void getData() throws IOException
	{
		System.out.print("\nEnter the name : ");
		name = br.readLine();

		System.out.print("Enter rollno : ");
		rollno = Integer.parseInt(br.readLine());

		System.out.print("Enter the subject : ");
		subject = br.readLine();

		System.out.print("Enter the marks : ");
		marks = Float.parseFloat(br.readLine());

	}
	void showData()
	{
		System.out.printf("%10s : %2d , %10s - %3.2f\n",name,rollno,subject,marks);
	}
}