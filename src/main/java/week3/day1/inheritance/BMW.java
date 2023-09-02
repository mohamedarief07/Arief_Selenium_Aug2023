package week3.day1.inheritance;

public class BMW extends Car {
	
	public void airBag() {
		System.out.println("air Bag-> from BMW class");

	}

	public static void main(String[] args) {
		BMW obj =new BMW();
		obj.applyBreak();
		obj.applyGear();
		obj.soundHorn();
		obj.airBag();

	}

}
