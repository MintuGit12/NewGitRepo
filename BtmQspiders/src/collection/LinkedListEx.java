package collection;
import java.util.*;
public class LinkedListEx {

	public static void main(String[] args) {
	LinkedList<Integer> l=new LinkedList<Integer>();
	l.add(10);
	l.add(1100);
	l.add(2390);
	l.add(98);
	l.add(837);
	l.add(67);
	l.add(3,567);
	for(Integer i:l)
		System.out.println(i+"  ");
	System.out.println("............");
	Iterator<Integer> it=l.iterator();
	for(int i=0;it.hasNext();i++)
	{
		System.out.println(it.next()+" ");
	}
	System.out.println("...........................");
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	}

}
