// range
import java.util.*; 
class TaskCode{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int m = n;
		int counter=0;
		while(m>0)
		{
			m=m/10;
			counter++;
		}
		/*
			m(m/10):          c(c++)
			 9872				0
			 987				1
			 98					2
			 9					3
			 0					4
		*/ 
		System.out.println("length : "+counter);
		if(n==0)
		{
			System.out.println("invalid number : 000");
			System.exit(1);
		}
		if(counter==3)
		{
			System.out.println("all is WEll "+n);
			System.exit(0);
		}
		if(counter<3)
		{
			n = n*(int)Math.pow(10,(3-counter)); // 1, 10^2
		}
		else
		{
			n = n/(int)Math.pow(10,(counter-3));// 5, 10^2
		}
		System.out.println("all is not WEll "+n);

	}
}