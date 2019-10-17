package org.javaro.lecture;
import java.math.BigDecimal;
public class Ex2_2 {
	public static void main(String [] args) {
		System.out.println("김지훈"+"-"+"20151623"+"-"+"실습");
		float a= 3.5f;
		float b= 2.1f;
		BigDecimal bda = new BigDecimal(String.valueOf(a));
		BigDecimal bdb = new BigDecimal(String.valueOf(b));
		bda = bda.add(bdb);
		System.out.println("a=3.5f; a=a+2.1; a=" + bda.toString());
		bda = bda.add(bdb);
		System.out.println("a=5.6; a=a+2.1; a=" + bda.toString());
		bda = bda.subtract(bdb);
		System.out.println("a=7.7; a=a-2.1; a=" + bda.toString());
		int c = 2;
		BigDecimal bdc = new BigDecimal(String.valueOf(c));
		bda = bda.multiply(bdc);
		System.out.println("a=5.6; a=a*2; a=" + bda.toString());
		bda = bda.divide(bdc);
		System.out.println("a=11.2; a=a/2; a=" + bda.toString());
		bda = bda.remainder(bdc);
		System.out.println("a=5.6; a=a%2; 나머지 ="+bda.toString());
	}
}
