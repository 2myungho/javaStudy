package inheritance;

public class TestExample {

	public static void main(String[] args) {
		Test test = new Test(6,"테스트테스트");
		
		if(test.abc() == true) {
			System.out.println("abc()메소드도 실행이 될 것이여");
		}else {
			System.out.println("abc()메소드도 실행이 될 것이여");
		}

	}

}
