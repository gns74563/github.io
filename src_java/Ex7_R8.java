package org.javaro.lecture;

public class Ex7_R8 {
	public static void main(String[] args)
	{
		System.out.println("김지훈" + "-" + "20151623" + "-" + "과제");
		float x = 10.0f;
		float y = 10.0f;
		
		System.out.println("----------4각형 면적----------");
		
		System.out.println("(자바빈 프로그램)");
		cl4 t1 = new cl4();
		t1.setX(x);
		t1.setY(y);
		System.out.println(t1.getX()*t1.getY());
	}
}
class cl4
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
}
