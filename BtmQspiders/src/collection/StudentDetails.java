package collection;

public class StudentDetails implements Comparable<Object>{

	int rollNo;
	String stuName;
	int phNo;
	
	public StudentDetails(int rollNo,String stuName,int phNo)
	{
		this.rollNo=rollNo;
		this.stuName=stuName;
		this.phNo=phNo;
	}
	public static void main(String[] args) {

	}
	public String toString()
	{
		return stuName+"-->>"+rollNo+"--->>"+phNo;
		
	}
@Override
public int compareTo(Object o) {
	int roll1=this.rollNo;
	StudentDetails s=(StudentDetails)o;
	int roll2=s.rollNo;
	if(roll1>roll2)
	return -1;
	else if(roll1<roll2)
		return +1;
	else
		return 0;
}
		
		
	}


