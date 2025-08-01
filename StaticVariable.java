package newPro;
class Student{
	int rollNo;
	String name;
	static int studentCount=0;
	Student(int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
        studentCount++;
	}
	public static void displayStudentCount() {
		System.out.println("Number of students entered: "+studentCount);
	}
}
public class StaticVariable {
	public static void main(String[] args) {
		Student student1=new Student(1,"Ammu");
		Student student2=new Student(2,"Appu");
		Student student3=new Student(3,"Akku");
		Student.displayStudentCount();
	}

}
