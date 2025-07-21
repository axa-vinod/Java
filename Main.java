/**
 * Aksa Vinod
 * 21-07-2025
 */
package newProject;
class Calculator {
	public void add(int a,int b) {
		int add=a+b;
		System.out.println("Adding of two integers "+ add);
	}
	public void add(int d,int e,int f) {
		int add=d+e+f;
		System.out.println("Adding 3 integers "+add);
	}
	public void add(double a,double b) {
		double add=a+b;
		System.out.println("Adding 2 double values "+add);
	}
	public void add(String a,int b) {
		String add=a+b;
		System.out.println("Concatinated: "+add);
	}
}
public class Main {
  public static void main(String[] args) {
	 Calculator calculator=new Calculator();
	 calculator.add(3, 7);
	 calculator.add(10,15, 25);
	 calculator.add(2.5, 1.5);
	 calculator.add("Hai ", 10);
  }
}
