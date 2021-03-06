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
		
		//메소드
		myCar.setGas(5); //car의 setGas() 메소드 호출
		boolean gasState = myCar.isLeftGas(); //Car의 isLeftGas() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run(); //Car의 run() 메소드 호출
		}

		if(myCar.isLeftGas()) { //Car의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
		
		//getter, setter
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		//멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
			System.out.println("현재 속도 : " + myCar.getSpeed());
		}
		
	}
}
