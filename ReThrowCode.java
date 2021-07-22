
import java.io.*;
class UserDefinedException{
	public static void main(String[] args)throws Exception {
		
		try
		{
			RajDhaniExpress.bookTickets();
		}
		catch(Exception m)
		{
			System.out.println("msg : "+m);
		}
	}
}
class RajDhaniExpress{


	public static void bookTickets() throws Exception
	{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Have you done vaccination [y/n] ? : ");
		
		String s = (br.readLine());	
		char ch = s.charAt(0);
		System.out.println("Character : "+ch);

		try{
			if(ch=='N' || ch=='n')
			{
				throw new Exception("Go to Home By...");
			}
		}
		catch(Exception e)
		{
			throw e;
		}
		System.out.println("welcome RajDhaniExpress ....");
	}
}