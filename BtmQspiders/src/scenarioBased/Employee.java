package scenarioBased;

public class Employee extends Person{
int eid;
double sal;
	Employee(String name, int age,int eid,double sal) {
		super(name, age);
		this.eid=eid;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", sal=" + sal + ", age=" + age + ", name=" + name + "]";
	}

}
