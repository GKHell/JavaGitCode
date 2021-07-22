
class DynamicPolymorphismCode{
	public static void main(String[] args) {
		
		Code1 c1 = new Code1();
		c1.display(2,10);

		// Code2 c2 = new Code2();
		// c2.display(3,10);
	}
}
class Code1{

	void display(int x,int n)
	{
		for(int i =1 ;i<=n;i++)
		{
			System.out.printf(" %2d^%-3d = %.0f\n",x,i,Math.pow(x,i));
		}
	}
}
class Code2 extends Code1{
	void display(int x,int n)
	{
		for(int i =1 ;i<=n;i++)
		{
			System.out.printf("\t\t %2dx%-2d = %d\n",x,i,x*i);
		}
	}

}