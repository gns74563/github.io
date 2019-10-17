package org.javaro.lecture;

public class Ex2_H2 {
	public static void main(String [] args)
	{
		System.out.println("김지훈" + "20151623" + "-" + "4주차과제");
		int a=100;
		int b=50;
		System.out.println("a>b?"+((a>b)?a:b));
		
		double c = Math.pow(2.0, 32.0);
		System.out.println("2.0의 32.0 제곱은 "+(int)c + "입니다.");
		
		System.out.println(3>3);
		System.out.println(4<3);
		System.out.println(4>=3);
		System.out.println(3<=3);
		System.out.println(4==3);
		System.out.println(4!=3);
		
		System.out.println(" - 구분선 - ");
		System.out.println((3>3) && (4>3));
		System.out.println((3<3) && (4<3));
		System.out.println((3>3) || (4<=3));
		System.out.println((3<3) || (4>3));
		System.out.println(!(4==3));
		System.out.println(!(4!=3));
		
		System.out.println("- 구분선2 - ");
		int x=6, y=7;
		System.out.println(!(x>6));
		System.out.println(x==6&&x==5);
		System.out.println(x==6||x==5);
		System.out.println(x>-1 && y<10);
		System.out.println(x>10 && x<5);
	}
}
