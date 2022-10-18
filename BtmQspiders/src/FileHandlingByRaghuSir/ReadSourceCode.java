package FileHandlingByRaghuSir;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadSourceCode {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		try
		{
			fis=new FileInputStream("C:\\Users\\Adarsh\\eclipse-workspace\\BtmQspiders\\src\\FileHandlingByRaghuSir\\ReadSourceCode.java");
			byte[] b=new byte[fis.available()];
			/*for(int i=0;i<b.length;i++)
			{
			b[i]=(byte) fis.read();
			}*/
			fis.read(b);
			String s=new String(b);
			System.out.println(s);
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
