package inheritance.oo_workspace;

public class Student extends Person{

	private String major;
	
	//Contructor
	//default ������
	public Student() {
		
	}
	//������ Overloading
	//this: ���� ��ü
	public Student(String id, String name, String major) {
		super(id, name); //�θ�Ŭ���� ������ ȣ��
		this.major=major;
	}
	//Encapsulation
	
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor() {
		return this.major;
	}
	
//	public String toStudent() { //�޼ҵ��� ������(�޼ҵ��� �̸��� ���� ��), �θ��� �޼ҵ� �ڽĿ��� ������
//		return "id"+id+"name"+name+"\tmajor: "+major;
//	}
//	
	//�θ�Ŭ�������� ������ �޼���� returntype, methodname, argumentlist �����ϰ� ������ �ٸ��� ������
	//����ڰ� �θ�Ÿ���� �ڽĻ����ڷ� ��ü�� override�� �޼��带 ȣ���ϸ� �������̵��(��������) �ڽ� �޼ҵ尡 ������.
	@Override
	public String toString() { //�޼ҵ��� ������(�޼ҵ��� �̸��� ���� ��), �θ��� �޼ҵ� �ڽĿ��� ������
		return super.toString()+"\tmajor: "+major;
	}
}