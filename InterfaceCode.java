import java.io.*;
class InterfaceCode
{
	public static void main(String[] args) throws IOException {
	
		Run r = new Run();
		r.printResult();

	}
}	

interface Code{


	void printResult() throws IOException;
	String getString(String str);

}

class Run implements Code{

	BufferedReader br;

	public Run()
	{
		br = new BufferedReader(new InputStreamReader(System.in));
	}	

	public String getString(String data)
	{
			return data.toUpperCase()+" , "+data.toLowerCase();
	}
	public void printResult() throws IOException
	{

		System.out.print("Enter the string : ");
		String data = br.readLine();
		
		System.out.println("new String : "+getString(data));	
	}	
}