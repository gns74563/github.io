package org.javaro.lecture;
import java.util.*;
public class Ex12_1 {
	public static void main(String args[])
	{
		ArrayList arrayList = new ArrayList();
		arrayList.add("first");
		arrayList.add("second");
		arrayList.add("third");
		for(int i =0;i<arrayList.size();i++)
		{
			System.out.println((String)arrayList.get(i));
		}
		//배열 예제
		String[] arrayObj = new String[2];
		arrayObj[0] = "fist";
		arrayObj[1] = "second";
		arrayObj[2] = "third";
	}
}
