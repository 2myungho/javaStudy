
public class ExceptionApp {
	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = {10,20,30};
		
		try {
			System.out.println(scores[3]);
			System.out.println(2/0);
		} catch(Exception e) {
			System.out.println("������ �߻��߳׿�" + e.getMessage());
		} //���ܿ��� �θ� �ڽ� ���谡 �ִ�. �θ� ���ܷ� �� ���� ó���� �� �ִ�.

		System.out.println(3);
	}

}

// error�� ��¿ �� ���� ��
//exception �� ���� ���ϸ� �ذ��� �� �ִ� ��