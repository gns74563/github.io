package org.javaro.lecture;

public class Ex7_R2 {
	public static void main(String[] args)
	{
		System.out.println("김지훈" + "-" + "20151623" + "-" + "과제");
		float x = 10.0f;
		float y = 10.0f;
		
		System.out.println("----------곱하기----------");
		
		System.out.println("(함수 프로그램)");
		float t1;
		t1 = fun1(x,y);
		System.out.println(t1);
	}
	public static float fun1(float x, float y)
	{
		float sum;
		sum = x * y;
		return sum;
	}
}