package org.javaro.lecture;

public class Ex7_R11 {
	public static void main(String[] args)
	{
		System.out.println("김지훈" + "-" + "20151623" + "-" + "과제");
		float x = 10.0f;
		float y = 10.0f;
		
		System.out.println("----------3각형 면적----------");
		
		System.out.println("(객체 프로그램)");
		cl5 t1 = new cl5();
		t1.x = x;
		t1.y = y;
		System.out.println(t1.x*t1.y/2);
	}
}
class cl5
{
	float x,y;
}