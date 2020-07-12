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

//클래스를 만들 사람이 클래스를 인스턴트로서 활용하길 원한다면 컨스트럭터를 사용한다. ex)PrintWriter 
//그냥 단일로 사용하는 클래스 ex)Math

//하위 상속관계에 있는 class는 기본적으로 부모 class의 클래스들을 사용할 수 있고 사용자가 필요하다면 상위 class에서 상속 받는 것이 아니라 스스로 정의하여 클래스를 만들어 사용할 수 있다.