package org.javaro.lecture;

public class Ex4_2 {
	public static void main(String args [])
	{
		System.out.println("김지훈" + "20151623" + "-" + "실습");
		int x=11;
		int End = 15;
		do
		{
			System.out.println("x="+x+",End="+End+","+(x<=End));
			x=x+1;
		}while(x<=End);
	}
}
