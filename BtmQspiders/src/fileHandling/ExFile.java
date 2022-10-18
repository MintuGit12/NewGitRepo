package fileHandling;
import  java.io.*;
public class ExFile {

	public static void main(String[] args)throws IOException 
	{
		PrintWriter pw=new PrintWriter("d://print.txt");
		pw.println("its a new file creacted");
		pw.println("its created on 28/06/22");
		pw.println("created to chech the input way");
		pw.close();
	}

}
