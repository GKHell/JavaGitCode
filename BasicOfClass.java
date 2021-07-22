class BasicOfClass
{
	
	public static void main(String[] args) {

		Student boc1;
		 boc1 = new Student();
		 ///////
		Student boc2 = new Student();

		/*
			int a;
			a = 34;
		*/
		boc1.name = "ROhak";
		boc1.rollno = 45;

		System.out.println("name : "+boc1.name);
		System.out.println("rollno : "+boc1.rollno);
		// boc1 = boc2;
		System.out.println("-----------------\n"+boc1.hashCode());
		System.out.println("-----------------\n"+boc2.hashCode());

	}
} 

class Student{

	String name;
	int rollno;
}
