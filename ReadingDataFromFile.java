
/*

	inputStream,outStream  = bytes , Binary
*/
// displat file content
import java.io.*;
class ReadingDataFromFile{
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the file name : ");
		String fileName = br.readLine();

		FileInputStream file = new FileInputStream(fileName);

		int ch;
		while((ch=file.read())!=-1)//-1 here stands for end of File
		{
			System.out.print((char)ch);
		}
	}
}