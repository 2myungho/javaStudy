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

//Checked Exception 컴파일 시간에 검사하는 예외로서, 처리하지 않으면 컴파일 에러가 나므로 반드시 처리해야 한다. 처리 방법에는 try/catch 
//Unchecked Exception 런타임 시간에 검사하는 예외로서, 컴파일하는데 문제는 없지만 실행 중에 예외가 발생할 수 있다. 