

class FactoryMethod{
	public static void main(String[] args) {
		
		Matrix A = new Matrix(3,3);
		Matrix B = new Matrix(3,3);
		
		
		A.print();
		B.print();

		Matrix C = A.sum(B); // its return temp which will store in c

		C.print();
	}
}
class Matrix{

	int x[][];
	int i,j;
	int row,column;
	Matrix(int row,int column)
	{
		this.row = row;
		this.column = column;
		x = new int[this.row][this.column];

		for(i = 0; i< this.row ;i++)
		{
			for(j=0; j<this.column; j++)
			{
				x[i][j] = i;
			}
		}
	}

	void print()
	{
		System.out.println("\n-------------------");
		for(i = 0; i< row ;i++)
		{
			for(j=0; j<column; j++)
			{
				System.out.print(" "+x[i][j]);
			}
			System.out.println();
		}	
		
	}
	Matrix sum(Matrix B)
	{
		Matrix temp = new Matrix(row,column); //creating object
		for(i = 0; i< row ;i++)
		{
			for(j=0; j<column; j++)
			{
				temp.x[i][j] = this.x[i][j] + B.x[i][j]; 
			}
		}

		return temp; //returning object..
	}
}