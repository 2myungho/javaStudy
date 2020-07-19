public class MyOOP {
	public static void main(String[] args) {
		Print P1 = new Print();
		P1.delimiter = "****";
		P1.A();
		P1.A();
		P1.B();
		P1.B();
		
		Print P2 = new Print();
		P2.delimiter = "----";
		P2.A();
		P2.A();
		P2.B();
		P2.B();
		
		P1.A();
		P2.A();
		P1.A();
		P2.A();
	}
}

//method가 instance를 참조할 때 static 제거