package newP;
class Vehicle{
	String brand;
	String model;
	Vehicle(String brand,String model){
		this.brand=brand;
		this.model=model;
	}
	public void displayDetails() {
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
	}
}
class Car extends Vehicle{
	String fuelType;
	Car(String brand,String model,String fuelType){
		super(brand,model);
		this.fuelType=fuelType;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Fuel Type: "+fuelType);
	}
}
class Electric extends Car{
	double batteryCapa;
	Electric(String brand,String model,String fuelType,double batteryCapa){
		super(brand,model,fuelType);
		this.batteryCapa=batteryCapa;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Battery capacity: "+batteryCapa);
	}
}
public class VehInterit {
   public static void main(String[] args) {
	   Car car=new Car("MG","Hector","petrol");
	   Electric electric=new Electric("TATA","Nexon","Electric",30.5);
	   electric.displayDetails();
   }
}
