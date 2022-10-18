package collection;
import java.util.*;
public class ArrayListEx1 {

	public static void main(String[] args) {
	ArrayList<Integer> al1=new ArrayList<>();
	al1.add(100);
	al1.add(130);
	al1.add(300);
	al1.add(50);
	al1.add(560);
	al1.add(100);
	ListIterator<Integer> li=al1.listIterator();
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	System.out.println(".......................");
	Collections.sort(al1);
	Collections.sort(al,Collections.reverseOrder());
	}

}
