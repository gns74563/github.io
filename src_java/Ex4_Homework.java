package org.javaro.lecture;

public class Ex4_Homework {
	public static void main(String args [])
	{
		System.out.println("김지훈" + "20151623" + "-" + "과제");
		int i =1, sum = 0;
		while(i<=100)
		{
			sum+=i++;
		}
		System.out.println("While문 1부터 100까지 합 = "+sum);
		
		sum=0;
		for(i =1; i<= 100; i++)
		{
			sum+= i;
		}
		System.out.println("for문 1부터 100까지 합 = "+sum);
		
		System.out.println(" - 삼각형만들기 -");
		final int N=30;
		for(i=N; i>0; i--)
		{
			for(int j=i; j>0; j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("\n - 원만들기 -");
		final int O=15;
		for(int k = -O; k<= O; k++)
		{
			for(int l = -O; l <= O; l++)
			{
				if(k*k+l*l <= O*O)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
