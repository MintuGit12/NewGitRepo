package rNageshwar;
import java.util.Scanner;
public class ArrayWithObj 
{
int id;
String name;
ArrayWithObj(int id,String name)
{
	this.id=id;
	this.name=name;
}

public void disp()
{
	System.out.println(id);
	System.out.println(name);
}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	ArrayWithObj arr[]=new ArrayWithObj[2];
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("enter the id:");
		int id=s.nextInt();
		s.next();
		System.out.println("enter the name:");
		
		String name=s.nextLine();
		arr[i]=new ArrayWithObj(id,name);
	}
	for(int i=0;i<arr.length;i++)
	{
		arr[i].disp();
	}
	}

}
