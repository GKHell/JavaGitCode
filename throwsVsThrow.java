// bufferredReader -> IOException
// clone -> CloneNotSupportedException
import java.io.*;
class throwsVsThrow{
	public static void main(String[] args)throws IOException,CloneNotSupportedException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter name : ");
		String str = br.readLine();
		System.out.println("Welcome "+str);
		Me m1 = new Me();
		Me m2 = (Me)m1.clone();
		//////////////////////////////
		System.out.print("Enter the number : ");
		int i = Integer.parseInt(br.readLine());

		try{

			if(i<0)
			{
				throw new NullPointerException("My message... due to -ve value");
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("Error : "+e);

		}

	}
}
class Me implements Cloneable{

	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

