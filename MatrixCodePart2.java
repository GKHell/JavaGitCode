class MatrixCode{
	public static void main(String[] args) {
		
		Matrix A = new Matrix(3,3);
		A.print();
	
		System.out.println("\n---------------\n");
		Matrix B = new Matrix(3,3);
		B.print();


		System.out.println("\n---------------\n");
		Matrix C = A.sum(B);

		C.print();

	}
}
class Matrix{

	int x[][];
	int i,j;
	int count=0;
	int row,column;

	Matrix(int row,int column)
	{
		this.row = row;
		this.column = column;

		x = new int[this.row][this.column];
		for(i=0;i<this.row;i++)
		{
			for(j=0;j<this.column;j++)
			{
				x[i][j] = ++count;
			}
		}
	}
	void print()
	{
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.printf(" %2d",x[i][j]);
			}
			System.out.println();
		}	
	}

	Matrix sum(Matrix B)
	{ 
		Matrix temp = new Matrix(row,column);;

		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				temp.x[i][j] = this.x[i][j]+B.x[i][j];
			}
		}
		return 	temp;
	}
}