package org.javaro.lecture;

import java.io.*;

public class Ex11_3 {
	public static void main(String [] args)
	{
		try
		{
			//WRITE
			FileOutputStream fout = new FileOutputStream("C:\\Users\\김지훈\\Desktop\\JAVA프로그래밍\\t.out");
			for(int i = 0; i< 5; i++)
			{
				fout.write(i);
			}
			fout.close();
			//READ
			FileInputStream fin = new FileInputStream("C:\\Users\\김지훈\\Desktop\\JAVA프로그래밍\\t.out");
			InputStreamReader in = new InputStreamReader(fin);
			int c;
			while((c=in.read()) != -1)
			{
				System.out.print(c);
			}
			fin.close();
		}
		catch(IOException ioe)
		{
			System.out.println("파일없음");
		}
	}
}
