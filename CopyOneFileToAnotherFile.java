
import java.io.*;
class CopyOneFileToAnotherFile{
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the fileName1 : ");
		String fileName1 = br.readLine();

		System.out.print("Enter the fileName2 : ");
		String fileName2 = br.readLine();


		FileInputStream file1 = null;
		FileOutputStream file2 = null;

		try{

			file1 = new FileInputStream(fileName1);
			file2 = new FileOutputStream(fileName2);
		}
		catch(Exception e)
		{

			System.out.println("Invalid file name......");
			System.exit(12);	
		}

		int ch;
		while((ch=file1.read())!=-1)
		{
			file2.write((char)ch);
		}=

		file1.close();
		file2.close();
	}

}