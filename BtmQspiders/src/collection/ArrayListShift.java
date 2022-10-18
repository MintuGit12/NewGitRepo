package collection;
import java.util.*;
public class ArrayListShift {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);	
	al.add(46);	
	al.add(25);	
	al.add(90);	
	al.add(100);	
Iterator<Integer> it=al.iterator();
while(it.hasNext())
{
	int x=it.next();
	if(x==25)
	{
		it.remove();
	}
	else
	{
		System.out.println(it.next());
	}
}
//System.out.println(al);
	}

}
