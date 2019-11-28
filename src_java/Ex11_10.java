package org.javaro.lecture;
import java.io.*;
public class Ex11_10 {
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("C:\\Users\\김지훈\\Desktop\\JAVA프로그래밍\\log.txt");
		PrintStream printStream = new PrintStream(new FileOutputStream(file));
		System.out.println("Hello Word!");
		System.out.println("ERROR!");
		PrintStream sysout = System.out;
		System.setOut(printStream);
		System.setErr(printStream);
		System.out.println("Hello Word!");
		System.out.println("ERROR!");
		System.setOut(sysout);
		System.out.println("Hello Word!");
		System.out.println("ERROR!");
		printStream.close();
	}
}
