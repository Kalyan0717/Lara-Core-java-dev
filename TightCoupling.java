package in.co.lara.TightCoupling;
class Vehicle{
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
class Bus extends Vehicle{
	public void getNumberOfWheels() {
		System.out.println("Bus normally has 6 + 1 wheels..");
	}
}
class Car extends Vehicle{
	public void getNumberOfWheels() {
		System.out.println("Car normally has 4 + 1 wheels..");
	}
}
class Bike extends Vehicle{
	public void getNumberOfWheels() {
		System.out.println("Bike normally has 2 wheels..");
	}
}
class Bycle extends Vehicle{
	public void getNumberOfWheels() {
		System.out.println("Bycle normally has 2 wheels..");
	}
	public void startEngine() {
		System.out.println("Unfortunatly, there is no engine to start the Bycle..");
	}
}
public class TightCoupling {

	public static void main(String[] args) {
		Bus b = new Bus();
		b.checkAirPresure();
		b.startEngine();
		b.getNumberOfWheels();

		Car c = new Car();
		c.checkAirPresure();
		c.startEngine();
		c.getNumberOfWheels();

		Bike b1 = new Bike();
		b1.checkAirPresure();
		b1.startEngine();
		b1.getNumberOfWheels();
		
		Bycle bc = new Bycle();
		bc.checkAirPresure();
		bc.startEngine();
		bc.getNumberOfWheels();
	}
}
