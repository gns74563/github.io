package org.javaro.lecture;
import java.io.*;
import java.util.*;
public class Ex12_H {
	public static void main(String[] args)
	{
		try {
			File csv = new File("C:\\Users\\김지훈\\Desktop\\JAVA프로그래밍\\1.csv");
			FileWriter fin = new FileWriter("C:\\Users\\김지훈\\Desktop\\JAVA프로그래밍\\3.csv");
			BufferedReader br = new BufferedReader(new FileReader(csv));
			String line = "";
			int row = 0;
			while((line = br.readLine()) != null)
			{
				List<String> list = Arrays.asList(line.split(","));
				for(int i = 0; i < list.size(); i++)
				{
					if(i == (list.size()-1))
					{
						System.out.print(list.get(i));
						fin.write(list.get(i) + "");
					}
					else
					{
						System.out.print(list.get(i) + ",");
						fin.write(list.get(i) + ",");
					}
				}
				System.out.println("");
				fin.write("\n");
				row++;
			}
			br.close();
			fin.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}


