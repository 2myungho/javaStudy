//������ �Է¹޾� �״�� ����ϱ�, ���ڿ� �ɰ��� StringTokenizer ���ڿ��� ���ڷ� ��ȯ��Ű�� ��� Integer.parseInt()
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
