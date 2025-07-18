package newProj;
import java.util.Scanner;
class Student{
	String name;
	int rollNumber;
	String department;
	
	public void printStudentInfo() {
			System.out.println("Name: "+name);
			System.out.println("Roll number:"+rollNumber);
			System.out.println("Department: "+department);
		
	}
	
	Student(String name,int rollNumber,String department){
		this.name=name;
		this.rollNumber=rollNumber;
		this.department=department;
	}
}
public class StudentDetails {
  public static void main(String[] args) {
	  String name;
	  int rollNumber;
	  String department;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your name");
	  name=sc.nextLine();
	  System.out.println("Enter your roll number");
	  rollNumber=sc.nextInt();
	  sc.nextLine();
	  System.out.println("Enter your department");
	  department=sc.nextLine();
																															
	  Student student=new Student(name,rollNumber,department);
	  student.printStudentInfo();
  }
}
