package coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
class BB
{
	String name;
	BB(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return name;
	}
}
public class ListTypeCollection {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(987);
		al.add(39);
		al.add(94);
		al.add(24);
System.out.println(al.get(1));
Collections.sort(al);
Collections.reverse(al);
for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i));
}
System.out.println(".........................");
for(Object o:al)
	System.out.println(o);
	BB a1=new BB("Ram");
	BB a2=new BB("shayam");
	BB a3=new BB("raghu");
	ArrayList<BB> a=new ArrayList<BB>();
	a.add(a1);
	a.add(a2);
	a.add(a3);
	System.out.println(a);
HashMap<Integer,String> hs=new HashMap<>();
hs.put(1, "manoj");
hs.put(2, "rahim");
hs.put(3, "roman");
System.out.println(hs);
Set s=(Set) hs.values();

for(int i=0;i<hs.size();i++)
{
	System.out.println(hs.get(i));
}
}
}
