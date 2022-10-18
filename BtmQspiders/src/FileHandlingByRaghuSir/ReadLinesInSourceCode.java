package FileHandlingByRaghuSir;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadLinesInSourceCode {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		try
		{
			fis=new FileInputStream("C:\\\\Users\\\\Adarsh\\\\eclipse-workspace\\\\BtmQspiders\\\\src\\\\FileHandlingByRaghuSir\\\\ReadLinesInSourceCode.java");
			int bt;
			int count=1;
			while((bt=fis.read())!=-1)
			{
				System.out.print((char)bt);
				if(bt=='\n')
					count++;
			}
			System.out.println(count);
		}
	
		catch(Exception e)
		{
			System.out.println("file not found");
		}
finally
{
	fis.close();
}
	}

}
