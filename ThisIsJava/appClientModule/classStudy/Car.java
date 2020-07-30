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