package collection;
import java.util.ArrayList;
public class ArrayListEx {
public String toString()
{
return 	"this is the arraylist ";
}
	public static void main(String[] args)
	{
ArrayList<Object> a=new ArrayList<Object>();
a.add(12);
a.add(13.234);
a.add("sumit");
a.add("hii hello");
a.add(137326586);
a.add(1234.3323575723);
a.add("India");
a.add(2, 'a');
System.out.println(a.contains(13.234)+"/////////////////////////////");
boolean b=a.contains("hii hello");
if(b==true)
System.out.println("present........");
else
	System.out.println("not present.......");
ArrayList<String> al=new ArrayList<String>();
al.add("ram");
al.add("umesh");
al.add("preetam");
al.add("golu");
al.add("amit");
al.add("India");
System.out.println(a);
System.out.println(".....................");
for(Object o:a)
{
	System.out.println(o);
}
System.out.println("...................");
System.out.println(al);
System.out.println("...................");
for(String s:al)
{
	System.out.println(s);
}
System.out.println("....................");
a.addAll(3, al);
for(Object o:a)
	System.out.println(o);
System.out.println(a.contains(al)?"it is present":"it is not present");
Object o1=a.get(5);
System.out.println(o1);
System.out.println("............................................................");
for(int i=0;i<a.size();i++)
{
	System.out.println(a.get(i));
}
System.out.println(a.iterator()+",,,,,,,,,,,,");
System.out.println(a.hashCode());
System.out.println(a.containsAll(al)+">>>>>>>>>>>>>>>>>>");
System.out.println(al.indexOf("India"));
//System.out.println(a.get(30));
	}

}
