package org.javaro.lecture;

public class Ex1_9 {
	static double PI = 3.141592;
	public static void main(String [] args) {
		System.out.println("김지훈"+"-"+"20151623"+"-"+"변수");
		int r = 15;
		System.out.println("������" +PI+", ������ " + r + "cm�� ���� �ѷ��� " + 2*PI*r+"cm �Դϴ�");
		System.out.println("2���� : " + Integer.toBinaryString(r));
		System.out.println("8���� : " + Integer.toOctalString(r));
		System.out.println("16���� : " + Integer.toHexString(r));
		double rd = 15.3;
		System.out.println("������" + PI + ", ������ " + r + "cm�� ���� ������" + r*PI*r+"cmcm�Դϴ�");
	}
}
