
import java.io.*;
class FileClassCode{
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		File file = new File("code.cpp"); //code.cpp is your file name

		// System.out.println("     isFile : "+file.isFile());
		// System.out.println("isDirectory : "+file.isDirectory());
		// System.out.println("    canRead : "+file.canRead());
		// System.out.println("   canWrite : "+file.canWrite());
		// System.out.println(" canExecute : "+file.canExecute());
		// System.out.println("     exists : "+file.exists());
	    // System.out.println("  getParent : "+file.getParent());
	    // System.out.println("    getPath : "+file.getPath());
	    // System.out.println("getAbsolutePath(): "+file.getAbsolutePath());
	    // System.out.println("       size : "+file.length());

		System.out.println("\n-----------------------------------------------\n");
		// System.out.print("Enter the file name you want to delete : ");
		// String fileName = br.readLine();
		// file = new File(fileName);

		// if(file.exists())
		// {
		// 	file.delete();
		// 	System.out.println(fileName+" has been deleted....");
		// }
		// else
		// {
		// 	System.out.println(fileName+" not exists...");
		// 	System.out.println("creating.....  "+fileName+" ........");


		// 	file.createNewFile();
		// 	System.out.println("Enter 1 to delete.....");
		// 	int n = Integer.parseInt(br.readLine()); // wait for enter 
			
		// 	if(n==1)
		// 	{
		// 		System.out.println(fileName+" has been.. ");
		// 		file.delete();
		// 		System.out.println(fileName+" has been deleted....");
		// 	}
		// }

		System.out.println("\n-----------------------------------------------\n");

		// System.out.print("Enter directory name to create : ");
		// file = new File(br.readLine());
		// file.mkdir();
		// System.out.print("directory has been created....");

		// System.out.print("Enter the file Name  : ");
		// file = new File(br.readLine());
		// System.out.print("Enter new Name for file : ");
		// String newName = br.readLine();
		// file.renameTo(new File(newName));

		System.out.println("\n-----------------------------------------------\n");
 		
 		System.out.print("Enter the directory : ");
 		file = new File(br.readLine());
 		if(file.exists())
 		{
 			String files[] = file.list();

 			System.out.println("subfiles..... : ");
 			for(String f : files)
 			{
 				System.out.println(f);
 			} 
 		}

	}
}