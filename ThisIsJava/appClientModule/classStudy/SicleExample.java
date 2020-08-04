package classStudy;

public class SicleExample {

	public static void main(String[] args) {
		Sicle mySicle = new Sicle("삼천리","빨간색","하이브리드 자전거",500);
		System.out.println("mySicle : " + mySicle.company);
		System.out.println("mySicle : " + mySicle.color);
		System.out.println("mySicle : " + mySicle.model);
		System.out.println("mySicle : " + mySicle.maxSpeed);
		
		//메소드
		mySicle.setSpeed(200);
		boolean speed = mySicle.speed();
		if(speed) {
			System.out.println("계속 달립니다.");
			mySicle.run();
		}else {
			System.out.println("멈춥니다.");
		}
		if(mySicle.speed()) {
			System.out.println("속도가 점점 줄어듭니다.");
		}else {
			System.out.println("다시 출발할 준비를 하세요");
		}
	}

}
