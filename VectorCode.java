
import java.util.*;

class VectorCode{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		Vector<Float> marks = new Vector<Float>();
		Vector<Float> marks_pass = new Vector<Float>();
		Vector<Float> marks_fail = new Vector<Float>();


		// marks.add(91.3f);
		// marks.add(92.3f);
		// marks.add(94.3f);
		// marks.add(94.3f);
		// marks.add(95.3f);
		// marks.add(96.3f);

		System.out.print("Enter the new size for marks : ");
		int n = sc.nextInt();

		int i;
		for(i=0;i<n;i++)
		{
			System.out.print("Enter the marks : ");
			marks.add(sc.nextFloat());
		}

		System.out.println("\n\n");
		for(i=0;i<n;i++)
		{
			if(marks.get(i)>=33)
			{
				System.out.println("index - "+i+"\t"+marks.get(i)); // a[i]
				marks_pass.add(marks.get(i));
			}
			else
			{
				System.out.println("\u001B[31mindex - "+i+"\t"+marks.get(i)+"\u001B[00m");
				marks_fail.add(marks.get(i));
			}

		}

		ListIterator j = marks.listIterator();

		while(j.hasNext())
		{
			System.out.println("\tMarks : "+j.next());
		}

		while(j.hasPrevious())
		{
			System.out.println("Marks : "+j.previous());
		}

		marks.clear();

		System.out.print("Enter marks for searching : ");
		System.out.println("status "+marks.contains(sc.nextFloat()));
		System.out.println("total no of marks : "+marks.size());
		System.out.println(" total no of pass : "+marks_pass.size());
		System.out.println(" total no of fail : "+marks_fail.size());


		System.out.println("\n\n----------------------------------");
		for(float f:marks_pass)
		{
			System.out.println("pass : "+f);
		}

		for(float f:marks_fail)
		{
			System.out.println("\tfail : "+f);
		}
	}
}