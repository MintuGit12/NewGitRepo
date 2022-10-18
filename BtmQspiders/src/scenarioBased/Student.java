package scenarioBased;

public class Student extends Person
{
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", perc=" + perc + ", age=" + age + ", name=" + name + "]";
	}
	Student(String name, int age,int id,float perc) {
		super(name, age);
		this.id=id;
		this.perc=perc;
	}
	int id;
	float perc;
	
}
