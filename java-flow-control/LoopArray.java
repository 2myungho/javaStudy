
public class LoopArray {

	public static void main(String[] args) {
		
		/*
		 * <li>myungho</li>
		 * <li>myungho1</li>
		 * <li>myungho2</li>
		 */
		
		String[] users = new String[3];
		users[0] = "myungho";
		users[1] = "myungho1";
		users[2] = "myungho2";
		
		for(int i = 0; i<users.length; i++) {
			System.out.println("<li>" + users[i]  + "</li>");
		}

	}

}
