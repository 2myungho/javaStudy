
public class ArrayApp {

	public static void main(String[] args) {
		//String users = "myungho, myungho1, myungho2";
		String[] users = new String[3];
		users[0] = "myungho";
		users[1] = "myungho1";
		users[2] = "myungho2";
		
		System.out.println(users[0]);
		System.out.println(users[1]);
		System.out.println(users[2]);
		System.out.println(users.length);
		
		int[] scores = {10,100,200};
		System.out.println(scores[1]);
	}

}
