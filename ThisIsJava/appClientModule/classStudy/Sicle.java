package classStudy;

public class Sicle {
	//필드
	String company;
	String color;
	String model;
	int maxSpeed;
	
	//생성자
	Sicle(String company, String color, String model, int maxSpeed){
		this.company = company;
		this.color = color;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	//메소드
	void setSpeed(int speed) {
		this.maxSpeed = speed;
	}

	boolean speed() {
		if(maxSpeed == 0) {
			System.out.println("자전거가 멈췄습니다.");
			return false;
		}else {
			System.out.println("자전거가 달리고 있습니다.");
			return true;
		}
	}
	void run() {
		while(true) {
			if(maxSpeed > 0) {
				System.out.println("달립니다. speed : " + maxSpeed );
				maxSpeed -= 10;
			}else {
				System.out.println("멈춥니다. speed : " + maxSpeed);
				return;
			}
		}
	}
	
	
	
	
}
