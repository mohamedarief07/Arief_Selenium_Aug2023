package week3.day1.inheritance;

public class Car extends Vehicle {

	public void applyGear() {
		System.out.println("Gear Applied--> from Car class");

	}
public static void main(String[] args) {
	Car obj =new Car();
	obj.applyBreak();
	obj.applyGear();
	obj.soundHorn();
	
}
}
