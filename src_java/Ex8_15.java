package org.javaro.lecture;

public class Ex8_15 {
	public static void main(String [] args)
	{
		System.out.println("김지훈" + "-" + "20151623" + "-" + "실습");
		WebCount1 c1 = new WebCount1();
		WebCount1 c2 = new WebCount1();
		
	}
}
class WebCount1
{
	int count = 0;
	WebCount1()
	{
		this.count++;
		System.out.println(this.count);
	}
}
