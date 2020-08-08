package inheritance.oo_workspace;

public class Instructor extends Person {
	private String subject;
	
	public Instructor() {}
	public Instructor(String id, String name, String subject) {
		super(id,name);
		this.subject = subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return this.subject;
	}
//	public String toInstructor() {
//		return super.toString()+"\tSubject: "+subject;
//	}
	@Override
	public String toString() {
		return super.toString()+"\tSubject: "+subject;
	}
}
