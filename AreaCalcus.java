/**
 * Aksa Vinod
 * 21-07-2025
 */
package newProject;
class AreaCalculator{
	public void area(double rad){
		double area=3.14*rad*rad;
		System.out.println("Area of circle: "+area);
	}
	public void area(double len,double width) {
		double area=len*width;
		System.out.println("Area of rectangle: "+area);
	}
	public void area(float base,float height) {
		float area=0.5f*base*height;
		System.out.println("Area of triangle: "+area);
	}
	public void area(int a) {
		int area=a*a;
		System.out.println("Area of square: "+area);
	}
}
public class AreaCalcus {
	public static void main(String[] args) {
		AreaCalculator areaCalculator=new AreaCalculator();
		areaCalculator.area(5.5);
		areaCalculator.area(2.5,3.0);
		areaCalculator.area(1.2f,3.2f);
		areaCalculator.area(6);
	}

}
