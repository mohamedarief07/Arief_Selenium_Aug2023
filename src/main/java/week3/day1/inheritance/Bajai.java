package week3.day1.inheritance;

public class Bajai extends Auto {
	public void selfStart() {
		System.out.println("selfStart -> from Bajaj class");

	}

	public static void main(String[] args) {
		Bajai obj =new Bajai();
		obj.applyBreak();
		obj.applyMeter();
		obj.soundHorn();
		obj.selfStart();

	}

}
