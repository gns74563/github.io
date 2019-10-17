package org.javaro.lecture;

public class Ex3_2 {
	public static void main(String args [])
	{
		System.out.println("김지훈" + "20151623" + "-" + "실습");
		int score = 85;
		if(score>= 90) System.out.println("A학점입니다.");
		else if(score<90 && score>= 80) System.out.println("B학점입니다");
		else if(score<80 && score>=70) System.out.println("C학점입니다");
		else if(score<70 && score>=60) System.out.println("D학점입니다.");
		else System.out.println("F학점입니다");
	}
}
