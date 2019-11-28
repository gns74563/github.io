package org.javaro.lecture;

public class Ex10_4 {
	public static void main(String args[])
	{
		try 
		{
			System.out.println("매개변수로 받은 두 개의 값");
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("a="+a+",b="+b);
			System.out.println("a/b="+a/b);
			System.out.println("나누기 수행됨");
		}
		catch(Exception e)
		{
			System.out.println("예외처리루틴:");
			System.out.println(e+" 예외발생");
		}
		finally
		{
			System.out.println("예외처리후 finally 블럭 수행함");
		}
	}
}
