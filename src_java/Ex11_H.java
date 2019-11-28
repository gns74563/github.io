package org.javaro.lecture;
import java.io.*;
public class Ex11_H {
	public static void main(String[] args)
	{
		System.out.println("김지훈" + "20151623" + "-" + "과제");
		float[][] indat = new float[10][3];
		try 
		{
			File csv = new File("C:\\Users\\김지훈\\Desktop\\JAVA프로그래밍\\1.csv");
			BufferedReader br = new BufferedReader(new FileReader(csv));
			FileWriter fin = new FileWriter("C:\\Users\\김지훈\\Desktop\\JAVA프로그래밍\\2.csv");
			String line = "";
			int row = 0,i;
			while((line= br.readLine())!= null)
			{
				String[] token = line.split(",",-1);
				for(i=0; i<3; i++) indat[row][i] = Float.parseFloat(token[i]);
				for(i=0; i<3; i++)
				{
					if(i==2)
					{
						System.out.print(indat[row][i]);
						fin.write(indat[row][i]+"");
					}
					else
					{
						System.out.print(indat[row][i]+",");
						fin.write(indat[row][i]+",");
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