package assignment.week3.day2;



public class AxisBank extends BankInfo {
	

	
	public void deposit() {
		System.out.println("deposit is diff-> from AxisBank class");
		super.deposit();
		//this.deposit();
	}
	
	public static void main(String[] args) {
		AxisBank obj= new AxisBank();
		obj.deposit();
		
		
		//super.deposit();
		
	}



}
