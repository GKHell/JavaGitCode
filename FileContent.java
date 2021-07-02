
/*
	  reader / input =>     file-> program #1
	writter / output => program -> file    #2
*/

import java.io.*;
class FileContent{
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the file name : ");
		String fileName = br.readLine();

		FileInputStream file = null;
		try{
						file = new FileInputStream(fileName);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Enter valid file name .....");
		}

		System.out.println("\n-----------------\n");
		int ch;
		char s;
		int character = 0; 
		int line = 0;
		int word = 0;
		while((ch=file.read())!=-1)
		{
			s = (char)ch;
			System.out.print(s);
			
			if(s!=' ' && s!='\n')
			{
			     character++;
			}
			if(s=='\n')
			{
				line++;
			}
			
			if(s==' ' || s=='\n')
			{
				word++;
			}
		}
		System.out.println("\n-----------------");
		System.out.println("reading done........");
		System.out.println("character : "+character);
		System.out.println("     line : "+line);
		System.out.println("     word : "+word);

	}
}