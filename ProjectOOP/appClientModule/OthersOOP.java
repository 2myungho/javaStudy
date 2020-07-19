import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
	//class : system , math, fileWriter
	//instance : f1, f2
	public static void main(String[] args) throws IOException {
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(18.8));
		
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		f1.write("Java");
		f1.close();
		
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello");
		f2.write("Java2");
		f2.close();
	}

}
