package org.javaro.lecture;

public class Ex7_2 {
	public static void main(String [] args)
	{
		System.out.println("김지훈" + "-" + "20151623" + "-" + "실습");
		String name, rank, height, weight, serivce;
		name = "홍길동";
		rank = "1등병";
		System.out.println(name);
		System.out.println(rank);
		height="170";
		System.out.println(height);
		swimming(name);
		firing(name);
	}
	static void swimming(String name)
	{
		System.out.println(name+"잠수하기");
	}
	static void firing(String name)
	{
		System.out.println(name+"대포발사");
	}
}
