
import java.io.*;
import java.util.*;
class StudentCodeWithArrayList{
	public static void main(String[] args)throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

			int n,i;

			ArrayList<Student> data = new ArrayList<Student>();

			System.out.print("Enter no of Student : ");
			n = Integer.parseInt(br.readLine());

			System.out.println("Enter data : ");
			for(i=0;i<n;i++)
			{
				Student s = new Student();
				s.setData();
				data.add(s);
			}

			Iterator r = data.iterator();

			while(r.hasNext())
			{
				Student j = (Student)r.next(); // x = i++ , || x =  ++i
				j.show();
			}
	}
}

class Student{
	int rollno;
	String name;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	void setData() throws IOException
	{
		System.out.print("Enter rollno : ");
		rollno = Integer.parseInt(br.readLine());
		/////
		System.out.print("Enter name : ");
		name = br.readLine();
	}
	void show()
	{
		System.out.println("rollno : "+rollno+"\t"+"name : "+name);
	}
}