package org.javaro.lecture;

import java.io.*;

public class Ex11_2 {
	public static void main(String[] args)
	{
		try
		{
		FileWriter fout = new FileWriter("C:\\Users\\김지훈\\Desktop\\JAVA프로그래밍\\write.txt");
		int a = 10, b = 5;
		fout.write("더하기 a+b="+(a+b)+"\n");
		fout.write("뺴기 a-b="+(a-b)+"\n");
		fout.close();
		System.out.println("파일작성 완료");
		}
		catch(Exception e)
		{
			System.out.println("파일지정 하세요");
		}
	}
}
