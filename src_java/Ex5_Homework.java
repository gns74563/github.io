package org.javaro.lecture;

public class Ex5_Homework {
	public static void main(String [] args)
	{
		System.out.println("김지훈" + "-" + "20151623" + "-" + "과제");
		int ptr = 0;
		int[]prime = new int[30];
		
		prime[ptr++] = 2;
		
		for(int n = 3; n<=30; n += 2) {
			int i;
			for(i = 1; i<ptr;i++) {
				if(n%prime[i]==0)
					break;
				else continue;
			}
			if(ptr==i)
				prime[ptr++] = n;
		}
		for(int i = 0; i<= ptr-1; i++)
			System.out.println(prime[i]+", ");
	}
}
