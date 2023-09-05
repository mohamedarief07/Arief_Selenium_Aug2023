package assignment.week3.day2;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("passing id argument alone: "+id);

	}

	public void getStudentInfo(int id, String name) {
		System.out.println("passing by id & name argument: "+id+" and "+name );

	}

	public void getStudentInfo(long phoneNumber, String email) {
		System.out.println("passing by id & name argument : "+phoneNumber+ " and " +email);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj=new Students();
		obj.getStudentInfo(2616);
		obj.getStudentInfo(2116, "Arief");
		obj.getStudentInfo(9789883880l, "test@gmail.com");
		
	}

}
