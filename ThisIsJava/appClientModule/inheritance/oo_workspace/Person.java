package inheritance.oo_workspace;

//abstract class: 자식클래스를 관라하기 위한 타입제공 목적
//그래서 실제 객체 생성 불가, Person p = new Person(); 부르면 에러 발생
//interface: 사용표준을 제공하기 위한 목적으로  상수와  구현 없는 abstract 메서드로만 구성
public class Person {
	private String id;
	private String name;
	
	public Person() {}
	
	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public String toString() {
		return "id: "+id+"\tname: "+name;
	}
	
}
