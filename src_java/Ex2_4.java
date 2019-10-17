package org.javaro.lecture;

public class Ex2_4 {
	public static void main(String [] args) {
		System.out.println("김지훈"+"-"+"20151623"+"-"+"실습");
		System.out.println("++b, d++ 인쇄");
		int a, b=1;
		a=++b;
		System.out.println("전치:a="+a+",b="+b);
		int c, d=1;
		c=d++;
		System.out.println("후치:c="+c+",d="+d);
	}
}
