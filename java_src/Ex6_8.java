package org.javaro.lecture;

public class Ex6_8 {
	public static void main(String [] args)
	{
		System.out.println("김지훈" + "-" + "20151623" + "-" + "실습");
		double x,y;
		x=10.0;
		y=20.0;
		double sub_value = fn_sub(x,y);
		System.out.println("뺴기="+sub_value);
	}
	public static double fn_sub(double x, double y)
	{
		double result;
		result = x-y;
		return result;
	}
}
