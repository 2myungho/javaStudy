package classStudy;

public class Car {
	//�ʵ�
	String company = "���� �ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������1
	Car(){
		
	}
	//������2
	Car(String model){
		this(model, "����" , 250);
	}
	// ������3
	Car(String model,String color){
		this(model, color, 250);
	}
	//������4 ���� �����ڵ� p213
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//�ʵ�
	int gas;
	//�޼ҵ�
	void setGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false; //gas�ʵ� ���� 0�̸� false��
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true; //gas ���� 0�� �ƴϸ� true�� ����
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�. (gas�ܷ�:" + gas + ")");
				gas -=1;
			}else {
				System.out.println("����ϴ�. (gas�ܷ�:" + gas + ")");
				return; //�޼ҵ� ���� ����
			}
		}
	}
}

/* �ߺ� �ڵ尡 ���� �� ���� ���� ���
public class Car {
	//�ʵ�
	String company = "���� �ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������1
	Car(){
		
	}
	//������2
	Car(String model){
		this.model = model;
	}
	// ������3
	Car(String model,String color){
		this.model = model;
		this.color = color;
	}
	//������4
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

 */


