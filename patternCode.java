class PatternCode{
	public static void main(String[] args) {
		int i,j,n;		
		n=50;
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if(j%2==0 || i%3==0)
						System.out.print(" * ");
					else if((i+j)%3==0)
						System.out.print("   ");
					else
						System.out.print("   ");

				}
				System.out.println();
			}

	}
}