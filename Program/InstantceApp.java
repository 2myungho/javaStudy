import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstantceApp {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();

	}

}

//Ŭ������ ���� ����� Ŭ������ �ν���Ʈ�μ� Ȱ���ϱ� ���Ѵٸ� ����Ʈ���͸� ����Ѵ�. ex)PrintWriter 
//�׳� ���Ϸ� ����ϴ� Ŭ���� ex)Math

//���� ��Ӱ��迡 �ִ� class�� �⺻������ �θ� class�� Ŭ�������� ����� �� �ְ� ����ڰ� �ʿ��ϴٸ� ���� class���� ��� �޴� ���� �ƴ϶� ������ �����Ͽ� Ŭ������ ����� ����� �� �ִ�.