package classStudy;

public class CarExample {

	public static void main(String[] args) {
		//��ü(�ν��Ͻ�)����
		Car myCar = new Car();
		//�ʵ� �� �б�
		System.out.println("myCar.company : " + myCar.company);
		
		Car myCar2 = new Car("�ڰ���");
		System.out.println("myCar2.company : " + myCar2.company);
		System.out.println("myCar2.model : " + myCar2.model);
		
		Car myCar3 = new Car("�ڰ���","����");
		System.out.println("myCar3.company : " + myCar3.company);
		System.out.println("myCar3.model : " + myCar3.model);
		System.out.println("myCar3.color : " + myCar3.color);
		
		Car myCar4 = new Car("�ý�","����",200);
		System.out.println("myCar4.company : " + myCar4.company);
		System.out.println("myCar4.model : " + myCar4.model);
		System.out.println("myCar4.color : " + myCar4.color);
		System.out.println("myCar4.maxSpeed : " + myCar4.maxSpeed);
	}

}
