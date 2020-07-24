//연월일 입력받아 그대로 출력하기, 문자열 쪼개기 StringTokenizer 문자열을 숫자로 변환시키는 방법 Integer.parseInt()
import java.util.*;
import java.util.StringTokenizer;
public class CodeUp19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		sc.close();
		StringTokenizer token = new StringTokenizer(a , ".");
	
		String[] array = new String[3];
		String tk;
		for(int i = 0; i<3; i++) {
			tk = token.nextToken();
			array[i] = tk;
		}
		int y = Integer.parseInt(array[0]);
		int m = Integer.parseInt(array[1]);
		int d = Integer.parseInt(array[2]);
		
		System.out.printf("%04d.%02d.%02d",y,m,d);
	}
}
