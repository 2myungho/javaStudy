package inheritance.oo_workspace;

public class Student extends Person{

	private String major;
	
	//Contructor
	//default 생성자
	public Student() {
		
	}
	//생성자 Overloading
	//this: 현재 객체
	public Student(String id, String name, String major) {
		super(id, name); //부모클래스 생성자 호출
		this.major=major;
	}
	//Encapsulation
	
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor() {
		return this.major;
	}
	
//	public String toStudent() { //메소드의 다형성(메소드의 이름이 같을 때), 부모의 메소드 자식에서 재정의
//		return "id"+id+"name"+name+"\tmajor: "+major;
//	}
//	
	//부모클래스에서 구현한 메서드와 returntype, methodname, argumentlist 동일하게 구현만 다르게 재정의
	//사용자가 부모타입의 자식생성자로 객체의 override된 메서드를 호출하면 오버라이드된(재정의한) 자식 메소드가 응답함.
	@Override
	public String toString() { //메소드의 다형성(메소드의 이름이 같을 때), 부모의 메소드 자식에서 재정의
		return super.toString()+"\tmajor: "+major;
	}
}