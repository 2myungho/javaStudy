package classStudy;

public class SicleExample {

	public static void main(String[] args) {
		Sicle mySicle = new Sicle("��õ��","������","���̺긮�� ������",500);
		System.out.println("mySicle : " + mySicle.company);
		System.out.println("mySicle : " + mySicle.color);
		System.out.println("mySicle : " + mySicle.model);
		System.out.println("mySicle : " + mySicle.maxSpeed);
		
		//�޼ҵ�
		mySicle.setSpeed(200);
		boolean speed = mySicle.speed();
		if(speed) {
			System.out.println("��� �޸��ϴ�.");
			mySicle.run();
		}else {
			System.out.println("����ϴ�.");
		}
		if(mySicle.speed()) {
			System.out.println("�ӵ��� ���� �پ��ϴ�.");
		}else {
			System.out.println("�ٽ� ����� �غ� �ϼ���");
		}
	}

}
