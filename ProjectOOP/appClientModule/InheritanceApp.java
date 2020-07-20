class Cal{
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	// OverLoading
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1,v2) +v3; //this는 자기 자신을 가리킨다. Overloading의 기존 매서드를 가리킨다 v1 +v2
	}
}
class Cal2 extends Cal{
	public int minus(int v1, int v2) {
		return v1 - v2;
	}
	//Overriding
	public int sum(int v1, int v2) {
		System.out.println("myungho");
		return super.sum(v1,v2);  //super은 부모 //부모 클래스인 Cal의 sum을 받아온다.
	}
}
public class InheritanceApp {
	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(1, 2));
		System.out.println(c.sum(2, 1, 2));
		
		Cal2 c2 = new Cal2();
		System.out.println(c2.minus(5, 6));
		System.out.println(c2.sum(2,5));
		
	}
}

// overriding : 부모 클래스의 기능을 올라타서 덮어쓰기, 재정의
// overloading : 과적하다. 탑재하다. 기존 클래스의 기능을 더한다.