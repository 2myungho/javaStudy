package inheritance;
//��ü Ŭ����
public class SmartPhone extends Phone {
	//������
	public SmartPhone(String owner) {
		super(owner);
	}
	//�޼ҵ�
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
}