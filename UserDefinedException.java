
import java.io.*;
class UserDefinedException{
	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name = "Rajni Can't";

		System.out.print("Enter the name : ");
		String userName = br.readLine();

		try{
			if(!name.equalsIgnoreCase(userName))
			throw new DekhKeCodeKr("Invalid Name...");	
		}
		catch(DekhKeCodeKr e){

			System.out.println("Info : "+e);
		}
	}
}


class DekhKeCodeKr extends Exception{

	public DekhKeCodeKr()
	{
		super();
	}
	public DekhKeCodeKr(String msg)
	{
		super(msg);
	}
}