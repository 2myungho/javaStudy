class Accounting{
	public  double valueOfSupply;
	public  double vatRate;
	public  double expenseRate;
	
	public  void print() {
		System.out.println("Value of supply : " + valueOfSupply);             
		System.out.println("VAT : " + getVAT());                                                 
		System.out.println("Total : " + getTotal());                               
		System.out.println("Expense : " + getExpense()); 
		System.out.println("Income : " + getIncom());                   
		System.out.println("Dividend1 : " + getDiviend1());
		System.out.println("Dividend2 : " + getDiviend2());                       
		System.out.println("Dividend3 : " + getDiviend3());
	}
	public double getDiviend1() {
		return getIncom() *0.5;
	}
	public double getDiviend2() {
		return getIncom() *0.3;
	}
	public double getDiviend3() {
		return getIncom() *0.2;
	}
	public double getIncom() {
		return valueOfSupply - getExpense();
	}
	public double getExpense() {
		return valueOfSupply *expenseRate;
	}
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
	public double getVAT() {
		return valueOfSupply*vatRate;
	}         
}

public class AccountingClassApp {	
	public static void main(String[] args) {
		//Accounting1.valueOfSupply = 10000.0;
		//Accounting1.vatRate = 0.1;                                               
		//Accounting1.expenseRate = 0.3;                                                      		
		//Accounting1.print();
		//
		//Accounting2.valueOfSupply = 20000.0;
		//Accounting2.vatRate = 0.1;                                               
		//Accounting2.expenseRate = 0.3;                                                      		
		//Accounting2.print();   
		//
		//Accounting3.valueOfSupply = 30000.0;
		//Accounting3.vatRate = 0.1;                                               
		//Accounting3.expenseRate = 0.3;                                                      		
		//Accounting3.print();
		
		//instant
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.1;
		a2.expenseRate = 0.3;
		
		Accounting a3 = new Accounting();
		a3.valueOfSupply = 30000.0;
		a3.vatRate = 0.1;
		a3.expenseRate = 0.3;
		
		a1.print();
		a2.print();
		a3.print();
	}
}
	                                                                             

// 메소드는 서로 연괸된 코드를 모아서 그룹핑해서 이름을 붙이는 정리 정돈의 상자이다.
//클래스란 서로 연관된 변수, 메소드를 묶어 놓아 이름을 붙여 정리해 놓은 상자이다.
//클래스를 사용하는 이유는 
//- 여러 다른 종류의 변수/메소드들이 혼재되어 있어도 '클래스 소속'을 밝혀주면 각 멤버들의 성격을 한눈에 파악할 수 있음
//- 구현되어있는 변수,메소드들을 메인 스크립트에 다 적어줄 필요 없이, 클래스로 만들어 따로 빼놓고 필요한 부분에 클래스명.변수/메소드 식으로 바로 호출해 쓸 수 있어 편리함.

//인스턴스는 하나의 클래스를 복제해서 서로 다른 데이터의 값과 서로 같은 메소드를 가진 복제본이다.