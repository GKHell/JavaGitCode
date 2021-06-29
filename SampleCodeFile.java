

// DatainputStream
// BInary data => inputstream , outputstream
// Text data => reader, writter
import java.util.*;
import java.io.*;
class Hell{
	public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			DataInputStream ds = new DataInputStream(System.in);

			System.out.print("Enter file name : ");
			String fileName = br.readLine();

			FileOutputStream f = new FileOutputStream(fileName);//file create

			System.out.println("Enter your data : ");
			char ch;
			int i=0;
			while(i<3)
			{
				ch = (char)ds.read();
				if(ch=='`')
					i++;
				else
					i=0;
				f.write(ch);
			}

	}
}