package in.co.lara.TightCoupling;
class Vehicle1{
	public void checkAirPresure() {
		System.out.println("Before Long journey, Check for AirPressure.. Else, Long journey will definately happen..");
		}
	public void startEngine() {
		System.out.println("Insert key..Stsrt engine.. Shift gare.. move the vehicle..");
	}
	public void getNumberOfWheels() {
		System.out.println("Normally, Vehicke contains 4 wheels..");
	}
}
class Bus1 extends Vehicle1{
	public void getNumberOfWheels() {
		System.out.println("Bus normally has 6 + 1 wheels..");
	}
}
class Car1 extends Vehicle1{
	public void getNumberOfWheels() {
		System.out.println("Car normally has 4 + 1 wheels..");
	}
}
class Bike1 extends Vehicle1{
	public void getNumberOfWheels() {
		System.out.println("Bike normally has 2 wheels..");
	}
}
class Bycle1 extends Vehicle1{
	public void getNumberOfWheels() {
		System.out.println("Bycle normally has 2 wheels..");
	}
	public void startEngine() {
		System.out.println("Unfortunatly, there is no engine to start the Bycle..");
	}
}
class Flexible{
	public void polymorphic(Vehicle1 v1) {
		v1.checkAirPresure();
		v1.startEngine();
		v1.getNumberOfWheels();
	}
}
public class TightCouplingPolymorphic {
	public static void main(String[] args) {
		Flexible f = new Flexible();
		f.polymorphic(new Bus1());
		f.polymorphic(new Car1());
		f.polymorphic(new Bike1());
		f.polymorphic(new Bycle1());
	}
}
