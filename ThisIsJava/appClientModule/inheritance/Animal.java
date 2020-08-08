package inheritance;
//추상 클래스 , 추상메소드 sound에 따라 다른 결과 값
public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상메서드
	public abstract void sound();
}
