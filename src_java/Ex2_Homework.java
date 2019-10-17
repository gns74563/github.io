package org.javaro.lecture;
public class Ex2_Homework
{
	public static void main(String [] args)
	{
		System.out.println("김지훈" + "20151623" + "-" + "4주차과제");
		int secondVar = 1000;
		int minOut = secondVar / 60;
		int secondOut = secondVar % 60;
		System.out.println("minOut = " + minOut +", secondOut = " + secondOut);
		
		int a = 10;
		a++; // a += 1; a=a+1; 모두동일
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a++);
		
		System.out.println(1%3);
		System.out.println(2%3);
		System.out.println(3%3);
		System.out.println(4%3);
		System.out.println(5%3);
		System.out.println(6%3);
		
		int b = 100;
		a = 100;
		System.out.println("a와 b는 같은 크기?" +(a==b));
		System.out.println("a가 b보다 큰가요?" + (a>b));
		System.out.println("a=b이고 a>30인가요?" + ((a==b)&&(a>b)));
		System.out.println("a가 50이 아닌가요?" + !(a==50));
		
	}
}
