package org.javaro.lecture;

public class Ex3_Homework {
	public static void main(String args [])
	{
		System.out.println("김지훈" + "20151623" + "-" + "숙제");
		String strLove ="I Love java.";
		if(strLove.contains("java")) System.out.println("Yes, java");
		else System.out.println("No, java");
		
		int score = 90;
		if(score >= 90)
		{
			System.out.println("학점=A");
		}
		else if(score >= 80)
		{
			System.out.println("학점=B");
		}
		else if(score >= 70)
		{
			System.out.println("학점=C");
		}
		else
		{
			System.out.println("학점=F");
		}
		String gender="Male";
		if(gender == "Male")
		{
			System.out.println("남자");
		}
		else
		{
			System.out.println("남자아님");
		}
		if(gender.equalsIgnoreCase("male"))
		{
			System.out.println("남자2");
		}
		else
		{
			System.out.println("남자아님2");
		}
	}
}
