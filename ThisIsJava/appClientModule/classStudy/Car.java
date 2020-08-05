package classStudy;

public class Car {
	//필드
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자1
	Car(){
		
	}
	//생성자2
	Car(String model){
		this(model, "은색" , 250);
	}
	// 생성자3
	Car(String model,String color){
		this(model, color, 250);
	}
	//생성자4 공통 실행코드 p213
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//필드
	int gas;
	//메소드
	void setGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false; //gas필드 값이 0이면 false를
		}
		System.out.println("gas가 있습니다.");
		return true; //gas 값이 0이 아니면 true를 리턴
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas잔량:" + gas + ")");
				gas -=1;
			}else {
				System.out.println("멈춥니다. (gas잔량:" + gas + ")");
				return; //메소드 실행 종료
			}
		}
	}
	
	//Getter와 Setter 메소드 선언
	//필드
	private int speed;
	private boolean stop;
	
	//생성자
	
	//메소드
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			System.out.println("멈춥니다.");
			return;
		}else {
			this.speed = speed;
			System.out.println("달리고 있습니다.");
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}

/* 중복 코드가 많은 때 위에 내용 사용
public class Car {
	//필드
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자1
	Car(){
		
	}
	//생성자2
	Car(String model){
		this.model = model;
	}
	// 생성자3
	Car(String model,String color){
		this.model = model;
		this.color = color;
	}
	//생성자4
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

 */


