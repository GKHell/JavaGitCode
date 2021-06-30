
import java.io.*;
import java.util.zip.*;
import java.util.*;
class ZipUnZip{
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the file name to zip : ");
		String fileName = br.readLine();

		FileInputStream file1 = null ;		
		FileOutputStream file2= null;

		StringTokenizer str = new StringTokenizer(fileName,".");
		String zipFileName = str.nextToken();
		// cmd.txt
		try{

			file1 = new FileInputStream(fileName);
			file2 = new FileOutputStream(zipFileName);


		} 
		catch(Exception e)
		{
			System.out.println("invalid........");
			System.exit(12);
		}

		DeflaterOutputStream dos = new DeflaterOutputStream(file2);
		int ch;
		System.out.print("\nCreating zip...");
		while((ch = file1.read())!=-1)
		{
			dos.write((char)ch);
			if(ch%13==0)
			{
				System.out.print(".");
			}	
		}

		System.out.println("\n"+zipFileName+".zip done....");

		file1.close();
		file2.close();
	}
}