package org.system;



public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("desktopSize--> from Desktop class");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop obj =new Desktop();
		obj.computerModel();
		obj.desktopSize();

	}

}
