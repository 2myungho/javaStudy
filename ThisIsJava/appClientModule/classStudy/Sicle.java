package classStudy;

public class Sicle {
	//�ʵ�
	String company;
	String color;
	String model;
	int maxSpeed;
	
	//������
	Sicle(String company, String color, String model, int maxSpeed){
		this.company = company;
		this.color = color;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	//�޼ҵ�
	void setSpeed(int speed) {
		this.maxSpeed = speed;
	}

	boolean speed() {
		if(maxSpeed == 0) {
			System.out.println("�����Ű� ������ϴ�.");
			return false;
		}else {
			System.out.println("�����Ű� �޸��� �ֽ��ϴ�.");
			return true;
		}
	}
	void run() {
		while(true) {
			if(maxSpeed > 0) {
				System.out.println("�޸��ϴ�. speed : " + maxSpeed );
				maxSpeed -= 10;
			}else {
				System.out.println("����ϴ�. speed : " + maxSpeed);
				return;
			}
		}
	}
	
	
	
	
}
