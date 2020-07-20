
public class ExceptionApp {
	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = {10,20,30};
		
		try {
			System.out.println(scores[3]);
			System.out.println(2/0);
		} catch(Exception e) {
			System.out.println("오류가 발생했네요" + e.getMessage());
		} //예외에는 부모 자식 관계가 있다. 부모 예외로 한 번에 처리할 수 있다.

		System.out.println(3);
	}

}

// error는 어쩔 수 없는 거
//exception 은 내가 잘하면 해결할 수 있는 거