
public class AuthApp3 {

	public static void main(String[] args) {
		//String[] users = {"myungho","myungho1","myungho2"};
		String[][] users = {
				{"myungho","1111"},
				{"myungho1","2222"},
				{"myungho2","3333"}
		};
		String inputId = args[0];
		String inputPass = args[1];
		
		boolean isLogined = false;
		for(int i = 0; i <users.length; i++) {
			String[] current = users[i];
			if(
					current[0].equals(inputId) &&
					current[1].equals(inputPass)
			) {
				isLogined = true;
				break;
			}
		}
		System.out.println("Hi, ");
		if(isLogined) {
			System.out.println("Master!!");
		}else {
			System.out.println("who ate you");
		}

	}

}
