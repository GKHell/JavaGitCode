
import java.io.*;
class FileClassCode{
	public static void main(String[] args) {
		
		File file = new File("code.cpp"); //code.cpp is your file name

		System.out.println("     isFile : "+file.isFile());
		System.out.println("isDirectory : "+file.isDirectory());
		System.out.println("    canRead : "+file.canRead());
		System.out.println("   canWrite : "+file.canWrite());
		System.out.println(" canExecute : "+file.canExecute());
		System.out.println("     exists : "+file.exists());

	}
}