package org.javaro.lecture;
import java.io.*;
public class Ex11_8 {
	public static void main(String[] args)
	{
		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("이름입력");
			String name = br.readLine();
			System.out.println("이름은 "+name+"입니다");
		}
		catch(IOException ioe)
		{
			System.out.println("파일없음");
		}
	}
}
