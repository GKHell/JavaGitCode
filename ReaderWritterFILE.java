// FileInputStream ,FileOutStream = > for binary format
// FileReader ,FileWritter => text format
import java.io.*;
class ReaderWritterFILE{

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the file name to create : ");
		String fileName = br.readLine();

		System.out.print("Enter the data for storing in file : ");
		String data = br.readLine();

		FileWriter file1 = new FileWriter(fileName);

		for(int i = 0 ;i<data.length();i++)
		{
			file1.write(data.charAt(i));
		}

		file1.close();
		System.out.println("\n-----------------------------------\n");

		FileReader file2 = new FileReader(fileName);
		int ch;

		while((ch=file2.read())!=-1)
		{
			System.out.print((char)ch);
		}

	}
}