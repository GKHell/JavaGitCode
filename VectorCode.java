
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
				System.out.println("index - "+i+"\t"+marks.get(i));
				marks_pass.add(marks.get(i));
			}
			else
			{
				System.out.println("\u001B[31mindex - "+i+"\t"+marks.get(i)+"\u001B[00m");
				marks_fail.add(marks.get(i));

			}

		}

		// Iterator i = marks.iterator();
		// while(i.hasNext())
		// {
		// 	System.out.println("Marks : "+i.next());
		// }

		System.out.println("----------------------------------");
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