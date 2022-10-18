package collection;

import java.util.*;

class Student
{
	int age;
	String name;
	int id;
	Student(int age,String name,int id)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	Student(int age,String name)
	{
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return name+" "+age+" "+id;
	}
}
public class ObjectAddingHashMap {

	public static void main(String[] args) {
		HashMap<String,Object> hm=new HashMap<>();
		hm.put("student 1 all values", new Student(24,"golu"));
		hm.put("student 3 all values", new Student(24,"nishant"));
		hm.put("student 5 all values", new Student(24,"alex"));
		hm.put("student 9 all values", new Student(24,"bahubali"));
		hm.put("student 10 all values", new Student(24,"amit",1109));
		hm.put("student 11 all values", new Student(24,"chicha",2345));
		//hm.put(null, null);
		System.out.println(hm);
		System.out.println(".......................................");
		TreeMap<String,Object> tm=new TreeMap<String,Object>(hm);
		System.out.println(tm);
	}

}
