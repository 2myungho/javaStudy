package classStudy;
//�⺻ �޼ҵ�
public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : " + result1);
		
		byte x =10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2);
		
		myCalc.powerOff();
		
		//Ŭ���� ���ο��� �޼ҵ� ȣ��`
		myCalc.execute();
		
		//���� ��� ���
		double result3 = 10 * 10 * Calculator.pi;
		int result4 = Calculator.plus3(10, 5);
		int result5 = Calculator.minus(10, 5);
		
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
	}
}
