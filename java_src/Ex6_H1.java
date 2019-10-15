package org.javaro.lecture;

public class Ex6_H1 {
	public static void main(String [] args)
	{
		System.out.println("김지훈" + "-" + "20151623" + "-" + "과제");
		float tempC = temp_convert(70.0f);
		System.out.println("temp C = "+tempC+" C");
	}
	static float temp_convert(float farenheit)
	{
		float celsius = (farenheit -32)*(5.0f/9.0f);
		return celsius;
	}
}
