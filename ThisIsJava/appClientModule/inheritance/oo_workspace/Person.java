package inheritance.oo_workspace;

//abstract class: �ڽ�Ŭ������ �����ϱ� ���� Ÿ������ ����
//�׷��� ���� ��ü ���� �Ұ�, Person p = new Person(); �θ��� ���� �߻�
//interface: ���ǥ���� �����ϱ� ���� ��������  �����  ���� ���� abstract �޼���θ� ����
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
