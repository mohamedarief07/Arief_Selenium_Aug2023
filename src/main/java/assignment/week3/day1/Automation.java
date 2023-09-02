package assignment.week3.day1;

public class Automation extends MultipleLangauge implements Language, TestTool {

	@Override
	public void Selenium() {
		System.out.println("Selenium --> from Automation class");

	}

	@Override
	public void Java() {
		System.out.println("Java --> from Automation class");

	}

	@Override
	public void ruby() {
		System.out.println("ruby --> from Automation class");

	}

	public static void main(String[] args) {
		
		Automation obj= new Automation();
		obj.Selenium();
		obj.Java();
		obj.ruby();
		obj.python();

	}

}
