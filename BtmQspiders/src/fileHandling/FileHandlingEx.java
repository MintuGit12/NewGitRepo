package fileHandling;
import java.io.*;
public class FileHandlingEx {

	public static void main(String[] args)throws IOException 
	{
		PrintWriter pw=new PrintWriter("d://abc.txt");
		pw.println("hello man its d first txt file");
		pw.println("chalo shuru krte h");
		pw.print("helllooooo");
		pw.close();
	}

}
