package org.javaro.lecture;

public class Ex6_16 {
	public static void main(String [] args)
	{
		System.out.println("김지훈" + "-" + "20151623" + "-" + "실습");
		int x1, x2, y1, y2;
		x1=10;
		x2=20;
		y1=30;
		y2=60;
		double c = dlength(x1,y1,x2,y2);
		System.out.println("두 점사이 거리는"+c);
	}
	static double dlength(int x1, int y1, int x2, int y2)
	{
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}
}
