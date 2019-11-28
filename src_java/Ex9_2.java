package org.javaro.lecture;

public class Ex9_2 {
	public static void main(String[] args)
	{
		System.out.println("김지훈" + "-" + "20151623" + "-" + "실습");
		KHello2 khello1 = new KHello2();
		khello1.goodMorning2();
		khello1.goodNight2();
		EHello2 ehello1 = new EHello2();
		ehello1.goodMorning2();
	}
}
interface GoodMorning2
{
	abstract void goodMorning();
}
interface GoodNight2
{
	abstract void goodNight();
}
class KHello2 implements GoodMorning2, GoodNight2
{
	public void goodMorning2()
	{
		System.out.println("좋은 아침");
	}
	public void goodNight2()
	{
		System.out.println("좋은 저녁");
	}
}
class EHello2 implements GoodMorning2
{
	public void goodMorning2()
	{
		System.out.println("Good Morning Dear !!");
	}
}
