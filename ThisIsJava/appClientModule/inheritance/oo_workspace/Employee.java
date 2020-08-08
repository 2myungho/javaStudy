package inheritance.oo_workspace;

public class Employee extends Person {
	private String department;
	
	public Employee() {}
	public Employee(String id, String name, String department) {
		super(id, name);
		this.department = department;
	}
	
	public void setDepartment(String department) {
		this.department=department;
	}
	public String getDepartment() {
		return this.department;
	}
	
//	public String toEmployee() {
//		return super.toString()+"\tdepartment: "+department;
//	}
	
	@Override
	public String toString() {
		return super.toString()+"\tdepartment: "+department;
	}
}
