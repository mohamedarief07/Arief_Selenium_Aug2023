package week3.day1.inheritance;

public class Audi  extends Car {
	
	public void sunRoof() {
		System.out.println("sun Roof> from Audi class");

	}


	public static void main(String[] args) {
		Audi obj =new Audi();
		obj.applyBreak();
		obj.applyGear();
		obj.soundHorn();
		obj.sunRoof();


	}

}
