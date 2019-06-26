
public class ToStringMethod {
	public static void main(String[] args) {
		
		Student s1=new Student(101,"anne");
		System.out.println(s1);
	}

}
class Student
{
	int rollno;String name;
	public Student(int rollno, String name) {
		
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return rollno+" : "+name;
	}
	
	
}
