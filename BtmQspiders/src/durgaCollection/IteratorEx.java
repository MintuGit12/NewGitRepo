package durgaCollection;
import java.util.*;
public class IteratorEx {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	for(int i=0;i<=10;i++)
	{
		al.add(i);
	}
	System.out.println(al+"............");
	Iterator it=al.iterator();
	while(it.hasNext())
	{
		Integer i=(Integer)it.next();
		if(i%2==0)
		{
			System.out.print(i+"/////");
		}
		else
		{
			it.remove();
		}
	
	}
	System.out.println();
	System.out.println(al+">>>>>>>>>>>");
	}

}
