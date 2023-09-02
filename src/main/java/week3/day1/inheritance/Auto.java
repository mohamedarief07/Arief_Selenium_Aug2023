package week3.day1.inheritance;

public class Auto extends Vehicle{
	
	public void applyMeter() {
		System.out.println("Meter Applied--> from Auto class");

	}
	public static void main(String[] args) {
		Auto obj =new Auto();
		obj.applyBreak();
		obj.applyMeter();
		obj.soundHorn();
}
}