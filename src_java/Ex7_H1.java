package org.javaro.lecture;

public class Ex7_H1 {
	public static void main(String [] args)
	{
		System.out.println("김지훈" + "-" + "20151623" + "-" + "실습");
		float x = 10.0f;
		float y = 10.0f;
		System.out.println("-절차프로그래밍-");
		float t1 = x*y;
		System.out.println("곱하기 : "+t1);
		float t2 = x*y;
		System.out.println("4각형면적 : "+t2);
		float t3 = 0.5f*x*y;
		System.out.println("3각형면적 : "+t3);
		System.out.println("\n-함수프로그래밍-");
		float h1 = T1(x,y);
		System.out.println("곱하기 : "+h1);
		float h2 = T2(x,y);
		System.out.println("4각형면적 : "+h2);
		float h3 = T3(x,y);
		System.out.println("3각형면적 : "+h3);
		System.out.println("\n-객체프로그래밍-");
		Test z1 = new Test(10, 10);
		System.out.println("곱하기 : "+z1.H1());
		System.out.println("4각형면적 : "+z1.H2());
		System.out.println("3각형면적 : "+z1.H3());
		System.out.println("\n-자바빈프로그래밍-");
		Test2 z2 = new Test2();
		z2.setX(10);
		z2.setY(10);
		System.out.println("곱하기 : "+z2.getZ1());
		System.out.println("4각형면적 : "+z2.getZ2());
		System.out.println("3각형면적 : "+z2.getZ3());
		
	}
	public static float T1(float x, float y)
	{
		return x*y;
	}
	public static float T2(float x, float y)
	{
		return x*y;
	}
	public static float T3(float x, float y)
	{
		return 0.5f*x*y;
	}
}
class Test
{
	float x,y;
	Test(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	public float H1()
	{
		return x*y;
	}
	public float H2()
	{
		return x*y;
	}
	public float H3()
	{
		return 0.5f*x*y;
	}
}
class Test2
{
	float x,y;

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	public float getZ1() {
		return this.x*this.y;
	}
	public float getZ2() {
		return this.x*this.y;
	}
	public float getZ3() {
		return 0.5f*this.x*this.y;
	}
}