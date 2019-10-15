package org.javaro.lecture;

public class Ex1_6 {
	final static int INT_MAX = 2147483647;
	public static void main(String [] args) {
		System.out.println("김지훈"+"-"+"20151623"+"-"+"변수");
		int a = INT_MAX+1;
		System.out.println("int 정수 최대값 2147483747+1?" + a + " 오버플로우 발생");
		float b = 10.6f;
		int c = (int)b;
		System.out.println("float 원래값 = " + b + "를 int로 강제적 형변환하면" +c);
		int d = (int)(b+0.5);
		System.out.println("float 원래값 =" +b+ "를 int로 강제적 형변환으로 반올림하면" + d);
		long e = (long)INT_MAX+1;
		System.out.println("INT_MAX 원래값 = "+INT_MAX + "에 1을 더하여 강제적 형변환하면" +e);
	}
}
