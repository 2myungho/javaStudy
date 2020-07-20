import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {
	public static void main(String[] args) {
		try {
			FileWriter f = new FileWriter("data.txt");
			f.write("Hello");
			f.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}

//Checked Exception ������ �ð��� �˻��ϴ� ���ܷμ�, ó������ ������ ������ ������ ���Ƿ� �ݵ�� ó���ؾ� �Ѵ�. ó�� ������� try/catch 
//Unchecked Exception ��Ÿ�� �ð��� �˻��ϴ� ���ܷμ�, �������ϴµ� ������ ������ ���� �߿� ���ܰ� �߻��� �� �ִ�. 