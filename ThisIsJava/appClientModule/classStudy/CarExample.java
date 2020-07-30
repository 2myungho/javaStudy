package classStudy;

public class CarExample {

	public static void main(String[] args) {
		//객체(인스턴스)생성
		Car myCar = new Car();
		//필드 값 읽기
		System.out.println("myCar.company : " + myCar.company);
		
		Car myCar2 = new Car("자가용");
		System.out.println("myCar2.company : " + myCar2.company);
		System.out.println("myCar2.model : " + myCar2.model);
		
		Car myCar3 = new Car("자가용","빨강");
		System.out.println("myCar3.company : " + myCar3.company);
		System.out.println("myCar3.model : " + myCar3.model);
		System.out.println("myCar3.color : " + myCar3.color);
		
		Car myCar4 = new Car("택시","검정",200);
		System.out.println("myCar4.company : " + myCar4.company);
		System.out.println("myCar4.model : " + myCar4.model);
		System.out.println("myCar4.color : " + myCar4.color);
		System.out.println("myCar4.maxSpeed : " + myCar4.maxSpeed);
	}

}
