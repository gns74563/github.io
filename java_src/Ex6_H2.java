package org.javaro.lecture;

public class Ex6_H2 {
	public static void main(String [] args)
	{
		System.out.println("김지훈" + "-" + "20151623" + "-" + "과제");
		int x1, y1, x2, y2, x3, y3, x4, y4;
		x1 = 0;
		y1 = 0;
		x2 = 10;
		y2 = 10;
		x3 = 10;
		y3 = 15;
		x4 = 25;
		y4 = 60;
		double c = dLength(x1,y1,x2,y2);
		System.out.println("1. 두 점 사이 거리는 "+c);
		double d = dLength(x3,y3,x4,y4);
		System.out.println("2. 두 점 사이 거리는 "+d);
	}
	static double dLength(int x1, int y1, int x2, int y2)
	{
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}
}
