
class A{
	public static void main(String[] args) {

		int i,j,k,p,q,r;
		int a1=3,a2=3,a3=3,a4=3,a5=3,a6=3;
		int a[][][][][][] = new int[a1][a2][a3][a4][a5][a6];

		int c = 0;
		for(i=0;i<a1;i++)
		{
			for(j=0;j<a2;j++)
			{		
				for(k=0;k<a3;k++)
				{
					for(p=0;p<a4;p++)
					{
						for(q=0;q<a5;q++)
						{
							for(r=0;r<a6;r++)
							{
								a[i][j][k][p][q][r] = ++c;
							}
						}
					}
				}
			}
		}

		for(i=0;i<a1;i++)
		{
			for(j=0;j<a2;j++)
			{		
				for(k=0;k<a3;k++)
				{
					for(p=0;p<a4;p++)
					{
						for(q=0;q<a5;q++)
						{
							for(r=0;r<a6;r++)
							{
								System.out.print("\t "+a[i][j][k][p][q][r]);
							}
							System.out.println();
						}
					System.out.println(" --- ");

					}
			System.out.println(" === ");

				}
			System.out.println(" ;;; ");

			}
		System.out.println(" >>> ");

		}




	}
}