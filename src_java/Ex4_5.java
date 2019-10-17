package org.javaro.lecture;

public class Ex4_5 {
	public static void main(String args [])
	{
		System.out.println("김지훈" + "20151623" + "-" + "실습");
		int b = 2;
		for(int i =0; i<5; i++)
		{
			if(i==b) continue;
			System.out.println("i="+i);
		}
	}
}
