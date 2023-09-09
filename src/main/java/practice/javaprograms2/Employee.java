package practice.javaprograms2;

public class Employee {
	
	
	private int EmpID;
	private String Name;
	private String Dept;
	public Employee(int empID, String name, String dept) {
		super();
		EmpID = empID;
		Name = name;
		Dept = dept;
	}
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [EmpID=" + EmpID + ", Name=" + Name + ", Dept=" + Dept + "]";
	}

}
	