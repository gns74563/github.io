package org.javaro.lecture;

public class Ex2_5 {
	public static void main(String [] args) {
		System.out.println("논리식 결과 인쇄");
		System.out.println("2>2 결과="+(2>2));
		boolean flag;
		int b=2;
		flag = (2<b);
		System.out.println("2<b 불리언 변수 flag="+flag);
		flag=(2>b);
		System.out.println("2>b 불리언 변수 flag="+flag);
		flag=(2<=b);
		System.out.println("2<=b 불리언 변수 flag="+flag);
		flag=(2>=b);
		System.out.println("2>=b 불리언 변수 flag="+flag);
		flag=(2==b);
		System.out.println("2==b 불리언 변수 flag="+flag);
		flag=(2!=b);
		System.out.println("2!=b 불리언 변수 flag="+flag);
		
	}
}
