package collection;
import java.util.*;
import java.util.Scanner;
import java.util.ConcurrentModificationException;
public class ArrayListIterator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter arraylist heterogenious elements");
		ArrayList<Object> al=new ArrayList<Object>();
		System.out.println("enter int value");
		al.add(sc.nextInt());
		System.out.println("enter string value");
		al.add(sc.next());
		System.out.println("enter float value");
		al.add(sc.nextFloat());
		System.out.println("enter int value");
		al.add(sc.nextInt());
		System.out.println("enter single string value");
		al.add(sc.next());
		//System.out.println("enter int value");
		//al.add(sc.nextInt());
		//System.out.println("enter int value");
		//al.add(sc.nextInt());
		
		//System.out.println(al);
		Iterator<Object> it=al.iterator();
		//while(it.hasNext())
		//{
			
			//System.out.println(it.next());
			//if(it.hasNext())
			//{
				//System.out.println("add the string value");
				
				
			//}
		for(Object itrator: al) {
			if (al.contains("gotham"))
				al.add(al.indexOf("gotham"),sc.next());
		}
		System.out.println(al);
			
			
	
			
			
		//}
		//System.out.println(al);
	}

}
