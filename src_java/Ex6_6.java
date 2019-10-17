package org.javaro.lecture;

public class Ex6_6 {
	public static void main(String [] args)
	{
		System.out.println("김지훈" + "-" + "20151623" + "-" + "실습");
		double x,y;
		x=10.0;
		y=20.0;
		double add_value=fn_add(x,y);
		System.out.println("더하기="+add_value);
	}
	public static double fn_add(double x, double y)
	{
		double result;
		result = x+y;
		return result;
	}
}
