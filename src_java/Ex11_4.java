package org.javaro.lecture;
import java.io.*;
public class Ex11_4 {
	public static void main(String[] args)
	{
		float[][] indat = new float[10][3];
		try {
			File csv = new File("C:\\Users\\김지훈\\Desktop\\JAVA프로그래밍\\1.csv");
			BufferedReader br = new BufferedReader(new FileReader(csv));
			String line = "";
			int row = 0, i;
			while((line = br.readLine())!=null)
			{
				String[] token = line.split(",",-1);
				for(i=0;i<3;i++)
				{
					indat[row][i] = Float.parseFloat(token[i]);
				}
				for(i=0;i<3;i++)
				{
					System.out.print(indat[row][i]+",");
				}
				System.out.println("");
				row++;
			}
			br.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
