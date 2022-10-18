package FileHandlingByRaghuSir;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataFOSByte {

	public static void main(String[] args) throws IOException {
	String s="hiiii My name is purusottam kumar singh";
FileOutputStream fout = null;
try
{
	fout=new FileOutputStream("D:\\xyyz.txt");
	/*for(int i=0;i<s.length();i++)
	{
		fout.write(s.charAt(i));
	}*/
	byte[] b=s.getBytes();
	//for(byte b1:b)
	fout.write(b);
}
catch(FileNotFoundException e)
{
	System.out.println("file not found ");
}
finally
{
	fout.flush();
	fout.close();
}
	}

}
