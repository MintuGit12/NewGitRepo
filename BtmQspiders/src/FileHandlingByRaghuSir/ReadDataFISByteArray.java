package FileHandlingByRaghuSir;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFISByteArray {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		try
		{
			fis=new FileInputStream("D:\\java\\Array2.java");
			System.out.println(fis.available());
		byte[] bt=new byte[fis.available()];
		fis.read(bt);
		int count=1;
		for(int i=0;i<bt.length;i++)
		{
			System.out.print((char)bt[i]);
		}
		String s=new String(bt);
		System.out.println(s);
		
		System.out.println(fis.available());
		}
		catch(FileNotFoundException e)
		{
			System.out.println("seriously man file not found");
		}
catch(IOException e)
		{
	System.out.println("file is not readable");
		}
		finally
		{
			fis.close();
		}
	}

}
