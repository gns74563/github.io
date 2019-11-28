package org.javaro.lecture;
import java.io.*;
public class Ex11_7 {
	public static void main(String[] args)
	{
		int num[] = {1,2,3,4,5};
		try
		{
			FileOutputStream fout = new FileOutputStream("C:\\Users\\김지훈\\Desktop\\JAVA프로그래밍\\t.out");
			for(int i=0;i<5;i++) fout.write(num[i]);
			fout.close();
			
			FileInputStream fin = new FileInputStream("C:\\Users\\김지훈\\Desktop\\JAVA프로그래밍\\t.out");
			int c;
			while((c=fin.read())!=-1)
			{
				System.out.print(c);
			}
			fin.close();
		}
		catch(IOException ioe)
		{
			System.out.println("파일없음");
		}
		catch(Exception e)
		{
			System.out.println("파일지정 하세요");
		}
	}
}
