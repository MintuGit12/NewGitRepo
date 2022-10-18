package collection;

import java.util.Comparator;

public class Employee implements Comparable<Object>{
int empNo;
double sal;
String eName;

public Employee(int empNo,double sal,String eName)
{
	this.empNo=empNo;
	this.eName=eName;
	this.sal=sal;
}
	public static void main(String[] args) {
		

	}
	public String toString()
	{
		return eName+"-->>"+sal+"-->>"+empNo;
		
	}
	@Override
	public int compareTo(Object o) {
		int emp1=this.empNo;
		Employee e1=(Employee)o;
		int emp2=e1.empNo;
		if(emp1>emp2)
		return -1;
		else if(emp1<emp2)
			return +1;
		else 
			return 0;
	}

}
