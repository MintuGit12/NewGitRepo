package collection;
import java.util.*;
class A
{
	String name;int roll;int age;
	A(String name,int roll,int age)
	{
		this.name=name;
		this.age=age;
		this.roll=roll;
	}
	public String toString()
	{
		return name+" "+age+" "+roll;
	}
}
public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap<Object,Object> hs=new HashMap<Object,Object>();
		hs.put("s1",new A("ram",123,23));
		hs.put("s2",new A("ramesh",124,23));
		hs.put("s3",new A("rahim",125,24));
		hs.put("s4",new A("rahul",126,23));
		hs.put("s5",new A("rakesh",127,23));
		hs.put("s6",new A("rawal",128,23));
		System.out.println(hs);
		
		
	}

}
