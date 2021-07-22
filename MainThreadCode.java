

import java.io.*;
class Code{
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();

		System.out.println("Hello Thread : "+t);
		System.out.println("        Name : "+t.getName());
		System.out.println("    priority : "+t.getPriority());
	}
}