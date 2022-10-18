package FileHandlingByRaghuSir;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFIS {

	public static void main(String[] args) throws InterruptedException {
		FileInputStream fis = null;
		try
		{
			fis=new FileInputStream("D:\\java\\AdvArray.java");
			int bt,count=1;
			while((bt=fis.read())!=-1)
			{
				if(bt=='\n')
					count ++;
				System.out.print((char)bt);
				Thread.sleep(20);
			}
			System.out.println(count);
		}
catch(FileNotFoundException e)
		{
	System.out.println("file not found");
		}
		catch(IOException e)
		{
			System.out.println("file is not readable");
		}
		finally
		{
			try
		{
				fis.close();
		}
			catch(IOException e)
			{
				System.out.println("stream is not closable");
			}
		}
	}

}
