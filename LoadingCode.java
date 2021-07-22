import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
class LoadingCode{
	public static void main(String[] args) throws Exception{
	
			Load.loadCode(100);
	}
}
class Load{

	static String s[] = {"\u2754","\u2345","\u5323","\u2754","\u2345","\u5723","\u2754","\u2355","\u5323","\u2774","\u2375","\u5373","\u2754","\u2333","\u2223"};  

	static int loadCode(int n) throws Exception
	{
		if(n==0)
			return 0;
		for(int i=0;i<Load.random()+50;i++)
		{
			System.out.print(Load.s[Load.random()]);
		}
		// TimeUnit.SECONDS.sleep(1);
		System.out.println();
		Runtime.getRuntime().exec("g++");
		Runtime rt = Runtime.getRuntime();
   	 
		return loadCode(n-1);
	}

	static int random()
	{
		return (int)(Math.random()*10);
	}
}