package org.javaro.lecture;

public class Ex5_4 {
	public static void main(String [] args)
	{
		System.out.println("김지훈" + "-" + "20151623" + "-" + "실습");
		int temp;
		int [] a= new int [] {8,5,2,3,6};
		for(int i = 0; i<a.length-1; i++)
		{
			for(int j =i+1; j<a.length-1; j++)
			{
				if(a[i]>a[j])
				{
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for(int i =0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
